package file_examples;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Test_File {

	public Test_File() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		String file_path = "./file_examples/sample.txt";
		File file = new File(file_path);
		Scanner sc = new Scanner(file);
		ArrayList<Course> data = new ArrayList<Course>();
		
		while (sc.hasNextLine()){
			String line = sc.nextLine();
			String[] arr = line.split(",");
			Course c = new Course(arr[0], arr[1], arr[2]);
			data.add(c);			
		};
		
		for (Course c : data) {
			System.out.format("%-15s | %-35s | %-25s\n", c.getCode(), c.getName(), c.getInstructor());
		}
//		for (String[] line: data) {
//			System.out.printf("%s | %s | %s\n", line[0], line[1], line[2]);
//		}
	
		
		
		System.out.println("End of the code");
	}

}
