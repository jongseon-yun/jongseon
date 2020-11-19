package programmers.problems.october2020.level2.thursday1029;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	public static void main(String[] args) {
		String msg = "KAKAO";
		for (Integer returned : solution(msg)) {
			System.out.println(returned);
		}
	}

	@SuppressWarnings("finally")
	private static int[] solution(String msg) {
		int[] answer = {};
		String w = "";
		int x = 0;
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<String> first = new ArrayList<String>();
//        char[] first = new char[26];
		for (int i = 0; i < 26; i++) {
			char temp = (char) (65 + i);
			first.add(String.valueOf(temp));
		} // 첫번 째 사전에 해당하는 배열 초기화.

		for (int i = 0; i < msg.length(); i++) {
			for (int j = 0; j < first.size(); j++) {
				w = String.valueOf(msg.charAt(i));
				if (first.get(j).equals(w)) {
					boolean res = true;
					for (int z = 0; z < first.size(); z++) {
						try {
							if (first.get(z).equals(msg.substring(i, i + 2))) {
								x = z;
								res = false;
							}
						} catch (Exception e) {
							// TODO: handle finally clause
							if (first.get(z).equals(msg.substring(i - 1))) {
								x = z;
								res = false;
							}
						}
					}

					if (!res) {
						try {
							map.put(x, msg.substring(i, i + 2));
							break;
						} catch (Exception e) {
							// TODO: handle finally clause
							map.put(x, msg.substring(i - 1));
							break;
						}

					}

					if (res) {
						try {
							first.add(msg.substring(i, i + 2));
							map.put(j, w);
							break;
						} catch (Exception e) {
							// TODO: handle finally clause
							first.add(msg.substring(i - 1));
							map.put(j, w);
							break;
						}
					}
				}
			}
		}
		for (String string : first) {
			System.out.print(string);
		}
		return answer;
	}
}
