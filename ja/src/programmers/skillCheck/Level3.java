package programmers.skillCheck;

import java.util.ArrayList;
import java.util.List;

public class Level3 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,0};
		String hand = "right";
		System.out.println(solution(numbers,hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		String x = "";
		for (int i = 0; i < numbers.length; i++) {
			if (hand.equals("right")) {
				x = "2580369";
				if (x.contains(Integer.toString(numbers[i]))) {
					answer = answer + "R";
				}else {
					answer = answer + "L";
				}
			}else {
				x = "1372580";
				if (x.contains(Integer.toString(numbers[i]))) {
					answer = answer + "L";
				}else {
					answer = answer + "R";
				}
			}
		}
		return answer;
	}
}
