package utils;

import java.util.ArrayList;
import java.util.List;

import mods.baseMod;
import mods.*;

public class mods {

	public static ArrayList<baseMod> modList = new ArrayList<baseMod>();
	
	public mods(){
		modList.add(new fullbright());
		modList.add(new coords());
		modList.add(new showGui());
	}
	
	public static ArrayList<baseMod> getEnabled(){
		ArrayList<baseMod> enabled = new ArrayList<baseMod>();
		
		for(baseMod m : modList){
			if(m.isEnabled){
				enabled.add(m);
			}
		}
		
		return enabled;
	}
}
