package com.rk.session2;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		//read inputs
		int num;
		int n=0,sum=0;
		int total=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number::::");
		num=sc.nextInt();
		int chg=num;
	while(num !=0)
	{
		int fact=1;
		n=num%10;
		System.out.println("n value: "+n);
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			sum=fact;
		}
		System.out.println(sum);
		total=total+sum;
		num=num/10;
	
	}//while
	
	System.out.println("total is  "+total);
	System.out.println("num is"+chg);
	if(chg == total)
	{
		System.out.println("this num is strong value:::");
	}
	else
	{
		System.out.println("this number is not strong value");
	}
	}//main
}//class
