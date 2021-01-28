
package net.mcreator.commun.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.commun.item.ItemTest2;
import net.mcreator.commun.block.BlockTest2Ore;
import net.mcreator.commun.ElementsCommunMod;

@ElementsCommunMod.ModElement.Tag
public class RecipeTest2OreSmelting extends ElementsCommunMod.ModElement {
	public RecipeTest2OreSmelting(ElementsCommunMod instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTest2Ore.block, (int) (1)), new ItemStack(ItemTest2.block, (int) (1)), 0.7F);
	}
}
