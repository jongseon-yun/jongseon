package skillCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
