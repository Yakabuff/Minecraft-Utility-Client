package mods;

import org.lwjgl.input.Keyboard;

import utils.Mystic;
import utils.categories;

public class showGui extends baseMod {
	
	
	public showGui() {
		super("GUI", "Displays click gui", Keyboard.KEY_V, categories.None);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void onToggled() {
		// TODO Auto-generated method stub
		mc.ingameGUI.addChatMessage("gui toggled");
		mc.displayGuiScreen(Mystic.getGui());
	}
	
	

	

}
