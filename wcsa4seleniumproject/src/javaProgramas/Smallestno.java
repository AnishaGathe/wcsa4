package javaProgramas;

import java.util.Scanner;

public class Smallestno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		if(a<b&&a<c&&a<d&&a<e)
		{
			System.out.println("a is smallest");
		}
		else if(b<c&&b<d&&b<e)
		{
			System.out.println("b is smallest");
		}
		else if(c<d&&c<e)
		{
			System.out.println("c is smallest");
		}
		else if (d<e)
		{
		System.out.println("d is smallest");
		}
		else
		{
			System.out.println("e is smallest");
		}
	}

}
