package weekSevelObjectOrientedDesign;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Call{
	int rank;
	
	public void reply() {
		System.out.println("Recieving call");
	}
	
	public void disconnect() {
		System.out.println("Thank you for calling");
	}
	
}

public class Q2CallHandeler {
	static final int LEVELS = 3;
	
	ArrayList<Q2Employee>[] employeeLevels = null;
	Queue<Call>[] callLevelQueue = null;
	
	public Q2CallHandeler() {
		employeeLevels = new ArrayList[3];
		callLevelQueue = new LinkedList[3];
		
		for(int i=0; i<3; i++) {
			callLevelQueue[i] = new LinkedList<>();
		}
		
		ArrayList<Q2Employee> freshers = new ArrayList<Q2Employee>();
		for(int i=0; i<5; i++) {
			Fresher fresher = new Fresher();
			freshers.add(fresher);
		}
		employeeLevels[0] = freshers;
		
		ArrayList<Q2Employee> tls = new ArrayList<Q2Employee>();
		TechLead techLead = new TechLead();
		tls.add(techLead);
		employeeLevels[1] = tls;
		
		ArrayList<Q2Employee> pms = new ArrayList<Q2Employee>();
		ProductManager pm = new ProductManager();
		pms.add(pm);
		employeeLevels[2] = pms;
	}
	
	Q2Employee assignEmployee(Call call) {
		
		int rank = call.rank;
			ArrayList<Q2Employee> empLevelList = employeeLevels[rank];
			for(Q2Employee emp: empLevelList) {
				if(emp.avilable)
					return emp;
			}
		return null;
		
	}
	
	Q2Employee dispatchCall(Call call) {
		Q2Employee emp = assignEmployee(call);
		if(emp!=null) {
			emp.recieveCall();
			return emp;
		}
		int curCallRank = call.rank;
		System.out.println("Representative not available, adding to queue");
		Queue<Call> queueCallLevel = callLevelQueue[curCallRank];
		queueCallLevel.add(call);
		return null;
	}
	
	void getNextCall(Q2Employee emp) {
		int empRank = emp.rank;
		Queue<Call> queue = callLevelQueue[empRank];
		Call call = queue.poll();
		if(call!=null) {
			emp.recieveCall();
			return;
		}
	}
	
	
	public static void main(String[] args) {
//		Q2CallHandeler callHandle = new Q2CallHandeler();
	}
	

}
