package programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class Level3 {
	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		for (int j = 0; j < solution(genres, plays).length; j++) {
			System.out.println(solution(genres, plays)[j]);
		}
	}

	private static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		int i;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int j = 0; j < genres.length - 1; j++) {
			for (int j2 = j + 1; j2 < genres.length; j2++) {
				map.put(genres[j], j);
				if (map.containsKey(genres[j2])) {
					map.put(genres[j], j + 1);
				}
			}
		}

		
		for (int j = 0; j < map.size(); j++) {
			
		}
		
		
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int j = 0; j < plays.length; j++) {
			for (int j2 = 0; j2 < plays.length; j2++) {

			}
		}

		for (int j = 0; j < genres.length - 1; j++) {
			for (int j2 = j + 1; j2 < genres.length; j2++) {
				if (plays[j] < plays[j2]) {
					int temp = plays[j];
					plays[j] = plays[j2];
					plays[j2] = temp;

				}
			}
		}
		return answer;
	}
}
