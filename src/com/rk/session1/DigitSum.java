package com.rk.session1;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
	
		int sum=0,rev=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the elemets fast::::");
		int num=sc.nextInt();
		
		while(num !=0)
		{
		
			rev=num%10;
			sum=sum+rev;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println("digital sum= "+sum);
	
	
	sc.close();
	}//main
	
}//class
