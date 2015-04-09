package code.model.module

public class ModuleMaker {
	private ModuleList list;
	
	//Constructor
	public ModuleHandler(ModuleList givenList)
	{
		list = givenList;
	}
	
	//General Methods
	public boolean createModule(Integer idNumber, Integer xCoordinate, Integer yCoordinate, Integer turnsToUpright, String condition) {
		int id = idNumber.intValue;
		boolean result = true;
		Module newModule = null;
		if(id >= 1 && id <= 40) {
			newModule = new PlainModule(xCoordinate, yCoordinate, idNumber, turnsToUpright, condition);
		} else if( (id >= 61 && id <= 80) || (id >= 91 && id <= 100) || (id >= 111 && id <= 120) || (id >= 131 && id <= 134) || (id >= 141 && id <= 144) || (id >= 151 && id <= 154) || (id >= 161 && id <= 164) || (id >= 171 && id <= 174) || (id >=181 && id <= 184) ) {
			newModule = new StandardModule(xCoordinate, yCoordinate, idNumber, turnsToUpright, condition);
		} else {
			result = false;
		}
		
		return result;
			
	}
}