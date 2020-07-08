package weekSevelObjectOrientedDesign;

public class Q2Employee {
	static Q2CallHandeler callHandeler= new Q2CallHandeler();
	int id;
	int rank;
	boolean avilable;
	
	public Q2Employee(int rank) {
		this.rank = rank;
		avilable = true;
	}
	
	public void recieveCall() {
		System.out.println("Call is being taken by employee of rank "+this.rank);
		avilable = false;
	}
	
	public void callHandled(Call call) {
		call.disconnect();
		this.avilable = true;
		callHandeler.getNextCall(this);
	}
	
	public void cannotHandle(Call call) {
		System.out.println("This emp cannot handle this call");
		this.avilable = true;
		call.rank +=1;
		callHandeler.dispatchCall(call);
		callHandeler.getNextCall(this);
	}

}

class Fresher extends Q2Employee{
	public Fresher() {
		super(0);
	}
}

class TechLead extends Q2Employee{
	public TechLead() {
		super(1);
	}
}

class ProductManager extends Q2Employee{
	public ProductManager() {
		super(2);
	}
}

