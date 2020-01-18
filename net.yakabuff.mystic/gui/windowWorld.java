package gui;

import mods.baseMod;
import utils.categories;
import utils.mods;

public class windowWorld extends Window {
	
	windowWorld(){
		super("World", 40, 10);
	}



	@Override
	Window init() {
		// TODO Auto-generated method stub
		for(baseMod m : mods.modList){
			if(m.c == categories.World){
				addButton(m);
			}
		}
		

		return this;
	}
}
