package com.rk.session2;

import java.util.Scanner;

public class Palindrom_number {
	
	public static void main(String[] args) {
		
		//read inputs
		int num=0,rev = 0,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number::::");
		num=sc.nextInt();
		
		while(num !=0)
		{
			sum=num%10;
			rev=rev*10+sum;
			num=num/10;
			
		}
		if(num==rev)
		System.out.println("this num is palindrom number "+rev);
		else
			System.out.println("this num is not palindrom number "+rev);
	}//main
}//class
