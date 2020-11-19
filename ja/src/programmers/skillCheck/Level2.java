package programmers.skillCheck;

import java.util.ArrayList;
import java.util.List;

public class Level2 {
	public static void main(String[] args) {
		System.out.println(solution(4,3));
	}

	public static long[] solution(int x, int n) {
		long[] answer = new long[n];
		for (int i = 0; i < n; i++) {
			answer[i] = x;
			x += x;
		}
		System.out.println(answer);
		return answer;
	}
}
