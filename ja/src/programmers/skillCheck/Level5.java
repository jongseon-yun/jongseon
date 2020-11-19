package programmers.skillCheck;

import java.util.ArrayList;
import java.util.List;

public class Level5 {
	public static void main(String[] args) {
		String s = "1234";
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		boolean answer = false;
		String number = "1234567890";
		if (s.length() == 4) {
			for (int i = 0; i < s.length(); i++) {
				if (number.contains(Character.toString(s.toCharArray()[i]))) {
					return true;
				} else {
					return false;
				}
			}
		} else if (s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				if (number.contains(Character.toString(s.toCharArray()[i]))) {
					return true;
				} else {
					return false;
				}
			}
		}
		return answer;
	}
}
