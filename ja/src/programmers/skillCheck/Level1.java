package programmers.skillCheck;

public class Level1 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println(solution(s));
	}

	public static String solution(String s) {
		String answer = "";
		char tmp = 0;

		char[] y = s.toCharArray();
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y.length - j - 1; j++) {
				if (y[j] > y[j + 1]) {
					tmp = y[j];
					y[j] = y[j + 1];
					y[j + 1] = tmp;
				}
			}
		}
		
		return answer = y.toString();
	}
}
