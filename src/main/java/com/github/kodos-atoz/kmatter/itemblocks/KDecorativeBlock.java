package com.kmatter.itemblocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class KDecorativeBlock extends ItemBlock
{

    private final static String[] subNames = { "Uncolored K-Matter Block", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

    public KDecorativeBlock(int id)
    {
        super(id);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata (int i)
    {
        return i;
    }

    @Override
    public String getUnlocalizedName (ItemStack itemstack)
    {
        return subNames[itemstack.getItemDamage()];
    }
}