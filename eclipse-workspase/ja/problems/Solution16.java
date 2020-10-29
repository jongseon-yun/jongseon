package problems;

public class Solution16 {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		int []y = new int[n];
		int x = 1;
		for (int i = 0; i < n; i++) {
			x *= 2;
		}
		x = x - 1;
		
		for (int i = 0; i < arr1.length; i++) {
			y[i] = arr1[i]+arr2[i];
			if (y[i]>x) {
				y[i] = x;
			}
		}

		return answer;
	}
}
