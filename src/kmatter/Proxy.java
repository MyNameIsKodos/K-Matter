package kmatter;

import kmatter.machines.synth.ContainerSynth;
import kmatter.machines.synth.GuiSynth;
import kmatter.machines.synth.TileSynth;
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
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		return new ContainerSynth(player.inventory, (TileSynth) tile);
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tile = world.getBlockTileEntity(x, y, z);
		return new GuiSynth(player.inventory, (TileSynth) tile);
	}
}