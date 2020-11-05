package problems.previous;

public class Solution10 {
	public static void main(String[] args) {
		System.out.println(solution("qwer"));
	}

	public static String solution(String s) {
		String answer = "";
		int x = s.length();
		if (x % 2 == 0) {
			answer = s.substring(x / 2 - 1, x / 2 + 1);
		} else if (!(x % 2 == 0)) {
			answer = s.charAt(x / 2) + "";
		}
		return answer;
	}
}
