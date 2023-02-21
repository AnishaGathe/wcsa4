package JavaInterviewQuestions;

import java.util.Scanner;

public class Reversemethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) 
		{
			 rev=rev*10+num%10;
			 num=num/10;
		}
		System.out.println(rev);	
	}
}


//rev=0*10+1234%10=4
//num=1234/10=123