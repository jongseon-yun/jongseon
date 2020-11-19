package programmers.problems.nomember2020.level2.monday1116;

public class Solution {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[][] board = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 1, 0 } };
		System.out.println(sol.solution(board));
		;
	}

	public int solution(int[][] board) {
		int answer = 0;
		for (int i = 1; i < board[0].length; i++) {
			if (board.length==1&&board[i].length==1) {
				return 1;
			}
			for (int j = 1; j < board.length; j++) {
				if (board[i][j] == 1) {
					int x = board[i - 1][j - 1], y = board[i - 1][j], z = board[i][j - 1];
					//if (x >= 1 && y >= 1 && z >= 1) {
						x = (x < y) ? (y < z) ? y : z : (x < z) ? x : z;
						board[i][j] = board[i][j] + x;
					//}
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

				answer = (answer < board[i][j]) ? board[i][j] : answer;
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		return answer * answer;
	}
}
