package view;

import java.util.Enumeration;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;

/**
 * Creates a map of all the module positions on the map.
 * After a module has been added or removed, call redraw() to update the map.
 * 
 * @author Ryan Ostroot
 *
 */
public class ModuleMap {
	private Grid map;
	
	public ModuleMap() {
		map = new Grid(50, 100);
	}
	
	public Grid renderMap(ModuleList list) {
		Enumeration<Module> modlist = list.getModules();
		Module mod = null;
		String imgPath;
		int modId;
		
		while(modlist.hasMoreElements()) {
			imgPath = "img/";
			mod = modlist.nextElement();
			modId = mod.getIdNumber();
			if((modId >= 1) || (modId <= 40)) {
				imgPath += "Plain";
			}
			else if((modId >= 61) || (modId <= 80)) {
				imgPath +="Dormitory";
			}
			else if((modId >= 91) || (modId <= 100)) {
				imgPath +="Sanitation";
			}
			else if((modId >= 111) || (modId <= 120)) {
				imgPath +="Food";
			}
			else if((modId >= 131) || (modId <= 134)) {
				imgPath +="Gym";
			}
			else if((modId >= 141) || (modId <= 144)) {
				imgPath +="Canteen";
			}
			else if((modId >= 151) || (modId <= 154)) {
				imgPath +="Power";
			}
			else if((modId >= 161) || (modId <= 164)) {
				imgPath +="Control";
			}
			else if((modId >= 171) || (modId <= 174)) {
				imgPath +="Airlock";
			}
			else if((modId >= 181) || (modId <= 184)) {
				imgPath +="Medical";
			}
			
			imgPath += ".jpg";
			Image img = new Image(imgPath);
			img.setPixelSize(10, 10);
    	    img.addClickHandler(new ClickHandler() {
    	    	  public void onClick(ClickEvent event) {
    	    		  Image temp = (Image)event.getSource();
    	    		  //TO-DO: Add pop up window that displays module details.
    	    		  //
    	    		  //
    	    		  
    	    	  }
    	    });
			
			map.setWidget(mod.getYCoordinate(), mod.getXCoordinate(), img);
		}
		return map;
	}
}
