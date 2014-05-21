package com.kmatter.utils;

import cpw.mods.fml.common.IFuelHandler;
import com.kmatter.KConfig;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class InfCoalFuelHandler implements IFuelHandler {
		
	@Override
	public int getBurnTime(ItemStack fuel) {
		int var1 = fuel.itemID;
		
		if(var1 == KConfig.kcoalid){
			return 12800;
		}else{
			return 0;
		}
	}

}
