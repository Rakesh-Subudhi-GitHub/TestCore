package com.rk.session1;

import java.util.Scanner;

public class Array_2_enhanced_forlooped {

	public static void main(String[] args) {
		int arry[]= new int[5];
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter elements:::");
		
		for(int i=0;i<arry.length;i++)
		{
			arry[i]=sc.nextInt();
		}//for
		
		//show elements are
		System.out.println("display elements using enhanced for:::");
	
		for(int ele:arry)
		System.out.println(ele);
		
		sc.close();
	}//main
}//class
