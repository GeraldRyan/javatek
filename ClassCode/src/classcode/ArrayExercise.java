package classcode;
// import java.util.Arrays;
public class ArrayExercise {

	public ArrayExercise() {
		// TODO Auto-generated constructor stub
	}
	public static int returnMiddle(int[] intArray){
		return intArray[(int)(intArray.length/2)];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program that creates an array of integers with a length of 3. Assign
		// the values 1, 2, and 3 to the indexes. Print out each array element.

		int[] myIntArray = new int[3];
		int[] myInstantArray = { 1, 2, 3 };
		for (int i = 0; i < myInstantArray.length; i++) {
			System.out.println(myInstantArray[i]);
		}
		// Write a program that returns the middle element in an array. Give the
		// following values to the integer array: {13, 5, 7, 68, 2} and produce the
		// following output: 7
		System.out.println("-----------");
		int[] ia = { 13, 5, 7, 68, 2 };
		System.out.println(returnMiddle(ia));

		// Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		
		System.out.println("-----------");
		String[] sArray = {"red", "green", "blue", "yellow"};
		System.out.println(sArray.length);
		String[] sArrayCpy = sArray.clone();
		System.out.println(java.util.Arrays.toString(sArrayCpy));


		// Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.

	}
}
