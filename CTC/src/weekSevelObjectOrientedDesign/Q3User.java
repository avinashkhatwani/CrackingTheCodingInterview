package weekSevelObjectOrientedDesign;

public class Q3User {
	private String name;
	public String getName() { return name; }
	public void setName(String name) {	this.name = name; }
	public int getID() { return ID; }
	public void setID(int iD) { ID = iD; }
	private int ID;
	public Q3User(String name, int iD) {
		this.name = name;
		ID = iD;
	}
	public Q3User getUser() { return this; }
	public static Q3User addUser(String name, int iD){
		return new Q3User(name, iD);
	}

}
