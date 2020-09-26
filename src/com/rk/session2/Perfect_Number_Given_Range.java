package com.rk.session2;

import java.util.Scanner;

public class Perfect_Number_Given_Range {
	
	public static void main(String[] args) {
		
		//read inputs
		int num=0,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the range to chel perfect number ::::");
		num=sc.nextInt();
	
		for(int n=1;n<=num;n++)
	 {
				sum=0;
				for(int j=1;j<=n/2;j++)
				{
					if(n%j==0)
					{
						sum=sum+j;
					}//if
	
				}//for
				if(sum==n)
					System.out.println(n+"it is perfect number:::: ");
//				else
//					System.out.println(n+"is not a perfect number::::");
	}//for
	}//main
}//class
