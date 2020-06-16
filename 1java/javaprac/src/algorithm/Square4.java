package algorithm;

import java.util.Scanner;

public class Square4 {

	public Square4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int scan = scanner.nextInt();
		
		for (int i = 1; i <= scan; i++) {
			for (int j = 1; j <= scan; j++) {
				System.out.print(i*j);
			}System.out.println();
		}
	}

}
