package javaProgramas;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
		boolean isprime=true;
		for(int j=2;j<1;j++)
		{
			if(i%j==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
			System.out.println(i);
		}
	}
}


