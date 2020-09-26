package com.rk.session1;

import java.util.Scanner;

public class Count_The_Number {

	public static void main(String[] args) {
		
		//read inputs
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number fast::::");
		int num=sc.nextInt();
		int count=0;
		
		while(num != 0)
		{
		num=num/10;
		count++;
		}
System.out.println("Count the number is::::::"+count);
sc.close();
	}

}
