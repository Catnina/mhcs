package code.model.module

public class StandardModule extends Module{
	private Integer neighborId;
	private Module neighbor;
	
	//Constructors
	public Module(int x, int y, int id, int turns, String cond) {
		super(x, y, id, turns, cond);
	}
	
	public Module(int x, int y, int id, int turns, String cond, Module nextTo) {
		super(x, y, id, turns, cond);
		neighbor = nextTo;
		neighborId = nextTo.getIdNumber();
	}
	
	//toString
	public String toString() {
		output = super.toString;
		output += " NEXT_TO:" + neighborId;
		return output;
	}
	
	// Getters and Setters
	public Module getNeighbor() {
		return neighbor;
	}
	public Integer getNeighborId() {
		return neighborId;
	}
	public void setNeighbor(Module newNeighbor) {
		neighbor = newNeighbor;
		neighborId = newNeighbor.getIdNumber();
	}
}