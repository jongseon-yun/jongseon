package problems;

public class Solution11 {
	public static void main(String[] args) {

		System.out.println(solution("AB", 1));
	}

	public static String solution(String s, int n) {
		String answer = "";
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {

			if (chars[i] >= 97 && chars[i] <= 122) {
				chars[i] = (char) (chars[i] + n);
				if (!(chars[i] >= 97 && chars[i] <= 122)) {
					chars[i] = (char) (chars[i] - (26));
				}
			} else if (chars[i] >= 65 && chars[i] <= 90) {
				chars[i] = (char) (chars[i] + n);
				if (!(chars[i] >= 65 && chars[i] <= 90)) {
					chars[i] = (char) (chars[i] - (26));
				}
			}

		}
		answer = String.valueOf(chars);
		return answer;
	}
}
