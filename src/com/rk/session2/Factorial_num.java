package com.rk.session2;

import java.util.Scanner;

public class Factorial_num {
	
	public static void main(String[] args) {
		
		//read inputs
		int fact=1,num=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number::::");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial value is:: "+fact);
	}//main
}//class
