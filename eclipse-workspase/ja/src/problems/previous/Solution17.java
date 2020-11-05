package problems.previous;

public class Solution17 {
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}

	public static boolean solution(String s) {
		boolean answer = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > (char) 9 ||  s.charAt(i) < (char) 0) {
				answer = false;
				break;
			}
		}
		return answer;
	}
}
