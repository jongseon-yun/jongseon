package problems.nomember2020.level2.tuesday1110;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int x = nums.length / 2;
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i] + 1));
			}
			map.put(nums[i], 1);
		}
		if (x > map.size()) {
			answer = map.size();
		}else {
			answer = x;
		}

		return answer;
	}
}
