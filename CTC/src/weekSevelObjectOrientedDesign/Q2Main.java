package weekSevelObjectOrientedDesign;

public class Q2Main {
	public static void main(String[] args) {
		Call call1 = new Call();
		call1.rank = 0;
		Call call2 = new Call();
		call2.rank = 0;
		Call call3 = new Call();
		call3.rank = 0;
		Call call4 = new Call();
		call4.rank = 0;
		Call call5 = new Call();
		call5.rank = 0;
		Call call6 = new Call();
		call6.rank = 0;
		Call call7 = new Call();
		call7.rank = 0;
		
		
		Q2CallHandeler callHandler = new Q2CallHandeler();
		Q2Employee emp1 = callHandler.dispatchCall(call1);
		Q2Employee emp2 = callHandler.dispatchCall(call2);
		callHandler.dispatchCall(call3);
		callHandler.dispatchCall(call4);
		callHandler.dispatchCall(call5);
		callHandler.dispatchCall(call6);
		callHandler.dispatchCall(call7);
		
		emp1.cannotHandle(call1);
		callHandler.getNextCall(emp1);
		
		emp2.callHandled(call2);
		
	}
}
