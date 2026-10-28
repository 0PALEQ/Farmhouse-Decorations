import com.cookiecraftmods.eqlib.core.clock.ClockTime;
import com.cookiecraftmods.farmhousedecorations.client.clock.CuckooClockHands;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.StringReader;

/** Run with verify-clock.ps1; uses the same mesh parser as the game renderer. */
public final class ClockHandsTest {
    private static void close(double expected, double actual) {
        if (Math.abs(expected - actual) > 0.00001) throw new AssertionError(expected + " != " + actual);
    }

    public static void main(String[] args) throws Exception {
        Path models = Path.of(args[0]);
        JsonObject model;
        try (var reader = Files.newBufferedReader(models.resolve("custom/cuckoo-clock.json"))) {
            model = JsonParser.parseReader(reader).getAsJsonObject();
        }
        var hands = CuckooClockHands.read(new StringReader(model.toString()));
        close(8.0 / 16, hands.pivotX);
        close(11.0 / 16, hands.pivotY);
        close(13.5 / 16, hands.pivotZ);
        for (int hand = 0; hand < 2; hand++) {
            if (hands.hand(hand).vertices().size() != 24) throw new AssertionError("Missing hand faces");
            for (var vertex : hands.hand(hand).vertices()) {
                if (!Float.isFinite(vertex.x()) || !Float.isFinite(vertex.y())) throw new AssertionError("Invalid mesh");
            }
        }
        // Moving the axle must move the local mesh in the opposite direction,
        // preserving world geometry before rotation. The edit origin is unrelated.
        var elements = model.getAsJsonArray("elements");
        for (var entry : elements) {
            var cube = entry.getAsJsonObject();
            if (cube.has("name") && cube.get("name").getAsString().equals("pointers_center")) {
                for (String key : new String[]{"from", "to"}) {
                    var vector = cube.getAsJsonArray(key);
                    vector.set(0, new com.google.gson.JsonPrimitive(vector.get(0).getAsDouble() + 2));
                }
            }
        }
        var shifted = CuckooClockHands.read(new StringReader(model.toString()));
        close(hands.pivotX + 2.0 / 16, shifted.pivotX);
        close(hands.hand(0).vertices().get(0).x() - 2.0 / 16, shifted.hand(0).vertices().get(0).x());
        close(180, ClockTime.hourAngle(0)); // Minecraft starts at 06:00.
        close(0, ClockTime.hourAngle(6000));
        close(180, ClockTime.hourAngle(12000));
        close(0, ClockTime.hourAngle(18000));
        close(90, ClockTime.minuteAngle(250));
        close(0, ClockTime.minuteAngle(1000));
        close(ClockTime.hourAngle(23999), ClockTime.hourAngle(-1));
        JsonObject body;
        try (var reader = Files.newBufferedReader(models.resolve("custom/cuckoo-clock-body.json"))) {
            body = JsonParser.parseReader(reader).getAsJsonObject();
        }
        if (body.getAsJsonArray("elements").size() != elements.size() - 2) throw new AssertionError("Static hand duplication");
        for (var entry : body.getAsJsonArray("elements")) {
            var cube = entry.getAsJsonObject();
            if (cube.has("name") && cube.get("name").getAsString().startsWith("pointer_")) throw new AssertionError("Static hand duplication");
        }
        System.out.println("Clock geometry, axle, day-time angles, and static-model checks passed.");
    }
}
