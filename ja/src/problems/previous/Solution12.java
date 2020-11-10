package problems.previous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution12 {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4};
		solution(x);
	}

	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] x = new int[answers.length], y = new int[answers.length], z = new int[answers.length];
		int[] x1 = { 1, 2, 3, 4, 5 }, y1 = { 2, 1, 2, 3, 2, 4, 2, 5 }, z1 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] ans = new int[3];
		for (int i = 0; i < x.length; i++) {
			x[i] = x1[i % x1.length];
		}
		for (int i = 0; i < y.length; i++) {
			y[i] = y1[i % y1.length];
		}
		for (int i = 0; i < z.length; i++) {
			z[i] = z1[i % z1.length];
		}
		
		int x2= 0,y2= 0,z2 = 0;
		
		for (int i = 0; i < x.length; i++) {
			if(answers[i] == x[i]) {
				x2++;
			}else if (answers[i] == y[i]) {
				y2++;
			}else if (answers[i] == z[i]) {
				z2++;
			}
		}
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		hash.put(1, x2);
		hash.put(2, y2);
		hash.put(3, z2);
		
		List<Integer> keySetList = new ArrayList<>(hash.keySet());
		Collections.sort(keySetList,(o1, o2) -> (hash.get(o1).compareTo(hash.get(o2))));
		for(Integer key : keySetList) {
			System.out.println("key : " + key + " / " + "value : " + hash.get(key));
		}
		return answer;
	}
}
