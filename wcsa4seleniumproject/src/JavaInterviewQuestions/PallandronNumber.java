package JavaInterviewQuestions;

import java.util.Scanner;

public class PallandronNumber {
	//the numbers after reverse they are same
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("it is a pallendron num");
		}
		else
		{
			System.out.println("it is not pallendron num");
		}
		
	}

}
