package hooks;

import java.awt.Font;

import org.lwjgl.opengl.GL11;

import gui.GuiLib;
import mods.baseMod;
import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.GuiIngame;
import net.minecraft.src.ScaledResolution;
import utils.mods;
import utils.Mystic;
import org.newdawn.slick.TrueTypeFont;

public class GuiIngameHook extends GuiIngame{
	
	static Minecraft mc;
	FontRenderer fr; 
	
	
	public GuiIngameHook(Minecraft m){
		super(m);
		mc = m;
		fr = m.fontRenderer;
		

	}
	

	
	public void renderGameOverlay(float p1, boolean p2, int p3, int p4){
		super.renderGameOverlay(p1,p2,p3,p4);
		ScaledResolution sr = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
		
		int height = sr.getScaledHeight();
		int width = sr.getScaledWidth();

		fr.drawStringWithShadow("Mystic", 2, 2, 0xffffff);
		
		for(baseMod m : mods.getEnabled()){
			if(m.name.equals("coords")){
				fr.drawStringWithShadow("X: "+(int) mc.thePlayer.posX, width-30, height - 30, 0xffffff);
				fr.drawStringWithShadow("Y: "+(int) mc.thePlayer.posY, width-30, height - 20, 0xffffff);
				fr.drawStringWithShadow("Z: "+(int) mc.thePlayer.posZ, width-30, height - 10, 0xffffff);
			}
			
			
		}




	}
	
	

	
}
