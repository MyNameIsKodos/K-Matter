package kmatter.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class KMatterBlock extends Block
{

    public KMatterBlock(int id)
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
        iconBuffer = new Icon[2];

        iconBuffer[0] = par1IconRegister.registerIcon("kmatter:kmatterblock");
        //       iconBuffer[1] = par1IconRegister
        //            .registerIcon("vanityblocks:whitesoulsand");
    }

    @Override
    public Icon getIcon (int side, int metadata)
    {
        if (metadata == 0)
        {
            return iconBuffer[0];
        }
        //        if (metadata == 1) {
        //          return iconBuffer[1];
        //    }
        return blockIcon;
    }

    @Override
    public int damageDropped (int metadata)
    {
        return metadata;
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
