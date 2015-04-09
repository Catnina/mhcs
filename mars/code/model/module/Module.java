package code.model.module

public class Module{
	private Integer xCoord;
	private Integer yCoord;
	private Integer idNumber;
	private Integer orientation;
	private String condition;
	
	//Constructors
	public Module(int x, int y, int id, int turns, String Cond) {
		xCoord = x;
		yCoord = y;
		idNumber = id;
		orientation = turns;
		Condition = Cond;
	}
	
	//toString
	public String toString() {
		String output = "";
		output += "X:" + xCoord;
		output += " Y:" + yCoord;
		output += " ID:" + idNumber;
		output += " TURNS:" + orientation;
		output += " CONDITION:" + condition;
	}
	
	// Getters and Setters
	public Integer getIdNumber() {
		return idNumber;
	}
	
	public Integer getXCoordinate() {
		return xCoord;
	}
	public void setXCoordinate(Integer newX) {
		xCoord = newX;
	}
	
	public Integer getYCoordinate() {
		return yCoord;
	}
	public void setYCoordinate(Integer newY) {
		yCoord = newY;
	}
	
	public Integer getOrientation() {
		return orientation;
	}
	public void setOrientation(Integer turnsToUpright) {
		orientation = turnsToUpright;
	}
	
	public String getCondition() {
		return condition;
	}
	public void setCondition(String newCondition) {
		condition = newCondition;
	}
}