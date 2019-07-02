package polymorphism;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throwsexample {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\hema\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		
		for(int counter =0;counter<6;counter++)
			System.out.println(fileInput.readLine());
		fileInput.close();
	}

}
