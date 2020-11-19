package codingGames;

import java.util.Map;
import java.util.Scanner;

public class temperatures {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		int x = 0 ;
		for (int i = 0; i < n; i++) {
			int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
			x = (i == 0) ? t : x;
			if (x > 0 && t > 0) {
				x = (x > t) ? t : x;
			} else if (x > 0 && t < 0) {
				t = -1 * t;
				x = (x > t) ? t : x;
				x = -1 * x;
			} else if (x < 0 && t > 0) {
				x = -1 * x;
				x = (x > t) ? t : x;
				x = -1 * x;
			} else if (x < 0 && t < 0) {
				x = (x < t) ? t : x;
			}
		}

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");

		System.out.println(x);
	}
}
