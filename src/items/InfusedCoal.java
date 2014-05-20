package com.kmatter.items;

import java.util.List;

import com.kmatter.KConfig;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class InfusedCoal extends Item {
	public Icon[] icons;
	public String[] textureNames = new String[] { "infusedcoal" };

	public InfusedCoal(int par1) {
		super(par1);
		this.setHasSubtypes(true);
		setCreativeTab(com.kmatter.KMatter.tabCustom);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIconFromDamage(int meta) {
		return icons[meta];
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.icons = new Icon[textureNames.length];

		for (int i = 0; i < this.icons.length; ++i) {
			this.icons[i] = iconRegister.registerIcon("kmatter:infusedcoal");
		}
	}

}