package javaProgramas;

import java.util.Scanner;

public class StrongNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		do
		{
			int d=num%10;
			int fact=1;
			while(d>1)
			{
				fact*=d;
				d--;
			}
			sum+=fact;
			num=num/10;
		}
		while(num!=0);
		if(sum==temp)
		{
			System.out.println("Strong no");
		}
		else
		{
			System.out.println("Not strong no");
		}
		
		
	}

}
