package MorningAlgorithms;
//import java.util.Arrays;
//
//public class Challenge2 {
//
//	public Challenge2() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static boolean bPalindrome(String s) {
//		// get letters sorted into an array
//		char[] chararray = s.toCharArray();
//		Arrays.sort(chararray);
//		System.out.println(chararray);
//		int length = chararray.length;
//		boolean bOdd = (length % 2 != 0);
//		// remove middle from array
//		if (bOdd) {
//			// all must be paired except one
//			int singletonCount = 0;
//			int indexOfSingleton;
//			for (int i = 0; i < length - 1; i++) {
//				// if we find two singletons (odd numbered letters), return false. 
//				// One is ok, we actually expect one. Then we pop it and run against the even number
//
//				if (s.lastIndexOf(i)) {
//					singletonCount++;
//					indexOfSingleton = i
//					if (singletonCount > 1) {
//						return false;
//					}
//					
//				}
//			}
//		}
//		// even length
//		for (int i = 0; i < length - 1; i++) {
//			if (i % 2 == 0 && chararray[i] != chararray[i + 1]) {
//				return false;
//			}
//		}
////ababcedde
////aabbcddee
////aabbddee
////01234567
////
////bbaaxccdd
////aabbccddx
//		return true;
//	}
//
//	public static void main(String[] args) {
//		System.out.println(bPalindrome("acabbcdd"));
//		System.out.println(bPalindrome("acaabbbcdd"));
//
//		System.out.println(bPalindrome("aaaabbbb"));
//	}
//
//}
////aaabbbccdd
////aaabbbcf
////aaaccbbb
////aaaabbbb
////Given the string s, create a method that returns true if
////s or one of its permutations is palindrome, false otherwise 
////Expected time complexity: O(n)
////Expected space complexity: O(n)
////
////example:
////input: 'racecars'
////output: False
////
////input: 'pcopc'
////output: True
////
////input: 'bananaboyyo'
////output: True
