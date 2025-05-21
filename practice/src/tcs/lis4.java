package tcs;
import java.util.*;
public class lis4 {
	public static void main(String[] args) {
		int[] arr1= {67,78,76,65,43,47};
		Arrays.sort(arr1);
		int a=Arrays.binarySearch(arr1, 90);
			System.out.println(a);
			for(int b1:arr1)
				System.out.println(b1);
			System.out.println();
}
}
