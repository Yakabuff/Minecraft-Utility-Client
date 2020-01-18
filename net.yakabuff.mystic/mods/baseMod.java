package mods;

import net.minecraft.client.Minecraft;
import utils.Mystic;
import utils.categories;

public abstract class baseMod {

	public Minecraft mc = Mystic.mc;
	public int keybind;
	public String desc;
	public String name;
	public String command;
	public boolean isEnabled = false;
	public categories c;
	
	public baseMod(String name, String description, int key, categories category){
		this.name = name;
		this.desc = description;
		this.keybind = key;
		this.c = category;
		System.out.println("[Mystic] Mod" + " " + name + " has been initialized");
	}
	
	public baseMod(String name, String description, categories category){
		this.name = name;
		this.desc = description;
		this.keybind = -1;
		this.c = category;
		System.out.println("[Mystic] Mod" + " " + name + " has been initialized");
	}
	
	
	public void onEnable(){};
	
	public void onDisable(){};
	
	public void onToggled(){

	}
	public boolean isEnabled(){
		return this.isEnabled;
	}
	
	public final void toggle(){
		setState(!isEnabled);
		onToggled();
	}
	public final void setState(boolean flag) {
		isEnabled = flag;
		if(isEnabled()) {
			onEnable();

		} else {
			onDisable();

		}
	}
	public void onKeyPress(int key){
		if(key == keybind){
			toggle();
		}
	}
}
