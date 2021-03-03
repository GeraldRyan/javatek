package classcode;

import java.util.HashMap;
import java.util.Scanner;

public class ControlFlowEx {

    static {
      HashMap<Integer, String> Grades = new HashMap<Integer, String>();
      Grades.put(90, "A");
      Grades.put(80, "B");
      Grades.put(70, "C");
      Grades.put(60, "D");
      Grades.put(59, "F");
    }

  // A: 90-100

  // B: 80-89

  // C: 70-79

  // D: 60-69

  // F: <60
  // Object x = {
  // key:value,

  // }

  public static void p(String s) {
    System.out.printf(s);
  }

  public static String test_int(int x) {
    if (x < 10) {
      return "X is less than 10\n";
    } else {
      return "X is greater than 10\n";
    }
  }

  public static void main(String[] args) {

    // Write a program that declares 1 integer variable x, and then assigns 7 to it.
    // Write an if statement to print out “Less than 10” if x is less than 10.
    // Change x to equal 15 and notice the result (console should not display
    // anything).

    // int x = 7;
    p(test_int(7));
    p(test_int(15));

    // p("X is less than 10");
    // Write a program that declares 1 integer variable x, and then assigns 7 to it.
    // Write an if-else statement that prints out “Less than 10” if x is less than
    // 10 and “Greater than 10” if x is greater than 10. Change x to 15 and notice
    // the result.

    // Write a program that declares 1 integer variable x, and then assigns 15 to
    // it. Write an “if-else-if” statement that prints out “Less than 10” if x is
    // less than 10, “Between 10 and 20” if x is greater than 10 but less than 20,
    // and “Greater than or equal to 20” if x is greater than or equal to 20. Change
    // x to 50 and notice the result.
    // int y = 15;
    // if (y< 10){

    // }
    // p

    // Write a program that declares 1 integer variable x, and then assigns 15 to
    // it. Write an if-else statement that prints “Out of range” if the number is
    // less than 10 or greater than 20 and prints “In range” if between 10 and 20
    // (including equal to 10 or 20). Change x to 5 and notice the result.

    // Write a program that uses if-else-if statements to print out grades A, B, C,
    // D, F according to the following criteria:


      HashMap<String, Integer> Grades = new HashMap<String, Integer>();
      Grades.put("A", 90);
      Grades.put("B", 80);
      Grades.put("C", 70);
      Grades.put("D", 60);
      Grades.put("F", 59);

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your grade as a score");
    int grade = (int)Integer.parseInt(input.nextLine());
    System.out.printf("You entered %d\n", grade);
    input.close();

    // System.out.println(Grades.get("A"));
    
    if (grade >= Grades.get("A")){
      p("You got an A");
    }
    else if (grade >= Grades.get("B")){
      p("You got an B");
    }
  }
}
// A: 90-100

// B: 80-89

// C: 70-79

// D: 60-69

// F: <60

// Use the Scanner class to accept a number score from the user to determine the
// // letter grade. Print out “Score out of range.” if the score is less than 0
// or // greater than 100. // Write a program that accepts an integer between 1
// and 7 from the user. Use a // switch statement to print out the corresponding
// weekday. Print “Out of range” // if the number is less than 1 or greater than
// 7. Don’t forget to include // “break” statements in each of your cases. }