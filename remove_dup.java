package day_2;

import java.util.*;

public class remove_dup 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the no of test cases");
		
		int test=sc.nextInt();
		
		for(int i=0;i<test;i++)
		{
			System.out.println("Enter the string");
		
			String s=sc.next();
			
			rem(s);
	
		}
		
		sc.close();
	}

	static void rem(String s)
	{
		String res="";

		if(s.charAt(0)!=s.charAt(1))
		{
			res=res+s.charAt(0);
		}
		
		for(int i=1;i<s.length()-1;i++)
		{
			if((s.charAt(i)!=s.charAt(i-1))&&(s.charAt(i)!=s.charAt(i+1)))
			{
				res+=s.charAt(i);
			}
		}
		
		if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))
		{
			res=res+s.charAt(s.length()-1);
		}
		
		System.out.println(res);
	}
	
	
}