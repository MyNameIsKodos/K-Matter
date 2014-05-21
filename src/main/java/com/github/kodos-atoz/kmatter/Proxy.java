package com.kmatter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.network.IGuiHandler;

public class Proxy implements IGuiHandler 
{

    public void registerRenderInformation ()
    {

    }

    public void addNames ()
    {
    }

    public static String getMinecraftVersion ()
    {
        return Loader.instance().getMinecraftModContainer().getVersion();
    }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}