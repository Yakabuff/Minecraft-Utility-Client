package utils;

import gui.GuiClickable;
import mods.baseMod;
import net.minecraft.client.Minecraft;
import net.minecraft.src.FontRenderer;

import java.awt.Font;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.TrueTypeFont;

public class Mystic {

	
	Mystic instance = new Mystic();
	
	public static String version = "1.0";
	public static TrueTypeFont ttf= new TrueTypeFont(new Font("Verdana", Font.TRUETYPE_FONT, 24), true);;
	//singleton mc instance
	
	public static Minecraft mc = Minecraft.theMinecraft;
	public static FontRenderer fr = mc.fontRenderer;
	public static GuiClickable mGui;
	public static mods mods;
	
	public static void init(){

		mGui = new GuiClickable();
		mods = new mods();
	}
	
	public static void onKeyPressed(){
		int key = Keyboard.getEventKey();
		
		for(baseMod m : mods.modList){
			if(key == m.keybind){
				m.onKeyPress(key);
				
			}
		}
	}
	
	public static GuiClickable getGui(){
		if(mGui == null){
			mGui = new GuiClickable();
		}
		
		return mGui;
	}
	
	
}
