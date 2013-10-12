package kmatter.blocks;

import java.util.List;

import kmatter.tileentity.TileSynth;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ksynth extends BlockContainer
{

    public ksynth(int id)
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
        iconBuffer = new Icon[1];

        iconBuffer[0] = par1IconRegister.registerIcon("kmatter:kmatterblock");
    }

    @Override
    public Icon getIcon (int side, int metadata)
    {
        return iconBuffer[0];
    }

    @Override
    public int damageDropped (int metadata)
    {
        return metadata;
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
