package programs;
import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		System.out.println("enter how many numbers");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		displayfibonacci(num);

	}
	static void displayfibonacci(int n) {
		int x=1,y=0,z=0,count=1;
		while(count<=n) {
			System.out.print(z+"   ");
			z=x+y;
			x=y;
			y=z;
			count++;
		}
	}

}
