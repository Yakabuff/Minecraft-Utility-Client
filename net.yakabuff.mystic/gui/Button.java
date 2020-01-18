package gui;

import org.lwjgl.input.Mouse;

import mods.baseMod;
import net.minecraft.client.Minecraft;
import net.minecraft.src.Gui;
import net.minecraft.src.GuiScreen;
import utils.ClientGuiUtil;
import utils.GradientRect;
import utils.Mystic;
public class Button{

	protected String name;
	private int x1,y1;
	int height;
	int width;
	boolean draw;
	Window window;
	baseMod mod;
	GradientRect gr;

	Button(Window w, baseMod m, int xpos, int ypos){
		name = m.name;
		this.window = w;
		this.mod = m;
		this.x1 = xpos;
		this.y1 = ypos;
		gr = new GradientRect();
		
	}
	
	void draw(){ 	
		
//		GuiLib.drawGradientBorderedRect(x1  , y1  , x1 + 160 , y1 + 30, 0.5F,  0xFF666666,  0xFF777777, 0xFF555555);
		ClientGuiUtil.drawBorderedRect(x1, y1, x1+160, y1+30, !mod.isEnabled? 0xFF195FAA :0xFF2268B3, 1F,  0xFF000000);
		ClientGuiUtil.drawHLine(x1, y1, x1+99, !mod.isEnabled?0xFF4A90DB: 0xFF2268B3);
//		if(Mouse.isButtonDown(0)){
//			ClientGuiUtil.drawHLine(x1, y1, x1+99,  0xFF2268B3);
//		}
//		ClientGuiUtil.drawString(mod.name, x1+10, y1+ 10, 0xFF000000);
		Minecraft.theMinecraft.fontRenderer.drawString(mod.name, x1+10, y1+ 10, 0xFFFFFF);
//		gr.drawBorderedRect(x1, y1, x1 + 160, y1 + 30,  0x903e3e3e, 0x904d4d4d);
	}
	
	void mouseClicked(int x, int y){
//		Mystic.mc.ingameGUI.addChatMessage("button pressed");
		Mystic.mc.ingameGUI.addChatMessage(  x + " " + y );

		if(x >= window.x1+ 20 ){
			Mystic.mc.ingameGUI.addChatMessage(mod.name + " "+x1 + " " + y1);
		}
	}
	

	
}
