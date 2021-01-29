
package net.mcreator.commun.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.commun.item.ItemPyrope;
import net.mcreator.commun.block.BlockPyropeOre;
import net.mcreator.commun.ElementsCommunMod;

@ElementsCommunMod.ModElement.Tag
public class RecipePyropeOreSmelting extends ElementsCommunMod.ModElement {
	public RecipePyropeOreSmelting(ElementsCommunMod instance) {
		super(instance, 27);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockPyropeOre.block, (int) (1)), new ItemStack(ItemPyrope.block, (int) (1)), 0.7F);
	}
}
