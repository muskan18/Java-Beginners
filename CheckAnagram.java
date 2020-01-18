package day_1;

import java.util.*;

public class CheckAnagram {

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		
		String st1 = sc.nextLine();
		
		System.out.println("Enter the second string");
		
		String st2 = sc.nextLine();
		
		st1.toLowerCase();
		
		st2.toLowerCase();
		
		sc.close();
		
		int flag = chekanagram(st1,st2);
		
		if(flag==1)
			System.out.println("Anagrams");
		
		else
			System.out.println("Not Anagrams");
		
		
	}
	
	
	static int chekanagram(String s,String s1)
	{
		char ch [] = s.toCharArray();
		
		char ch1[] = s1.toCharArray();
		
		Arrays.sort(ch);
		
		Arrays.sort(ch1);
		
		
		s = new String(ch);
		
		s1 = new String(ch1);
		
		
		if(s.equals(s1))
		{
			return 1;
		}
		
		else return -1;
		
		
	}
	
}
