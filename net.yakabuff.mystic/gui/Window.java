package gui;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import mods.baseMod;
import net.minecraft.client.Minecraft;
import utils.ClientGuiUtil;
import utils.Mystic;

public abstract class Window{
	
	String name;
	public int x1;
	public int y1;
	int height;
	int width;
	boolean minimized;
	public List<Button> buttons = new ArrayList<Button>();
	

	Window(String title, int x, int y){
		this.name = title;
		this.x1 = x;
		this.y1 = y;
		addWindow(this);
	}
	
	void addWindow(Window w){
		GuiClickable.add(w);
	}
	
	void addButton(baseMod m){
		buttons.add(new Button(this, m, x1 + 20, y1 + (40 * buttons.size()) + 50));
	}
	
	void draw(){
		
		
    	GL11.glPushMatrix();
		ClientGuiUtil.drawBorderedRect(x1, y1, x1+200, y1+300, 0xFF424242, 1f, 0xFF000000);
		ClientGuiUtil.drawRect(x1+1, y1+30, x1+200-1, y1+300-1, 0xFF494949);
		ClientGuiUtil.drawHLine(x1+1, y1+30, 200-2, 0xFF313131);
		ClientGuiUtil.drawHLine(x1+1, y1+30+1, 200-2, 0xFF545454);
		Mystic.mc.fontRenderer.drawString(name + buttons.size(), x1+5, y1+10, 0xFFFFFFFF);
    	GL11.glPopMatrix();
		for(Button b : buttons){
			b.draw();
		}
	}
	public void mouseClicked(int x, int y){
		for(Button b : buttons){
			
			b.mouseClicked(x,y);
		}
//		System.out.println(this.x1 + " " +this.y1);
	}
	abstract Window init();

	public void mouseMovedOrUp(int x, int y, int button) {
		// TODO Auto-generated method stub
		
	}
}
