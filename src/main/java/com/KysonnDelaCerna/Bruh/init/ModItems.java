package com.KysonnDelaCerna.Bruh.init;

import java.util.List;
import com.KysonnDelaCerna.Bruh.items.ItemBase;
import com.KysonnDelaCerna.Bruh.items.armor.ArmorBase;
import com.KysonnDelaCerna.Bruh.items.tools.ToolAxe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolHoe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolPickaxe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolSpade;
import com.KysonnDelaCerna.Bruh.items.tools.ToolSword;
import com.KysonnDelaCerna.Bruh.util.Reference;
import java.util.ArrayList;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// MATERIALS
	public static final ToolMaterial TOOL_MATERIAL_DEANIUM = EnumHelper.addToolMaterial("tool_material_deanium", 3, 1874, 6.5f, 3.0f, 15).setRepairItem(new ItemStack(ModItems.DEANIUM_INGOT, 1));
	public static final ArmorMaterial ARMOR_MATERIAL_DEANIUM = EnumHelper.addArmorMaterial("armor_material_deanium", Reference.MOD_ID + ":deanium", 40, new int[] {3,5,7,3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f);
	
	// ITEMS
	public static final Item DEANIUM_INGOT = new ItemBase("deanium_ingot");
	public static final Item DEANIUM_MIX = new ItemBase("deanium_mix");
	public static final Item CHANN_ASH = new ItemBase("chann_ash");
	public static final Item RYCHANNITE_ROD = new ItemBase("rychannite_rod");
	public static final Item RY_FIBER = new ItemBase("ry_fiber");
	
	// TOOLS
	public static final ItemSword DEANIUM_SWORD = new ToolSword("deanium_sword", TOOL_MATERIAL_DEANIUM);
	public static final ItemSpade DEANIUM_SHOVEL = new ToolSpade("deanium_shovel", TOOL_MATERIAL_DEANIUM);
	public static final ItemPickaxe DEANIUM_PICKAXE = new ToolPickaxe("deanium_pickaxe", TOOL_MATERIAL_DEANIUM);
	public static final ItemAxe DEANIUM_AXE = new ToolAxe("deanium_axe", TOOL_MATERIAL_DEANIUM);
	public static final ItemHoe DEANIUM_HOE = new ToolHoe("deanium_hoe", TOOL_MATERIAL_DEANIUM);
	
	// ARMOR
	public static final Item DEANIUM_HELMET = new ArmorBase("deanium_helmet", ARMOR_MATERIAL_DEANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item DEANIUM_CHESTPLATE = new ArmorBase("deanium_chestplate", ARMOR_MATERIAL_DEANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item DEANIUM_LEGGINGS = new ArmorBase("deanium_leggings", ARMOR_MATERIAL_DEANIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item DEANIUM_BOOTS = new ArmorBase("deanium_boots", ARMOR_MATERIAL_DEANIUM, 1, EntityEquipmentSlot.FEET);
}
