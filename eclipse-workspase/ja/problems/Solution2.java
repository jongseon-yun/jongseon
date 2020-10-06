package problems;

import java.util.ArrayList;
import java.util.List;

class Solution2 {

	public static void main(String[] args) {
		String[] phone_book = {"12","123","1235","567","88"};
		System.out.println(solution(phone_book));
	}

	private static boolean solution(String[] phone_book) {
		// TODO Auto-generated method stub
		boolean answer = true;
		List<String> array = new ArrayList<>();
		for (int i = 0; i < phone_book.length; i++) {
			array.add(phone_book[i]);
		}
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {				
				if (array.get(i).contains(phone_book[j])) {
					if (phone_book[i].compareTo(array.get(j)) != 0)
						return false;
				}
			}
			
		}

		return answer;
	}

}
