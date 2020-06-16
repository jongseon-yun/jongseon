package algorithm;

import java.util.Scanner;

public class MultiplicationTable {

	public MultiplicationTable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int x2 = scanner.nextInt();

		if (x > x2) {
				for (int j = 1; j < 10; j++) {
					for (int i = x2; i <= x; i++) {
					System.out.print(i+"*"+j+"="+i * j + "	");
				}
				System.out.println();
			}
		} else {
				for (int j = 1; j < 10; j++) {
					for (int i = x; i <= x2; i++) {
						System.out.print(i+"*"+j+"="+i * j + "	");
				}
				System.out.println();
			}
		}
	}

}
