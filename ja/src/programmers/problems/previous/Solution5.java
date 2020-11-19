package programmers.problems.previous;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Long solution2(int a, int b) {
		Long answer = 0L;
		if (a==b) {
			answer = (long) a;
			return answer;
		}else if(b>a){
			for (int i = a; i <= b; i++) {
				answer += i;
			}
			return answer;
		}else if(a>b) {
			for (int i = b; i <= a; i++) {
				answer += i;
			}
			return answer;
		}
		
		return answer;
	}
	
	/* 첫번째 재출답.
	 * 
	 *  
	 *  
	 *  */
	public long solution(int a, int b) {
        long answer = 0;
        if (a==b) {
			answer = (long) a;
			return answer;
		}else if(b>a){
			for (int i = a; i <= b; i++) {
				i += i;
				return (long)i;
			}
		}else if(a>b) {
			for (int i = b; i <= a; i++) {
				i += i;
				return (long)i;
			}
		}
		
        return answer;
    }

}
