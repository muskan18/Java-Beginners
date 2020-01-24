package day_4;

import java.util.*;


public class FindLeader {

	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		
		int size=sc.nextInt();
		
		int[] a=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		sc.close();
		
		printleader(a);
	}
	
	
	static void printleader(int ar[]) {
		
		int count=0;
		
		for(int i=0;i<ar.length-1;i++)
		{
			count=0;
		
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>=ar[j])
				{
					count++;
				}
			
			}
			
			
			if(count==(ar.length-1)-i)
			{
				System.out.print(ar[i]+" ");
			}
		}
		
		System.out.print(ar[ar.length-1]);
		
		
	}
}
