package problems.october2020.level2;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Solution2ans {
	public static void main(String[] args) {
		String msg = "KAKAO";
		for (Integer returned : solution(msg)) {
			System.out.println(returned);
		}
	}

	public static int[] solution(String s) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<>();
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 1; i < 27; i++) {
			map.put(String.valueOf((char) (i + 64)), i);
		}

		for (int i = 0; i < s.length(); i++) {
			int j;
			boolean flag = false;
			for (j = 1; j < s.length() - i + 1; j++) {
				String cmp = s.substring(i, i + j);
				String cur = s.substring(i, i + j - 1);
				if (!map.containsKey(cmp)) {
					list.add(map.get(cur));
					map.put(cmp, map.size() + 1);
					flag = true;
					break;
				}
			}
			if (!flag)
				list.add(map.get(s.substring(i)));
			i += j - 2;
		}
		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		int[] r = solution(s);
//		for(int i : r) {
//			System.out.println(i);
//		}
//	}
}
