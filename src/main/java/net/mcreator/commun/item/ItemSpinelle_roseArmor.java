
package net.mcreator.commun.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.commun.ElementsCommunMod;

@ElementsCommunMod.ModElement.Tag
public class ItemSpinelle_roseArmor extends ElementsCommunMod.ModElement {
	@GameRegistry.ObjectHolder("commun:spinelle_rose_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("commun:spinelle_rose_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("commun:spinelle_rose_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("commun:spinelle_rose_armorboots")
	public static final Item boots = null;
	public ItemSpinelle_roseArmor(ElementsCommunMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SPINELLE_ROSE_ARMOR", "commun:spinelle_rose", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("spinelle_rose_armorhelmet")
				.setRegistryName("spinelle_rose_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("spinelle_rose_armorbody")
				.setRegistryName("spinelle_rose_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("spinelle_rose_armorlegs")
				.setRegistryName("spinelle_rose_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("spinelle_rose_armorboots")
				.setRegistryName("spinelle_rose_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("commun:spinelle_rose_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("commun:spinelle_rose_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("commun:spinelle_rose_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("commun:spinelle_rose_armorboots", "inventory"));
	}
}
