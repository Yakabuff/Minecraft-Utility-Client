package mods;

import utils.Mystic;
import utils.categories;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityClientPlayerMP;
import net.minecraft.src.ScaledResolution;
public class coords extends baseMod {

	public coords() {
		super("coords", "display coordinates",Keyboard.KEY_R, categories.World);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		
		isEnabled = true;

	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		isEnabled = false;
	}


	
	

}
