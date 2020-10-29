package problems.october2020.level2;

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
		} // 첫번 째 사전에 해당하는 배열 초기화.

		for (int i = 0; i < msg.length(); i++) {
			for (int j = 0; j < first.size(); j++) {
				if (msg.substring(0, i + 1).equals(first.get(j))) {
					w = msg.substring(0, i + 1);
					break;
				}
			}
			for (String string : first) {
				if (string.equals(msg.substring(0, i + 1))) {
					continue;
				}else {
					first.add("");
					x = first.size() + 1;
					break;	
				}
			}
			
		} // 두번 째 사전과 일치하는 가장 문장 w 그에 해당하는 색인번호 구하기 없는 단어를 리스트에 추가하기.
		 
		for (String string : first) {
			System.out.println(string);
		}
		
		return answer;
	}
}
