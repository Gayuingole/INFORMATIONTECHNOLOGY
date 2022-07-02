package logicalprogram;

import java.util.Scanner;

//any no. is whose reminder will be o after divide od 2 is even

public class FindevenODD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter number");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("it is a even number");
		}
		else {
			System.out.println("it is odd  number");
		}
		

	}

}
