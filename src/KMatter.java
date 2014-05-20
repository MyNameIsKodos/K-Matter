package com.kmatter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import com.kmatter.registrations.ItemRegistrations;
import com.kmatter.registrations.KMatterDecorativeRegistrations;
import com.kmatter.utils.InfCoalFuelHandler;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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
					com.kmatter.registrations.ItemRegistrations.itemkmatter);
		}
	};

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		FMLLog.info("[K-Matter] is loaded. Working, however...");
	}
}