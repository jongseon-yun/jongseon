package problems.october2020.level2.thursday1029;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		String msg = "KAKAO";
		for (Integer returned : solution(msg)) {
			System.out.println(returned);
		}
	}

	private static int[] solution(String msg) {
		int[] answer = {};
		String w = "";
		int x = 0;
		List<String> first = new ArrayList<String>();
//        char[] first = new char[26];
		for (int i = 0; i < 26; i++) {
			char temp = (char) (65 + i);
			first.add(String.valueOf(temp));
		} // ù�� ° ������ �ش��ϴ� �迭 �ʱ�ȭ.

		
		for (String string : first) {
			System.out.println(string);
		}
		
		return answer;
	}
}
