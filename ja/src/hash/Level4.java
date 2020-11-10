package hash;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import static java.util.stream.Collectors.*;

public class Level4 {
	public static void main(String[] args) {
		String[][] clothes = { { "1", "eye" }, { "2", "eye" }, { "3", "face" } };
		System.out.println(solution2(clothes));
	}

	private static int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
		Iterator<Integer> it = map.values().iterator();
		while (it.hasNext()) {
			answer *= it.next().intValue() + 1;
		}
		return answer - 1;
	}

	
	private static int solution2(String[][] clothes) {
		var map = new HashMap<String, Integer>();
		for (String[] strings : clothes) {
			int p = 0;
			String key = strings[1];
			if (map.containsKey(key)) {
				p = map.get(key);
			}
			map.put(key, p + 1);
		}
		Collection<Integer> values = map.values();
		Integer[] counts = new Integer[values.size()];
		values.toArray(counts);

		int[][] dp = new int[values.size()][2];
		dp[0][0] = 1;
		dp[0][1] = counts[0];
		for (int i = 1; i < dp.length; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
			dp[i][1] = dp[i - 1][0] * counts[i] + dp[i - 1][1] * counts[i];
		}

		return dp[dp.length - 1][0] + dp[dp.length - 1][1] - 1;
	}

	
	private static int solution3(String[][] clothes) {
		return Arrays.stream(clothes).
				collect(groupingBy(p -> p[1], mapping(p -> p[0], counting()))).
				values().stream().collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	}

}
