package basics;

import java.util.Scanner; //importing Scanner class

public class RectangleScanner {

	public static void main(String[] args) {

		// declaring input as an object of Scanner class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle in cm");
		// user input value of length
		double length = input.nextDouble();
		System.out.println("Enter the breadth of the rectangle in cm");
		// user input value of breadth
		double breadth = input.nextDouble();
		double area = length * breadth;
		double perimeter = 2 * (length + breadth);
		System.out.println("Area of the rectangle = " + area + " sq.cm");
		System.out.println("Perimeter of the rectangle = " + perimeter + " cm");
		input.close(); // closing scanner class
	}

}
