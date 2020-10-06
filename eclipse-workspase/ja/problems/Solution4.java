package problems;

public class Solution4 {
	public static void main(String[] args) {
		int[][] v = {{1, 4},{3, 4},{3, 10}};
		System.out.println(solution(v));
	}
	
	public static int[] solution(int[][] v) {
        
		int[] answer = new int[2];

		int x = 0;
        int y = 0;
        
        if(v[0][0]==v[2][0]){
            x=v[1][0];
        }else if(v[1][0]==v[2][0]){
            x=v[0][0];
        }else{
            x=v[2][0];
        }
       
        if(v[0][1]==v[1][1]){
            y=v[2][1];
        }else if(v[1][1]==v[2][1]){
            y=v[0][1];
        }else{
            y=v[1][1];
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
