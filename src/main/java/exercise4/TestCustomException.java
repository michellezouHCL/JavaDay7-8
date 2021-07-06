package exercise4;

import java.util.Scanner;

public class TestCustomException {

	public static void validateAge(int i) throws CustomException{
		if(i < 19) {
			throw new CustomException("InvalidAgeRangeException");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="";
		int age;
		System.out.println("Enter the player name");
		Scanner sc = new Scanner(System.in);
		name= sc.nextLine();
		System.out.println("Enter the player age");
		age=sc.nextInt();
		try {
			validateAge(age);
			System.out.println("Player name: "+name);
			System.out.println("Player age: "+age);
		}catch(CustomException e){
			System.out.println(e);
		}
		sc.close();
	}

}
