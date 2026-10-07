package com.cookiecraftmods.farmhousedecorations;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;
import java.util.Objects;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModTabs;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModSounds;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModItems;
import com.cookiecraftmods.farmhousedecorations.init.FarmhouseDecorationsModBlocks;

public class FarmhouseDecorationsMod implements net.fabricmc.api.ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger(FarmhouseDecorationsMod.class);
	public static final String MODID = "farmhouse_decorations";

	public void onInitialize() {
		FarmhouseDecorationsModSounds.init();
		FarmhouseDecorationsModBlocks.init();
		FarmhouseDecorationsModItems.init();
		FarmhouseDecorationsModTabs.init();
		ServerTickEvents.END_SERVER_TICK.register(server -> tick());
	}

	private static final Queue<ScheduledWork> WORK_QUEUE = new ConcurrentLinkedQueue<>();

	private static final class ScheduledWork {
		private int ticks;
		private final Runnable action;

		private ScheduledWork(int ticks, Runnable action) {
			this.ticks = Math.max(0, ticks);
			this.action = Objects.requireNonNull(action, "action");
		}
	}

	public static void queueServerWork(int delay, Runnable action) {
		WORK_QUEUE.add(new ScheduledWork(delay, action));
	}

	private void tick() {
		ScheduledWork work;
		while ((work = WORK_QUEUE.poll()) != null) {
			if (--work.ticks <= 0) {
				work.action.run();
			} else {
				WORK_QUEUE.add(work);
			}
		}
	}
}
