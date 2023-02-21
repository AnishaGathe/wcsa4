package JavaInterviewQuestions;

public class ReverseOfString {
	public static void main(String[] args) {
		//using concatination of string
		String str="ABCD";
		String rev=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
		rev=rev+str.charAt(i);
		}
		
	}
	


}



