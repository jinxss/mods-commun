
package net.mcreator.commun.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.commun.item.ItemSpinelle_rose;
import net.mcreator.commun.block.BlockSpinelle_roseOre;
import net.mcreator.commun.ElementsCommunMod;

@ElementsCommunMod.ModElement.Tag
public class RecipeSpinelle_roseOreSmelting extends ElementsCommunMod.ModElement {
	public RecipeSpinelle_roseOreSmelting(ElementsCommunMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSpinelle_roseOre.block, (int) (1)), new ItemStack(ItemSpinelle_rose.block, (int) (1)), 0.7F);
	}
}
