package programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter line of text");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String revString = reverseString(text);
		System.out.println(text);
		System.out.println(revString);

	}

	static String reverseString(String text) {
		String[] words = text.split("  ");
		String revString = " ";
		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			revString = revString + sb.reverse() + " ";

		}

		return revString;
	}

}
// enter strin