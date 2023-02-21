package javaProgramas;

import java.util.Scanner;

public class Arraystatements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		String s[]= {"even","odd"};
		System.out.println(num+"is a"+s[num%2]);
		System.out.println(s[0]);
		System.out.println(s[1]);
	}

}
