package JavaInterviewQuestions;

import java.util.Scanner;

public class LargestOfThreeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a FirstNo");
		int a=sc.nextInt();
		System.out.println("Enter a SecondNo");
		int b=sc.nextInt();
		System.out.println("Enter a ThirdNo");
		int c=sc.nextInt();
		if(a>b&&a>c)
		{
			System.out.println(a+"is the largest no");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+"is the largest no");
		}
		else
		{
			System.out.println(c+"is the largest no");
		}
	}

}
