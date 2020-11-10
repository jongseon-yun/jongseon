package problems.previous.level2;

import java.util.Arrays;
import java.util.Comparator;

class Solution4 {

	public static void main(String[] args) {
		String arr[] = { "muzi001.txt", "MUZI1.txt", "abcd001.txt", "acde.TXT", };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(solution(arr)[i]);
		}
	}

	public static String[] solution(String[] files) {
		
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String[] file1 = detach(o1);
				String[] file2 = detach(o2);
				
				int headValue = file1[0].compareTo(file2[0]);
				
				if(headValue == 0) {
					int num1 = Integer.parseInt(file1[1]);
					int num2 = Integer.parseInt(file2[1]);
					
					return num1 - num2;
				} else {
					return headValue;
				}
			}
				
			private String[] detach(String str) {
				String head = "";
				String number = "";
				String tail = "";

				int idx = 0;
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(ch >= '0' && ch <= '9') break;
					head += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					if(!(ch >= '0' && ch <= '9')) break;
					number += ch;
				}
				
				for( ; idx < str.length() ; ++idx) {
					char ch = str.charAt(idx);
					tail += ch;
				}
				
				String[] file = {head.toLowerCase(), number, tail};
				
				return file;
			}
		});
		return files;
	}
			
	public static void sort(String [] answer) {
		
	}

}
