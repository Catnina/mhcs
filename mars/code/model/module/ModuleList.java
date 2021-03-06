/*
 * Owner: Garrett Blythe
 * Original Date: 4/9
 * Amended by:		Date: 
 *   Garrett Blythe		4/9
 *   Garrett Blythe		4/10
 */

package code.model.module

import Module;

public class ModuleList {
	private Hashtable<Integer, Module> moduleTable;
	
	//Constructor
	public ModuleList() {
		moduleTable = new Hashtable<Integer, Module>;
	}
	
	//Add and Remove
	public boolean addModule(Module newModule) {
		boolean success;
		Integer idNum = newModule.getIdNumber();
		
		if(moduleTable.containsKey(idNum))
		{
			success = false;
		}
		else
		{
			moduleTable.put(idNum, newModule)
			success = true;
		}
		
		return success;
	}
	public void removeModule(Module target) {
		Integer idNum = target.getIdNumber();
		moduleTable.remove(idNum);
	}
	
	//General Methods
	public Module getModuleByIdNumber(Integer idNum) {
		Module result;
		result = moduleTable.get(idNum);
		return result;
	}
	
	public boolean containsId(Integer idNum) {
		return moduleTable.containsKey(idNum);
	}
	
	public Enumeration<Module> getModules() {
		return moduleTable.elements();
	}
	
	public Enumeration<Module> getListOfModuleIds() {
		return moduleTable.keys();
	}
}