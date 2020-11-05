package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Level2 {
	public static void main(String[] args) {

	}

	public boolean solution(String[] phone_book) {
		boolean answer = true;
		List<String> array = new ArrayList();
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
