package test;
import java.util.Scanner;

public class ScannerTest {

	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int a = sc.nextInt();
//		System.out.println("Value : "+a);
		//to take character a input
		char c = sc.next().charAt(0); //abc
		System.out.println("value: "+c);
	}
	
}
