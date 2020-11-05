package problems.previous;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution14 {
	public static void main(String[] args) {
		int x = 3;
		System.out.println(solution(x));
	}

	public static String solution(int n) {
        String answer = "";
        String[] str = {"¼ö","¹Ú"};
        for (int i = 0; i < n; i++) {
			answer += str[i%2];
		}
        
        return answer;
    }
}
