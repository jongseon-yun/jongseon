package programmers.problems.october2020.level2.tuesday1103.ans;

import java.util.*;

//������
//���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ���
class Solution2 {
	public int solution(int[] priorities, int location) {
		int answer = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			q.offer(priorities[i]);
		}

		while (!q.isEmpty()) {
			// ���� �տ� �ִ� ������ �켱 �������� �� ū �� �ִ��� üũ
			boolean flag = false;
			for (int i = 1; i < q.size(); i++) {
				if (q.peek() < (int) (q.toArray()[i])) {
					flag = true;
					break;
				}
			}

			for (int i = 0; i < q.size(); i++) {
				System.out.print(q.toArray()[i] + ",");
			}
			System.out.println();

			// priorities�� �켱 ������ �� ū ��찡 �ִ� ���
			if (flag) {
				// �ش� ��ġ�� ���� �� �ڷ� ����
				q.offer(q.poll());

				// poll�� �����Ƿ� �ش� ��ġ�� ���� �ϳ��� ������ ����µ�
				location--;
				// location < 0 �̸� location ���� ���� �ڷ� �����Ƿ� q.size()-1
				if (location < 0) {
					location = q.size() - 1;
				}
			}
			// q.peek()�� �켱 ���� �� ũ�ų� ���� ���
			else {
				// location�� 0�� ��찡 ���� �ձ��� �� ���
				if (location == 0) {
					answer++;
					q.clear();
				} else {
					q.poll();
					answer++;
					// poll�� �����Ƿ� �ش� ��ġ�� ���� �ϳ��� ������ ����µ�
					location--;
					// location < 0 �̸� location ���� ���� �ڷ� �����Ƿ� q.size()-1
					if (location < 0) {
						location = q.size() - 1;
					}
				}
			}
		}

		return answer;
	}
}