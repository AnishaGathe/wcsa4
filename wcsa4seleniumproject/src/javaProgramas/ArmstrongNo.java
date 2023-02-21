package javaProgramas;

import java.util.Scanner;

public class ArmstrongNo {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int sum=0;
	int temp=num;
	do
	{
		int d=num%10;
		sum+=d*d*d;
		num=num/10;
	}
	while(num!=0);
	if(sum==temp)
	{
		System.out.println("This no is armstrong");
	}
	else
	{
		System.out.println("This no is not armstrong");
	}
}
}
