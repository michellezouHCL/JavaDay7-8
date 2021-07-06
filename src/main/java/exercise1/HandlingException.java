package exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandlingException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("C:\\Users\\michelle_zou\\eclipse-workspace\\JavaDay7-8\\test.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			try {
				s = br.readLine();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(s !=null) {
				System.out.println(s);
				try {
					s=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist");
		}
		
	}

}
