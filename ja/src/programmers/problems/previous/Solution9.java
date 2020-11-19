package programmers.problems.previous;

import java.util.Scanner;

public class Solution9 {
	public static void main(String[] args) {
		
		System.out.println(solution(123));
		
		System.out.println(solution2("ssssyyyy"));
	}

	private static boolean solution2(String string) {
		// TODO Auto-generated method stub
		boolean answer = true;
		
		if (!string.isEmpty()) {
			
			int p = 0,y = 0;
			char[] chars ;
			
			for (int i = 0; i < string.length(); i++) {
				chars=string.toCharArray();
				if (chars[i]=='p'||chars[i]=='p'-32) {
					p++;
				}else if (chars[i]=='y'-32||chars[i]=='y') {
					y++;
				}
			}
			if (y==p) {
				answer = true;
			}else {
				answer = false;
			}
		}
		return answer;
	}

	public static int solution(int n) {
		int answer = 0;

		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}
}
