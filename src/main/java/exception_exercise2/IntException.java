package exception_exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int a = sc.nextInt();
			int b = sc.nextInt();
			try {
				System.out.println(a / b);
			} catch (ArithmeticException ae) {
				System.out.println("java.lang.ArithmeticException:/by zero");
			}
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		sc.close();
	}

}
