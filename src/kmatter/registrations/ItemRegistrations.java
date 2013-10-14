package kmatter.registrations;

import kmatter.KConfig;
import kmatter.blocks.KMatterBlock;
import kmatter.items.ItemKMatter;
import kmatter.registrations.KMatterDecorativeRegistrations;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ItemRegistrations
{

    public static Item itemkmatter;

    public static void itemreg ()
    {
        itemkmatter = new ItemKMatter(KConfig.kmatterid - 256)//Ignore the - 256, but always add it because Mojang is full of morons.  Also, it fixes configs.
                .setUnlocalizedName("KMatterItem");
        LanguageRegistry.addName(itemkmatter, "K-Matter");
    }
    public static Item infusedcoal;
    
    public static void infusedcoalreg ()
    
    {
   
    	    	infusedcoal = new kmatter.items.InfusedCoal(KConfig.kcoalid - 256)
    	    			.setUnlocalizedName("infusedcoal");
    	    	LanguageRegistry.addName(infusedcoal,  "KM-Infused Coal");
    	    
    }
    
    public static void oredict ()
    {
    	OreDictionary.registerOre("itemkmatter", itemkmatter);
    }

    public static void additemrecipes ()
    {

        // ############# to make the flint item
        if (KConfig.enablespensivepatterns)
        {
            GameRegistry.addRecipe(new ItemStack(Item.diamond, 1), "xxx", "x x", "xxx", 'x', new ItemStack(itemkmatter, 1));
            GameRegistry.addRecipe(new ItemStack(Item.emerald, 1), "xxx", " x ", "xxx", 'x', new ItemStack(itemkmatter, 1));
        }
        GameRegistry.addRecipe(new ItemStack(Item.coal, 20), "  x", "x  ", "  x", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(Block.wood, 8), " x ", "   ", "   ", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(KMatterDecorativeRegistrations.kdecorblock, 1, 0), "xxx", "xxx", "xxx", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(itemkmatter, 9), new ItemStack(KMatterDecorativeRegistrations.kdecorblock, 1, 0));
        GameRegistry.addRecipe(new ItemStack(Item.bone, 24), "x  ", "xx ", "x  ", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(Block.stone, 16), "   ", " x ", "   ", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(Block.obsidian, 12), "x x", "x x", "   ", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(Block.grass, 16), "   ", "x  ", "x  ", 'x', new ItemStack(itemkmatter, 1));
        GameRegistry.addRecipe(new ItemStack(Block.netherrack, 16), "  x", " x ", "x  ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 32, 3), "xx ", "xx ", "x  ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.cloth, 12, 0), "x x", "   ", " x ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.sand, 24), " x ", "x x", " x ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.oreGold, 2), " x ", "xxx", " x ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.clay, 32), "xx ", "x  ", "xx ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.flint, 32), " x ", "xx ", "xx ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 32, 3), "xx ", "  x", "xx ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.cobblestoneMossy, 16), "   ", " x ", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.feather, 24), " x ", " x ", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.oreIron, 2), "x x", " x ", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.reed, 24), "x x", "x x", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.cactus, 32), " x ", "xxx", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 9, 4), " x ", " x ", " xx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.snowball, 16), "   ", "   ", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.gunpowder, 15), "xxx", "x  ", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.redstone, 24), "   ", " x ", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.mycelium, 24), "   ", "x x", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Block.glowStone, 8), " x ", "x x", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.dyePowder, 24, 0), " xx", " xx", " x ", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.blazeRod, 4), "x x", "xx ", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.enderPearl, 1), "x x", " xx", "x x", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.slimeBall, 8), "x x", " x ", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(Item.leather, 12), "x  ", "x  ", "xxx", 'x', new ItemStack(itemkmatter));
        GameRegistry.addRecipe(new ItemStack(itemkmatter, 64), "ror", "odo", "ror", 'r', new ItemStack(Item.redstone), 'o', new ItemStack(Item.glowstone), 'd', new ItemStack(Item.diamond));
        GameRegistry.addRecipe(new ItemStack(infusedcoal, 1), "xxx", "xyx", "xxx", 'x', new ItemStack(itemkmatter), 'y', new ItemStack(Item.coal));
    }

}