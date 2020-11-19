package programmers.problems.previous.level2;

import java.util.HashMap;
import java.util.Iterator;

class Solution {

	public static void main(String[] args) {
		System.out.println(solution(15));
	}

	/* 모범답안 */
	public static int solution(int n) {
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			int x = 0;
			for (int j = i; x <= n; j++) {
				x += j;
				if (x == n) {
					answer += 1;
				}
			}
		}
		
		return answer;

	}

}
