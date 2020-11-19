package programmers.problems.previous;

import java.util.HashMap;
import java.util.Iterator;


class Solution {
	
	public static String solution2(String[] participant, String[] completion) {
		String answer = "";
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		
		for (int i = 0; i < participant.length; i++) {
			map.put( i,participant[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			map2.put( i,completion[i]);
		}
		
		for (int i = 0; i < participant.length; i++) {
			
			for(int j = 0; j < completion.length; j++) {
				if (map.get(i).equals(map2.get(j))) {
					map.remove(i);
					map2.remove(j);
					break;
				}
			}
		}
		
		Iterator<Integer> mapIter = map.keySet().iterator();
		
		while (mapIter.hasNext()) {
			int key = mapIter.next();
            answer = map.get( key );
			
		}
		return answer;
	}
	
		
	/* 모범답안 */
	    public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
	        for (String player : completion) hm.put(player, hm.get(player) - 1);

	        for (String key : hm.keySet()) {
	            if (hm.get(key) != 0){
	                answer = key;
	            }
	        }
	        return answer;
	    }


	public static void main(String[] args) {
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav"};
		System.out.println(solution(participant, completion));
	}
}
