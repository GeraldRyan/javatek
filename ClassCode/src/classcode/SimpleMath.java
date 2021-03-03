package classcode;

public class SimpleMath {
  // This example creates a program to let a first grader practice additions.

  // The program randomly generates two single-digit integers and displays a
  // question such as “What is 7 + 9?” to the student.

  public static void main(String args[]) {

    int a = (int)(Math.random() * 10);
    int b = (int)(Math.random() * 10);
    System.out.printf("What is the value of %d + %d", a, b);
  }

  // After the student types the answer, the program displays a message to
  // indicate whether the answer is correct or incorrect.

}
