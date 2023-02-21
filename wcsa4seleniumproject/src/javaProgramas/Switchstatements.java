package javaProgramas;

import java.util.Scanner;

public class Switchstatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
	switch (num%2)
	{
	case 0:
		System.out.println("even no");
		break;
	case 1:
		System.out.println("odd no");
		break;
		
	}
	
	
	
	
	}

}
