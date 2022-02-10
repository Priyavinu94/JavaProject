package reviewOOPConcept;

public class MainClass1 {

	public static void main(String[] args) {

		// Classname object_referencename = new Classname();
		Student obj = new Student(); // creating an object or instantiating the class
		obj.name = "Kamal";
		obj.age = 24;
		obj.percentage = 90.5;

		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.percentage);
		
		obj.study("Priya");
		
		MathOperation math = new MathOperation(); //instantiating MathOperation Class
		math.addNumbers();
		math.addTwoNumbers(45, 55);
	}

}
