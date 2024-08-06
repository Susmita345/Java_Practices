package arithmetic.operators;

import java.util.Scanner;

public class MultiplicationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		result=num1*num2;
		System.out.println("The multiplication of two numbers is:"+result);

	}

}
