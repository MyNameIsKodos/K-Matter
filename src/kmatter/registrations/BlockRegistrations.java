package kmatter.registrations;

import kmatter.KConfig;
import kmatter.blocks.KMatterBlock;
import kmatter.machines.synth.ksynth;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockRegistrations {

public static void blockregistration ()
{
    ksynth = new ksynth(KConfig.ksynthid).setUnlocalizedName("ksynth");   
    GameRegistry.registerBlock(ksynth, "ksynth");
}

public static void addRecipes ()
{

}
public static Block ksynth;
}