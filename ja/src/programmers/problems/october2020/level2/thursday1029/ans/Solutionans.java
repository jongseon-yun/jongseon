package programmers.problems.october2020.level2.thursday1029.ans;

import java.util.LinkedList;
import java.util.Queue;

public class Solutionans {
	public static void main(String[] args) {
		int m = 4, n = 5;
		String[] board = { "CCBDE", "AAADE", "AAABF", "CCBBF" };
		System.out.println(solution(m, n, board));
	}

	private static int solution(int m, int n, String[] board) {
		int answer = 0;
		char[][] map = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = board[i].charAt(j);
				if (map[i][j] < 'A' || map[i][j] > 'Z') {
					answer++;
				}
			}
		}
		while (true) {
			int cnt = remove(m, n, map);
			if (cnt == 0) {
				break;
			}
			answer += cnt;
			map = move(m, n, map);
		}
		return answer;
	}

	private static char[][] move(int m, int n, char[][] map) {
		// TODO Auto-generated method stub
		char[][] n_map = new char[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				n_map[i][j] = 'x';
			}
		}
		for (int i = 0; i < n; i++) {
			Queue<Character> q = new LinkedList<Character>();
			for (int j = m - 1; j > 0; j--) {
				if (map[j][i] != 'x') {
					q.add(map[j][i]);
				}
			}
			int row = m - 1;
			while (!q.isEmpty()) {
				n_map[row][i] = q.poll();
				row--;
			}
		}
		return n_map;
	}

	private static int remove(int m, int n, char[][] map) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int[][] visit = new int[m][n];
		for (int i = 0; i < m - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (map[i][j] == 'x' && map[i][j] == map[i + 1][j] && map[i][j + 1] == map[i + 1][j + 1]) {
					visit[i][j] = 1;
					visit[i + 1][j] = 1;
					visit[i][j + 1] = 1;
					visit[i + 1][j + 1] = 1;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visit[i][j] == 1) {
					visit[i][j] = 'x';
					cnt++;
				}
			}
		}
		return cnt;
	}
}
