package beaver.password;

import java.util.Random;

public class passwordGen {
	public static void main(String[] args) {
		System.out.println(solution(8));
	}

	private static String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {

			int x = (int) (Math.random() * 123) + 65;
			if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
				answer = (char) x + answer;
			}else {
				i--;
			}
		}
		return answer;
	}
}
