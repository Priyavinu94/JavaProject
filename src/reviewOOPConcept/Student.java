package reviewOOPConcept;

public class Student {

	//state --- represented by variables
	//behaviors /functionality--- methods
	
	String name;
	int age;
	double percentage;
	
	void write() {
		System.out.println("This is write method");
	}
	
	/* syntax for declaring methods: 
	 * returnType methodName() { 
	 * 	//method body
	 * }
	 * 
	 * First type - no input parameters, no return value
	 * Second type - some input parameters, no return value
	 * 
	 * 
	 */
	
	void study(String name1) {
		System.out.println(name1 + " is studying");
	}
}
