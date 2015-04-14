package view;

import model.Module;
import com.google.gwt.user.client.ui.Image;


/**
 * Extends Image class to store Modules for Grid interaction.
 * 
 * @author Ryan
 *
 */
public class ModuleImage extends Image {
	Module mod;
	
	ModuleImage(String path) {
		super.setUrl(path);
	}
	
	/**
	 * Setter for the Module variable
	 * @param newMod Module being assigned
	 */
	public void setModule(Module newMod) {
		mod = newMod;
	}
	
	/**
	 * Getter for the module.
	 * @return The module variable
	 */
	public Module getMod() {
		return mod;
	}

}
