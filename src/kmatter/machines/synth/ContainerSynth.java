package kmatter.machines.synth;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerSynth extends Container {
	
	public void bindPlayerInventory(InventoryPlayer inv) {
        int i;

        for (i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(inv, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(inv, i, 8 + i * 18, 142));
        }
	}
        
	private TileSynth tileEnt;

    public ContainerSynth(InventoryPlayer par1InventoryPlayer, TileSynth tile) {
        bindPlayerInventory(par1InventoryPlayer);
    	
    	this.tileEnt = (TileSynth) tile;
        
        addSlotToContainer(new Slot(tile, 0, 43, 16));
    }
    
    public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
        return true;
    }

    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
    	return null;
    }

}
