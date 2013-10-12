package kmatter;

import kmatter.items.InfusedCoal;
import kmatter.items.ItemKMatter;
import kmatter.registrations.ItemRegistrations;
import kmatter.registrations.KMatterDecorativeRegistrations;
import kmatter.utils.InfCoalFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartedEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "KMatter", name = "K-Matter", version = DefaultProps.LOCALMAJVERSION
		+ "." + DefaultProps.LOCALMINVERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class KMatter {

	@Instance("KMatter")
	public static KMatter instance;
	public static final String modid = "kmatter";

	@SidedProxy(clientSide = "kmatter.ProxyClient", serverSide = "kmatter.Proxy")
	public static Proxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		KConfig.initProps(event.getModConfigurationDirectory());
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderInformation();
		proxy.addNames();

		// K-Decor Block init
		if (KConfig.enablekdecorids) {
			KMatterDecorativeRegistrations.kdecorblockregistration();
			KMatterDecorativeRegistrations.addRecipes();
		}

		// K-Matter Item Init
		ItemRegistrations.itemreg();
		ItemRegistrations.infusedcoalreg();
		ItemRegistrations.oredict();
		ItemRegistrations.additemrecipes();

		// Fuel Handler Init
		// This is where I'm having trouble at.  This is SUPPOSED to go here, but it's not working.
	    GameRegistry.registerFuelHandler(new InfCoalFuelHandler());
		
		/* Creative tab related */
		LanguageRegistry.instance().addStringLocalization("itemGroup.kmatter",
				"en_US", "K-Matter");
	}

	/*
	 * @EventHandler public void serverInit (FMLServerStartedEvent event) {
	 * 
	 * }
	 */

	public static CreativeTabs tabCustom = new CreativeTabs("kmatter") {
		public ItemStack getIconItemStack() {
			return new ItemStack(
					kmatter.registrations.ItemRegistrations.itemkmatter);
		}
	};

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FMLLog.info("[K-Matter] is loaded. Working, however...");
	}
}