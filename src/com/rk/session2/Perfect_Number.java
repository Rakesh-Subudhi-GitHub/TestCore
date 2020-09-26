package com.rk.session2;

import java.util.Scanner;

public class Perfect_Number {
	
	public static void main(String[] args) {
		
		//read inputs
		int num=0,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the num ::::");
		num=sc.nextInt();
	
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}//for
		System.out.println("value is:: "+sum);
		if(sum==num)
		{
			System.out.println("it is perfect number:::: ");
		}
		else
		{
			System.out.println("its not a perfect number:::::");
		}
	}//main
}//class
