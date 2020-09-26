package com.rk.session1;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		int arry[]= new int[5];
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter elements:::");
		
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=sc.nextInt();
		}//for
		
		//show elements are
		System.out.println("display elements:::");
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
		
	}//main
}//class
