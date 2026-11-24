package net.mcreator.vampirismandelseplanes.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.vampirismandelseplanes.network.VampirismandelseplanesModVariables;

public class VampburningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().isRaining() == false && (world instanceof Level _lvl1 && _lvl1.isDay()) == true && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) == true) {
			{
				VampirismandelseplanesModVariables.PlayerVariables _vars = entity.getData(VampirismandelseplanesModVariables.PLAYER_VARIABLES);
				_vars.VampBurn = true;
				_vars.markSyncDirty();
			}
		} else {
			{
				VampirismandelseplanesModVariables.PlayerVariables _vars = entity.getData(VampirismandelseplanesModVariables.PLAYER_VARIABLES);
				_vars.VampBurn = false;
				_vars.markSyncDirty();
			}
		}
	}
}