package programmers.problems.nomember2020.level2.tuesday1110.ans;

public class Solution2 {

	private static int answer = 0;

	public static int solution(int[] numbers, int target) {
		dfs(numbers, target, 0);
		return answer;
	}

	private static void dfs(int[] numbers, int target, int i) {
		// TODO Auto-generated method stub
		if (i == numbers.length) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			if (sum == target) {
				answer++;
			}
		} else {
			numbers[i] *= 1;
			dfs(numbers, target, i + 1);
			numbers[i] *= -1;
			dfs(numbers, target, i + 1);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println(solution(numbers, target));
	}
}
