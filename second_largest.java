package day_3;

import java.util.*;

public class second_largest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<n;i++)
		{
			
			ar[i] = sc.nextInt();
			
		}
		
		sc.close();
		
		largest(ar);
		
	}
	
	
	static void largest(int ar[])
	{
		int n = ar.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(ar[i]<ar[j])
				{
					int temp = ar[i];
					
					ar[i]=ar[j];
					
					ar[j]=temp;
				}
			}
		}
		
		System.out.println("Largest : " +ar[0]);
		System.out.println("Second Largest : "+ar[1]);
		
	}
	
}
