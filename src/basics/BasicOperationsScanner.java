package basics;

import java.util.Scanner;	//importing Scanner class

public class BasicOperationsScanner {

	public static void main(String[] args) {
		
		//declaring object reference variable - scan, the object of Scanner class - new Scanner()
		Scanner scan = new Scanner(System.in);	

		System.out.println("Enter the first number");
		double firstNum = scan.nextDouble();
		System.out.println("Enter the second number");
		double secNum = scan.nextDouble();

		double sum = firstNum + secNum;
		double diff = firstNum - secNum;
		double prod = firstNum * secNum;

		System.out.println("The sum of entered numbers = " + sum);
		System.out.println("The difference of entered numbers = " + diff);
		System.out.println("The product of entered numbers = " + prod);

		scan.close();
	}

}
