package problems.previous;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 3, 3, 0, 1, 1 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(solution(arr)[i]);
		}
	}

	public static int[] solution(int[] arr) {
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
