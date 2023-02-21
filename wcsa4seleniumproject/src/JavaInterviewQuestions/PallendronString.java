package JavaInterviewQuestions;

import java.util.Scanner;

public class PallendronString {
	public static void main(String[] args) {
		//the string remains the same when its characters are reversed
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		String temp=str;
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(temp.equals(rev))
		{
			System.out.println("it is a pallendron");
		}
		else
		{
			System.out.println("it is not pallendron");
		}
	}

}
