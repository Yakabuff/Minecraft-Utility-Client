package mods;

import org.lwjgl.input.Keyboard;

import utils.categories;

public class fullbright extends baseMod {
	
	public fullbright(){
		super("Fullbright","makes everything bright",Keyboard.KEY_C,categories.World);
	}

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		isEnabled = true;
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		isEnabled= false;
	}
}
