package file_examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {

	public writeToFile() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file_path = "./test.txt";
		File file = new File(file_path);
		FileWriter fw = new FileWriter(file, false);
		fw.write("Hello World");
		fw.write("Second line\n");
		System.out.println("Written successfully");
		fw.close();
	}

}
