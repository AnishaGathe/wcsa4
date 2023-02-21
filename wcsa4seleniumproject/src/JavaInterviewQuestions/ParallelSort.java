package JavaInterviewQuestions;

import java.util.Arrays;

public class ParallelSort {
	public static void main(String[] args) {
		int a[]= {12,40,60,50,20};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after sorting:"+Arrays.toString(a));
		
	}

}
