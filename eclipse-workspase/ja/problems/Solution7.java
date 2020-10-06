package problems;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 2; j < n; j++) {
				if((i==1)||i%j == 0&&!(j==i)) {
					answer++;
					break;
				}
			}
			
		}
		return n - answer;
	}

}
