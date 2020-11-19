package programmers.problems.october2020.level2.tuesday1103.ans;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Solution {
	public static void main(String[] args) {
		int priorities[] = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		System.out.println(solution(priorities, location));
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Printer> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) { // printť�� �ε�����ȣ, �켱���� ����
			q.offer(new Printer(i, priorities[i]));
		}

		while (!q.isEmpty()) {

			boolean flag = false;
			int com = q.peek().prior;
			for (Printer p : q) {
				if (com < p.prior) { // �Ǿ��� ������ ū ���ڰ� �����ϸ�
					flag = true;
				}
			}

			if (flag) {
				q.offer(q.poll());
			} else {// ���� �Ǿ��� ���ڰ� ���� Ŭ ��
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
				}
			}
		}
		return answer;
	}

}

class Printer {
	int location;
	int prior;

	Printer(int location, int prior) {
		this.location = location;
		this.prior = prior;
	}
}
