package com.rk.session1;

import java.util.Scanner;

public class Search_elements_array {

	public static void main(String[] args) {
		
		int arry[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		boolean found=false;
		
		System.out.println("enter the search the elements:::::::");
		int key=sc.nextInt();
		
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i]==key)
			{
				found=true;
				System.out.println("location is "+(i+1));
				break;
			}
			else
				found=false;
		}
if(found)
	System.out.println("elements found it");
else
	System.out.println("not found it");
sc.close();
	}//main

}//class
