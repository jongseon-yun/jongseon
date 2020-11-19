package programmers.problems.october2020.level2.tuesday1103.ans;

import java.util.*;

//프린터
//내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지
class Solution2 {
	public int solution(int[] priorities, int location) {
		int answer = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			q.offer(priorities[i]);
		}

		while (!q.isEmpty()) {
			// 가장 앞에 있는 순서의 우선 순위보다 더 큰 것 있는지 체크
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

			// priorities에 우선 순위가 더 큰 경우가 있는 경우
			if (flag) {
				// 해당 위치의 값을 맨 뒤로 보냄
				q.offer(q.poll());

				// poll을 했으므로 해당 위치의 값을 하나씩 앞으로 땡기는데
				location--;
				// location < 0 이면 location 값이 제일 뒤로 갔으므로 q.size()-1
				if (location < 0) {
					location = q.size() - 1;
				}
			}
			// q.peek()이 우선 순위 젤 크거나 같은 경우
			else {
				// location이 0일 경우가 가장 앞까지 온 경우
				if (location == 0) {
					answer++;
					q.clear();
				} else {
					q.poll();
					answer++;
					// poll을 했으므로 해당 위치의 값을 하나씩 앞으로 땡기는데
					location--;
					// location < 0 이면 location 값이 제일 뒤로 갔으므로 q.size()-1
					if (location < 0) {
						location = q.size() - 1;
					}
				}
			}
		}

		return answer;
	}
}