package problems.october2020.level2.tuesday1103;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int priorities[] = { 1, 1, 9, 1, 1, 1, 1, 1 };
		int location = 0;
		System.out.println(solution(priorities, location));
	}

	private static int solution(int[] priorities, int location) {
		int answer = 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			list.add(priorities[i]);
		}

		for (int i = 0; i < priorities.length - 1; i++) {
			for (int j = 1 + i; j < priorities.length; j++) {
				if (list.get(i) < list.get(j)) {
					list.add(list.get(i));
					list.remove(i);
					answer++;
					i--;
					break;
				}
			}
		}
		if (location - answer >= 0) {
			answer = location - answer + 1;
		} else {
			answer = priorities.length - answer + 1;
		}

//		for (int i = 0; i < priorities.length - 1; i++) {
//			int temp = 0;
//			for (int j = 1; j < priorities.length; j++) {
//				if (priorities[i]<priorities[j]) {
//					temp = priorities[priorities.length];
//					priorities[priorities.length] = priorities[i];
//					
//				}
//			}
//		}
		return answer;
	}
}
