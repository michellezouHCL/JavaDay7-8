package exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumException {
	public static void validate(int i) throws ArithmeticException {
		if (i <= 0) {
			throw new ArithmeticException("integer can not be 0 or negative");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int runs;
		int overs;
		System.out.println("Enter total runs scored");
		try {
			runs = Integer.parseInt(br.readLine());
			validate(runs);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Enter total overs faced");
		try {
			overs = Integer.parseInt(br.readLine());
			validate(overs);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

}
