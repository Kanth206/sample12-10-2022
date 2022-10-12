package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner sc= new Scanner(System.in);
		String word=sc.next();
		if(ispalindrome(word))
		{
			System.out.println( "\" "+word+"\" is palindrom");
			
		}
		else
		{
			System.out.println( "\" "+word+"\" is NOT palindrom");
		}

	}
	static  boolean ispalindrome(String word)
	{
		int fIndex=0,bIndex=word.length()-1;
		while(fIndex<=bIndex) {

		char startchar=word.charAt(fIndex);
		char endchar=word.charAt(bIndex);
		if(startchar!=endchar)
			return false;
		fIndex++;
		bIndex--;
		}
		
		return true;
	}

}
