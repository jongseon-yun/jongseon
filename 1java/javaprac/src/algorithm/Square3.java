/**
 * 
 */
package algorithm;

import java.util.Scanner;

/**
 * @author hanma
 *
 */
public class Square3 {

	/**
	 * 
	 */
	public Square3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		for (int i = 0; i < x; i++) {
			int y = 1 + i;
			for (int j = 0; j < x; j++) {
				System.out.print(y);
				y += 4;
			}
			System.out.println();
		}
	}

}
