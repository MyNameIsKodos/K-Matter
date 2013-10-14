package kmatter.machines.synth;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiSynth extends GuiContainer {
	
    private static TileSynth tileINV = new TileSynth();

    public GuiSynth(InventoryPlayer par1InventoryPlayer, TileSynth tile) {
        super(new ContainerSynth(par1InventoryPlayer, tile));
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        String s = this.tileINV.isInvNameLocalized() ? this.tileINV.getInvName() : I18n.getString(this.tileINV.getInvName());
        this.fontRenderer.drawString(s, this.xSize / 2 - 4, 7, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(new ResourceLocation("put this here","textures/gui/***.png"));
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
