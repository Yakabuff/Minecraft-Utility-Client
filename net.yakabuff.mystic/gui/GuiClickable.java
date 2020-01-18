package gui;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.src.GuiButton;
import net.minecraft.src.GuiScreen;
import utils.Mystic;

public class GuiClickable extends GuiScreen {
	
	public static List<Window> windowList = new ArrayList<Window>();
	Window player;
	Window world;
	
	
	public void initGui(){

//		player = new windowPlayer().init();
		world = new windowWorld().init();
	}
	
	@Override
	public void drawScreen(int x, int y, float f){
		
//		drawDefaultBackground();
		for(Window w : windowList){
			w.draw();
		}
		

	}
	
	
	@Override
	protected void mouseClicked(int x, int y, int button) {
		// TODO Auto-generated method stub
//		Mystic.mc.ingameGUI.addChatMessage(x + " " +y);
		for(Window w: windowList){
			w.mouseClicked(x, y);
//			Mystic.mc.ingameGUI.addChatMessage(w.x1 + " " +w.y1);
		}

//		Mystic.mc.ingameGUI.addChatMessage("clicked");
	}
	
	public void mouseMovedOrUp(int x, int y, int button)
	{
		for(Window window: windowList)
		{
			window.mouseMovedOrUp(x, y, button);
		}
	}
	
	public void setFocused(Window w){
		if(windowList.contains(w)){
			windowList.remove(w);
			windowList.add(w);
		}
	}
	
	public Window getFocused(){
		return windowList.get(windowList.size()-1);
	}
	
	public static void add(Window w){
		windowList.add(w);
	}
}
