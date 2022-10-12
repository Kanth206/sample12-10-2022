package programs;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
 
		System.out.println("enter number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		Factorial f=new Factorial();   // method call for getting fact
		int fact=f.factorial(num);
		System.out.println("factorial="+fact);
		

	}
	 int factorial(int a) 
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact *= i;
		}
		
		return fact;
	}

}
