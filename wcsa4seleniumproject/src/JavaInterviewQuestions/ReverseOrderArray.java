package JavaInterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderArray {
	public static void main(String[] args) {
		
		Integer a[]= {12,40,60,50,20};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting:"+Arrays.toString(a));
		
}
}
