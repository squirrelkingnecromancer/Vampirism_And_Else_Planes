/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vampirismandelseplanes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.vampirismandelseplanes.item.MysteriousVialItem;
import net.mcreator.vampirismandelseplanes.VampirismandelseplanesMod;

public class VampirismandelseplanesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(VampirismandelseplanesMod.MODID);
	public static final DeferredItem<Item> MYSTERIOUS_VIAL;
	static {
		MYSTERIOUS_VIAL = REGISTRY.register("mysterious_vial", MysteriousVialItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}