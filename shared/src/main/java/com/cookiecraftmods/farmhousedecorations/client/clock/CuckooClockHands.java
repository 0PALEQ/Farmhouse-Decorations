package com.cookiecraftmods.farmhousedecorations.client.clock;

import com.cookiecraftmods.eqlib.core.clock.ClockHandMesh;
import java.io.Reader;

/** Geometry is relative to the center of the model's pointers_center cube. */
public final class CuckooClockHands {
    public final double pivotX, pivotY, pivotZ;
    private final ClockHandMesh[] hands;

    private CuckooClockHands(double x, double y, double z, ClockHandMesh[] hands) {
        pivotX = x; pivotY = y; pivotZ = z; this.hands = hands;
    }

    public ClockHandMesh hand(int index) { return hands[index]; }

    public static CuckooClockHands read(Reader reader) {
            var model = com.google.gson.JsonParser.parseReader(reader).getAsJsonObject();
            var elements = model.getAsJsonArray("elements");
            com.google.gson.JsonObject center = null;
            for (var entry : elements) {
                var element = entry.getAsJsonObject();
                if (element.has("name") && element.get("name").getAsString().equals("pointers_center")) center = element;
            }
            if (center == null) throw new IllegalStateException("Missing pointers_center cube");
            var pivot = new com.google.gson.JsonArray();
            for (int axis = 0; axis < 3; axis++) pivot.add((center.getAsJsonArray("from").get(axis).getAsDouble()
                    + center.getAsJsonArray("to").get(axis).getAsDouble()) / 2);
            double pivotX = pivot.get(0).getAsDouble() / 16;
            double pivotY = pivot.get(1).getAsDouble() / 16;
            double pivotZ = pivot.get(2).getAsDouble() / 16;
            String[] names = {"pointer_hour", "pointer_minute"};
            ClockHandMesh[] hands = new ClockHandMesh[2];
            for (int hand = 0; hand < 2; hand++) {
                for (var entry : elements) {
                    var element = entry.getAsJsonObject();
                    if (element.has("name") && element.get("name").getAsString().equals(names[hand])) {
                        element.getAsJsonObject("rotation").add("origin", pivot.deepCopy());
                    }
                }
                hands[hand] = ClockHandMesh.read(new java.io.StringReader(model.toString()), names[hand]);
            }
            return new CuckooClockHands(pivotX, pivotY, pivotZ, hands);
    }
}
