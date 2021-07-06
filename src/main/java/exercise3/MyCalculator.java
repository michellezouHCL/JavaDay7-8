package exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyCalculator {

	public static long power(int x, int y) throws Exception {
		if (x < 0 && y < 0) {
			throw new Exception("n and p should not be negative");
		} else if (x < 0 || y < 0) {
			throw new Exception("n or p should not be negative");
		} else if (x == 0 && y == 0) {
			throw new Exception("n and p should not be zero");
		} else
			return (long) Math.pow(x, y);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			try {
				System.out.println(power(a, b));
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		sc.close();
	}

}
