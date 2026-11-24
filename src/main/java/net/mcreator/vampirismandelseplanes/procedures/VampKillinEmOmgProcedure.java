package net.mcreator.vampirismandelseplanes.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.vampirismandelseplanes.network.VampirismandelseplanesModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VampKillinEmOmgProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity.getData(VampirismandelseplanesModVariables.PLAYER_VARIABLES).Vampirism == true) {
			if (sourceentity instanceof Player _player)
				_player.getFoodData().setFoodLevel((int) ((sourceentity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2d));
		}
	}
}