package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InputFigureOut {

	public InputFigureOut() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String x = scanner.next();
		int[] y = new int[x.toCharArray().length];
		Long j = Long.parseLong(x);

		while (j > 0) {

			/*
			 * switch (key = x.charAt(i)) {
			 * 
			 * case '0': y[0] = "0:" + ++j; break;
			 * 
			 * case '1': y[1] = "1:" + ++j; break;
			 * 
			 * case '2': y[2] = "2:" + ++j; break; case '3': y[3] = "3:" + ++j; break; case
			 * '4': y[4] = "4:" + ++j; break; case '5': y[5] = "5:" + ++j; break; case '6':
			 * y[6] = "6:" + ++j; break; case '7': y[7] = "7:" + ++j; break; case '8': y[8]
			 * = "8:" + ++j; break; case '9': y[9] = "9:" + ++j; break; default: break; }
			 * 
			 */
			Long.parseLong(x);
			y[(int) (j % 10)]++;
			j /= 10;

		}
		for (int i = 0; i < y.length; i++) {
			System.out.println(i + ":" + y[i]);
		}
	}

}
