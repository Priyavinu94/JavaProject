package basics;

public class Variables2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;								//integer variable	
		long ph_no = 1234567890L;					//long variable
		double height = 150.5;						//double variable
		float weight = 52.6f;						//float variable
		String ques = "Please select Yes or No : ";	//string variable
		char ans = 'Y';								//char variable
		
		System.out.println("Please enter your age : " + age);
		System.out.println("Please enter your phone number : " + ph_no);
		System.out.println("Please enter your height in cms : " + height);
		System.out.println("Please enter your height in kgs : " + weight);
		System.out.println(ques + ans);
		
	}

}
