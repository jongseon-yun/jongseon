package codingTest.winterinternship;

public class Solution3 {
	public static void main(String[] args) {
		int n = 0;
		int[][] delivery = { { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 2, 2, 2, 1 }, { 0, 0, 0, 2 } };
		for (int i = 0; i < solution(delivery).length; i++) {
			System.out.println(solution(delivery)[i]);
		}
	}

	private static int[] solution(int[][] v) {

		int x = 0, y = 0, z = 0;
		boolean tf = false;

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {

				if (i == 0) {
					// ��0
					if (v[i][j] == 0) {
						x = 1;// �ش��ϴ°� ������ ������ ��������.
					}

					// ����1
					else if (v[i][j] == 1) {
						y = 1;

					}

					// ����2
					else if (v[i][j] == 2) {
						z = 1;
					}
				}

				// ��0
				if (v[i][j] == 0) {
					x = 1;// �ش��ϴ°� ������ ������ ��������.
					if (v[i-1][j]!=v[i][j]) {
						
					}
				}

				// ����1
				else if (v[i][j] == 1) {
					y = 1;

				}

				// ����2
				else if (v[i][j] == 2) {
					z = 1;
				}

			}
		}
		int[] answer = { x, y, z };
		return answer;
	}
}
