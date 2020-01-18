package gui;

import java.util.ArrayList;

import mods.baseMod;
import net.minecraft.src.Gui;
import utils.categories;
import utils.mods;
public class windowPlayer extends Window {
	

	windowPlayer(){
		super("Player", 10, 10);
	}
	


	@Override
	Window init() {
		// TODO Auto-generated method stub
		for(baseMod m : mods.modList){
			if(m.c == categories.Movement){
				addButton(m);
			}
		}
		

		return this;
	}



}
