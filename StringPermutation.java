package day_4;

import java.util.*;

public class StringPermutation {

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no. of test cases: ");
	
	int t=sc.nextInt();
	
	for(int i=0;i<t;i++) {	
	
		System.out.println("Enter the string: ");
		
		String s1=sc.next();
		
		findPermutation(s1,"");
		
		System.out.println();
	}
	
	sc.close();
	
	
}

static void findPermutation(String str , String str1) {
	
	if (str.length() == 0) { 
 
		System.out.print(str1 + " "); 
        
		return; 
    }
	
    for (int i = 0; i < str.length(); i++) { 
    
    	char ch = str.charAt(i); 
        
    	String ros = str.substring(0, i) + str.substring(i + 1); 
        
    	findPermutation(ros, str1 + ch); 
    } 
}

}
