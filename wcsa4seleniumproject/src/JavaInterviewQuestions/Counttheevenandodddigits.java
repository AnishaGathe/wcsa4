package JavaInterviewQuestions;

public class Counttheevenandodddigits {
	public static void main(String[] args) {
		int num=1234567;
		int even_count=0;
		int Odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				Odd_count++;
			}
			num=num/10;
			System.out.println("number of even count:"+even_count);
			System.out.println("number of odd count:"+Odd_count);
		}
		
		
	}
	

}
