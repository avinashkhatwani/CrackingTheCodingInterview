package weekOneArraysAndStrings;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		MyClass obj = new MyClass();
		obj.printNothing();
		
		NewClass newClass = new NewClass();
		newClass.printNothing();

	}
	
	public void printNothing() {
		System.out.println("HERE");
	}

}

class NewClass {
	
	
	public void printNothing() {
		System.out.println("HERE1");
	}
	
	
	MyClass obj = new MyClass();
}
