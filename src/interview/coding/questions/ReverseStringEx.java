package interview.coding.questions;

import java.util.Scanner;

public class ReverseStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,revStr;
		revStr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			revStr=str.charAt(i)+revStr;
		}
		System.out.println("The reversed string is:"+revStr);

	}

}
