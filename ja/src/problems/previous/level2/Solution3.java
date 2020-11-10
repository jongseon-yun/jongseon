package problems.previous.level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution3 {

	public static void main(String[] args) {
		String arr[] = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		System.out.println(solution(arr));
	}

	public static String[] solution(String[] record) {
		String[] answer = {};
		Map<String, String> keymap = new HashMap<String, String>();

		for (int i = 0; i < record.length; i++) {
			String[] temp = record[i].split(" ");
			for (int j = 0; j < temp.length; j++) {
				System.out.println(temp[i]);
			}
			if (temp[i].equals("Enter") || temp[i].equals("Leave")) {

			}
		}

		return answer;
	}

}
