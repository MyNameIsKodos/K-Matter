package kmatter.machines.synth;

import kmatter.registrations.ItemRegistrations;
import kmatter.tileentity.TileElectrical;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraftforge.common.ForgeDirection;
import universalelectricity.prefab.network.PacketManager;

import com.google.common.io.ByteArrayDataInput;

import cpw.mods.fml.common.network.PacketDispatcher;

public class TileSynth extends TileElectrical {
	
	public TileSynth() {
		setInventorySize(1);
	}
	
	public void updateEntity() {
		super.updateEntity();
		if(!worldObj.isRemote) {
			System.out.println(getEnergyStored());
			if(getEnergyStored() >= 1000000) {
				ItemStack matter = new ItemStack(ItemRegistrations.itemkmatter);
		        if (inventory[0] == null)
		        {
		        	inventory[0] = matter.copy();
		        	setEnergyStored(getEnergyStored() - 1000000);
		        }
		        else if (inventory[0].isItemEqual(matter))
		        {
		        	inventory[0].stackSize += matter.stackSize;
		        	setEnergyStored(getEnergyStored() - 1000000);
		        } 
			}
		}
	}
	
	@Override
	public float getRequest(ForgeDirection direction) {
		/** OKAY HERE, RETURN WHAT EVER YOU NEED TO REQUEST, DONT WORRY
		 * ABOUT GETPROVIDE
		 */
		return 1000000;
	}

	@Override
	public float getProvide(ForgeDirection direction) {
		return 0;
	}

	@Override
	public float getMaxEnergyStored() {
		/** SAME HERE, WHAT EVER THE MAX IS PUT IT HERE */
		return 2000000;
	}
	
	public String getInvName() {
		return "Synth";
	}
}
