package programmers.problems.october2020.level2.tuesday1103.ans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution3 {
	public static void main(String[] args) {

	}

	public int solution(int[] priorities, int location) {
		// answer�� ���� ���ϴ� ����Ʈ�� ��� ����
		// index�� �켱������ ���� ���ϴ� �迭�� index�� ǥ���ϱ� ���� ����
		// max_change�� max_change�� 0�� ���� �켱���� �ִ밪�� ������ �ʰ�
		// 1 �϶��� �켱������ ������Ѿ� �Ѵٴ� ���� ǥ���ؾ��ϴ� ����
		int answer = 0;
		int index = 0;
		int max_change = 0;

		List<Integer> prior = new ArrayList();

		for (int i = 0; i < priorities.length; i++) {
			prior.add(priorities[i]);
		}

		// Collections.max()�� ����ϸ� ���ϴ� �ִ밪�� ã�Ⱑ ���� ������������ ����� ����Ͽ���.
		Collections.sort(prior);
		Collections.reverse(prior);
		int max = prior.get(0);

		while (true) {
			// index�� ���鼭 max���� �������� ����Ʈ�ϰ� �� ���� -1�� ������ش�.
			// �ϳ��� ����Ͽ����Ƿ� answer�� �߰���Ű�� �ִ� �켱������ ���� ����Ʈ�� ��µǾ����Ƿ�,
			// max_change ����ġ�� 1�� �ٲ��ش�.
			if (priorities[index] == max) {
				priorities[index] = -1;
				answer++;
				max_change = 1;
			} else {
				// index�� �����ϱ� ���ؼ� �ִ밪�� �ƴ϶�� 1�� ���������ְ� ������ ���ٸ� 0���� ������ش�.
				if (index == priorities.length - 1) {
					index = 0;
				} else {
					index++;
				}
			}

			// ���ϴ� location�� ����Ʈ�� ��µǾ -1�� �ȴٸ� break�Ѵ�.
			if (priorities[location] == -1) {
				break;
			}

			// max_change�� 1�� �Ǹ� ������ �ִ� �켱������ �������ְ� max�� �ٲ��ش�.
			// max_change�� 0���� �ٽ� ������ ����ġ�� ���ش�.
			if (max_change == 1) {
				prior.remove(0);
				max = prior.get(0);
				max_change = 0;
			}
		}

		return answer;
	}
}
