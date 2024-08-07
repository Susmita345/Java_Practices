package interview.coding.questions;

import java.util.Scanner;

public class FibonacciEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,next,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		num=sc.nextInt();
		for(int i=0;i<=num;i++){
			System.out.print(num1+" ");
			next=num1+num2;
			num1=num2;
			num2=next;
			
		}
		

	}

}
