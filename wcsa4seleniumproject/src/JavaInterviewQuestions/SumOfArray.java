package JavaInterviewQuestions;

public class SumOfArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		for(int i=1;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
