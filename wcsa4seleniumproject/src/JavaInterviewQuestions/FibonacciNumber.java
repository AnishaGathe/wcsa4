package JavaInterviewQuestions;

public class FibonacciNumber {
	public static void main(String[] args) {
		//A series of a number in which each number is the sum of the two preceding number
		int i1=0;
		int i2=1;
		int count=10;
		for(int i=1;i<=count;i++)
		{
			int i3=i1+i2;
			System.out.println(i3);
			i1=i2;
			i2=i3;
		}
		}
	}


