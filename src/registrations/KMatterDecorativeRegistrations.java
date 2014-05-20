package com.kmatter.registrations;

import com.kmatter.KConfig;
import com.kmatter.blocks.KMatterBlock;
import net.minecraft.block.Block;
import com.kmatter.registrations.ItemRegistrations;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class KMatterDecorativeRegistrations
{

    public static void kdecorblockregistration ()
    {
        kdecorids = com.kmatter.KConfig.kdecorids;
        kdecorblock = new com.kmatter.blocks.KMatterBlock(kdecorids);

        String[] kdecorblocknames = { "Uncolored K-Matter Block", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        /* ##### Vanilla ##### */
        GameRegistry.registerBlock(kdecorblock, "K-Matter Decorative Blocks");
        LanguageRegistry.addName(new ItemStack(kdecorblock, 1, 0), "Uncolored K-Matter Block");
        //      LanguageRegistry.addName(, name);
    }

    public static void addRecipes ()
    {
        // System.out.println("Random Block Registration loaded");  Use this to show things are loading.
        if (com.kmatter.KConfig.enablekdecorids)
        {
            //     GameRegistry.addRecipe(new ItemStack(Item.diamond, 8), new Object[] { "xxx", "x x", "xxx", 'x', new ItemStack(Item.enderPearl) });
            /*      GameRegistry.addRecipe(new ItemStack(kdecorblock, 1, 0),
                          new Object[] { "xxx", "x x", "xxx", 'x',
                                  new ItemStack(Item.diamond) });
                  GameRegistry.addRecipe(new ItemStack(kdecorblock, 1, 0),
                          new Object[] { "xxx", "x x", "xxx", 'x',
                                  new ItemStack(Item.diamond) });
                  GameRegistry.addRecipe(new ItemStack(kdecorblock, 1, 0),
                          new Object[] { "xxx", "x x", "xxx", 'x',
                                  new ItemStack(Item.diamond) });
                  GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 32),
                         new ItemStack(kdecorblock, 1, 0));
            /*          GameRegistry.addShapelessRecipe(new ItemStack(Item.clay, 4),
                          new ItemStack(Block.blockClay));
                  GameRegistry.addRecipe(new ItemStack(Item.clay, 16), new Object[] {
                          "xx", "xx", 'x', new ItemStack(kdecorblock, 1, 0) }); */
        }

    }

    public static Block kdecorblock;
    public static int kdecorids;
}