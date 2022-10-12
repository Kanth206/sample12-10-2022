package programs;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter num1");
		Scanner sc= new Scanner (System.in);
		int num1= sc.nextInt();
		System.out.println("enter num2");
		Scanner sc1= new Scanner (System.in);
		int num2= sc1.nextInt();
		System.out.println("enter operation");
		Scanner sc2= new Scanner (System.in);
		char operator=sc2.next().charAt(0);
		if(operator=='+'||operator=='-'||operator=='*'||operator=='/')
		{
		int res=calculator(num1,num2,operator);
		System.out.println("= "+res);
		}
		else {
			System.out.println("invalid operator");
		}
		

	}
	static int calculator(int a,int b, char operator) {
		int res=0;
		switch(operator) {
		case '+': res=a+b;
		break;
		case '-': res=a-b;
		break;
		case '*': res=a*b;
		break;
		case '/': res=a/b;
		break;
			
		}
		
		return res;
	}

	
}
