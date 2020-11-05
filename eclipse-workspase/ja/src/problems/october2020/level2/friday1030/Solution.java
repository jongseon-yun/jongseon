package problems.october2020.level2.friday1030;

public class Solution {
	public static void main(String[] args) {
		int[][] board2 = { { 0, 0, 1, 1 }, { 1, 1, 1, 1 } };
		int[][] board = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
		System.out.println(solution(board2));
	}

	private static int solution(int[][] board) {
		int answer = 0;

		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				int min = 0;
				if (board[i][j] == 1) {
					if (board[i - 1][j - 1] == 0 || board[i - 1][j] == 0 || board[i][j - 1] == 0) {
						board[i][j] += 0;
					} else {
						min = (board[i - 1][j - 1] < board[i - 1][j])
								? (board[i - 1][j - 1] < board[i][j - 1]) ? board[i - 1][j - 1] : board[i][j - 1]
								: (board[i - 1][j] < board[i][j - 1]) ? board[i - 1][j] : board[i][j - 1];
						board[i][j] = board[i][j] + min;
					}
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] > answer) {
					answer = board[i][j];
				}
			}
		}

		return answer * answer;
	}

}
