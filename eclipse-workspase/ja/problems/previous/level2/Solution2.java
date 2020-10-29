package problems.previous.level2;


class Solution2 {

	public static void main(String[] args) {
		String arr = "Enter uid1234 Muzi";
		char tt = 'a';
		System.out.println((int) tt);
		System.out.println(solution(arr));
	}

	public static String solution(String s) {
        String answer = "";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        answer = String.copyValueOf(arr);
        return answer;
    }
	public static String solution2(int num) {
		String answer  = null;
		answer  = (num%2 == 0) ? "Even":"Odd";
		return answer;
	}
}
