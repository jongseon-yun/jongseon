package problems.previous;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] clothes = { 
				{ "yellow_hat", "headgear" }, 
				{ "green_turban", "headgear" } ,
				{ "blue_sunglasses", "eyewear" } };
		String[][] clothes2 = { 
				{ "crow_mask", "face" }, 
				{ "blue_sunglasses", "face" }, 
				{ "smoky_makeup", "face" } };
		System.out.println(solution(clothes) + ":" + solution(clothes2));
	}

	public static int solution(String[][] clothes) {
		int answer = 0;
		List<String[]> list = new ArrayList<String[]>();
		for (String[] strings : clothes) {
			list.add(strings);
		}
		for (String[] part : list) {
			System.out.println(part);
		}
		return answer;
	}

}
