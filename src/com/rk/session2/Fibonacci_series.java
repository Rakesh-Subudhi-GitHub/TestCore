package com.rk.session2;

import java.util.Scanner;

public class Fibonacci_series {
	
	public static void main(String[] args) {
		
		//read inputs
		int num=0,last=0;
		int a=0,b=1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the num continue::::");
		num=sc.nextInt();
	
		for(int i=0;i<=num;i++)
		{
			
		    last=a+b;
		    a=b;b=last;
		    System.out.println(last);
		}//for
	}//main
}//class
