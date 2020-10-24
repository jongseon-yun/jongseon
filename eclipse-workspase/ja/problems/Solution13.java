package problems;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Solution13 {
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		System.out.println(solution(x,y));
	}

	public static String solution(int a, int b) {
		String answer = "";
		SimpleDateFormat dateFormat= new SimpleDateFormat(2016+""+a+""+b);
		Calendar cal = Calendar.getInstance();
		Date getDate;
		try {
			getDate = dateFormat.parse(2016+""+a+""+b);
			cal.setTime(getDate);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return answer;
	}
}
