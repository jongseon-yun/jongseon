package programmers.problems.nomember2020.level2.monday1116;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] scoville = {};
		int k = 0;
		System.out.println(sol.solution(scoville, k));
		;
	}

	public int solution(int[] scoville, int K) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < scoville.length; i++) {
			list.add(scoville[i]);
		}
		boolean x = false;
		int y = 0;
		for (int i = 0; i < list.size() - 1; i++) {
			x = (i == 0) ? false : true;
			y = (list.get(i) > list.get(i + 1)) ? list.get(i + 1) : y;
		}

		return answer;
	}
}
