package interview.coding.questions;

import java.util.Scanner;

public class SwappingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping: "+a+" "+b);
				

	}

}
