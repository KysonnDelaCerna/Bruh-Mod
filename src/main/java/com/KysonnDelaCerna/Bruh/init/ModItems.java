package com.KysonnDelaCerna.Bruh.init;

import java.util.List;
import com.KysonnDelaCerna.Bruh.items.ItemBase;
import com.KysonnDelaCerna.Bruh.items.tools.ToolAxe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolHoe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolPickaxe;
import com.KysonnDelaCerna.Bruh.items.tools.ToolSpade;
import com.KysonnDelaCerna.Bruh.items.tools.ToolSword;
import java.util.ArrayList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// MATERIALS
	public static final ToolMaterial MATERIAL_DEANIUM = EnumHelper.addToolMaterial("material_deanium", 3, 1874, 6.5f, 3.0f, 15).setRepairItem(new ItemStack(ModItems.DEANIUM_INGOT, 1));
	
	// ITEMS
	public static final Item DEANIUM_INGOT = new ItemBase("deanium_ingot");
	public static final Item DEANIUM_MIX = new ItemBase("deanium_mix");
	
	// TOOLS
	public static final ItemSword DEANIUM_SWORD = new ToolSword("deanium_sword", MATERIAL_DEANIUM);
	public static final ItemSpade DEANIUM_SHOVEL = new ToolSpade("deanium_shovel", MATERIAL_DEANIUM);
	public static final ItemPickaxe DEANIUM_PICKAXE = new ToolPickaxe("deanium_pickaxe", MATERIAL_DEANIUM);
	public static final ItemAxe DEANIUM_AXE = new ToolAxe("deanium_axe", MATERIAL_DEANIUM);
	public static final ItemHoe DEANIUM_HOE = new ToolHoe("deanium_hoe", MATERIAL_DEANIUM);
}
