package javaProgramas;

import java.util.Scanner;

public class PallendromeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		do
		{
			int d=num%10;
			rev=rev*10+d;
			num=num%10;
		}
		while(num!=10);
		if(rev==temp)
		{
			System.out.println("It is pallendrome");
			
		}
		else
		{
			System.out.println("It is not pallendrome");
		}
		
	}

}
