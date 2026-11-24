package net.mcreator.vampirismandelseplanes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.vampirismandelseplanes.network.VampirismandelseplanesModVariables;

public class MysteriousVialPlayerFinishesSippingMmmYumProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 50);
		{
			VampirismandelseplanesModVariables.PlayerVariables _vars = entity.getData(VampirismandelseplanesModVariables.PLAYER_VARIABLES);
			_vars.Vampirism = true;
			_vars.markSyncDirty();
		}
	}
}