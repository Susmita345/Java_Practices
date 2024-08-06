package arithmetic.operators;

import java.util.Scanner;

public class AdditionEx {

	public static void main(String[] args) {

		int num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		result=num1 + num2;
		System.out.println("The addition of two numbers is:"+result);
		
		

	}

}
