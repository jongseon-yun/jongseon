package problems;

public class Solution6 {
	public static void main(String[] args) {
		String str = "Zbcdefg";
		System.out.println(Solution(str));
	}

	public static String Solution(String str) {
		String answer = null;
		char temp;
		char[] answer2 = str.toCharArray();
		for (int i = str.length() - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (answer2[j] < answer2[i]) {
					temp = answer2[j];
					answer2[j] = answer2[i];
					answer2[i] = temp;
				}
			}
		}
		answer = String.valueOf(answer2);
		return answer;
	}
}
