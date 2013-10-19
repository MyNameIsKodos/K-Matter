package kmatter.machines.synth;

import java.util.List;

import kmatter.KMatter;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSynth extends BlockContainer
{

    public BlockSynth(int id)
    {
        super(id, Material.rock);
        setHardness(3.0F);
        setResistance(2000.0F);
        setCreativeTab(kmatter.KMatter.tabCustom);
    }

    private Icon[] iconBuffer;

    @Override
    public void registerIcons (IconRegister par1IconRegister)
    {
        iconBuffer = new Icon[3];

        iconBuffer[0] = par1IconRegister.registerIcon("kmatter:machines/front");
        iconBuffer[1] = par1IconRegister.registerIcon("kmatter:machines/back");
        iconBuffer[2] = par1IconRegister.registerIcon("kmatter:machines/sides");
    }

    @Override
    public Icon getIcon (int side, int metadata)
    {
        return iconBuffer[0];
/*            switch (side)
            {
            case 0: //Top
                return iconBuffer[2];
            case 1: //Bottom
                return iconBuffer[2];
            case 2: //North
            case 3: //South
            case 4: //West
            case 5: //East
            default:
                return iconBuffer[8];
        }*/
    }

    @Override
    public int damageDropped (int metadata)
    {
        return metadata;
    }
    
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i1, float f, float f2, float f3) {
    	TileEntity tile = world.getBlockTileEntity(x, y, z);
    	
    	if(tile instanceof TileSynth) {
    		player.openGui(KMatter.instance, 0, world, x, y, z);
    		return true;
    	}
    	return false;
    }
    
    @Override
    public void onBlockAdded (World world, int x, int y, int z)
    {
        world.setBlockTileEntity(x, y, z, this.createNewTileEntity(world));
    }

    public TileEntity createNewTileEntity (World var1)
    {
        return new TileSynth();
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks (int par1, CreativeTabs tab, List subItems)
    {
        for (int ix = 0; ix < 1; ix++)
        {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }
}
