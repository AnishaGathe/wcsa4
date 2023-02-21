package JavaInterviewQuestions;

import org.apache.poi.util.SystemOutLogger;

public class Swappingthenumbers {
	//interchanging the values into the variables is called swapping
	public static void main(String[] args) {
		//swapping two numbers by using third variables
		int a=10;
		int b=20;
		System.out.println("before swapping values are..."+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("after swapping values are..."+a+" "+b);
	}

}
