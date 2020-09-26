package com.rk.session2;

import java.util.Scanner;

public class Find_Sum_OR_Even_Range {

	public static void main(String[] args) {
		
		int num=0;
		int es[] = null ;		int os[];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range:: ");
		num=sc.nextInt();
		
		es= new int[60];
		int count=0,count1=0;
		for(int n=1;n<=num;n++)
		{
			
			if(n%2==0)
			{
				
				for(int i=count;i<es.length;i++)
				{
					es[i]=n;
				}
			
			}
			else
			{
				os=new int[] {n};
				
			}
			
		}//for
			
				for(int even: es)
				{
					System.out.println(even);
				}
			}
		
	}//main

//}//class
