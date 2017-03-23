import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 1.2 Check Permutation: Given two strings, write a method to decide if 
 * one is a permutation of the other
 * 
 * Runtime: O(NlogN) (sorting method takes NlogN time) or,
 * 			O(N) (hashmap method takes N time)
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_CheckPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		boolean isPermutation = false;
		
		System.out.println("Enter the first string: ");
		str1 = sc.nextLine();
		System.out.println("Enter the second string: ");
		str2 = sc.nextLine();
		
		isPermutation = checkPermutation(str1, str2);
		System.out.println("sorting method returned: " + isPermutation); // check for permutation using sorting method
		
		isPermutation = checkPermutation2(str1, str2);
		System.out.println("hash map method returned: " + isPermutation); // check for permutation using hash map method
		
		System.out.println("Bye.");
		sc.close();
	}
	
	/**
	 * Checks character by character to see if two strings are permutations of each other
	 * using a sorting method
	 * @param str1, first string to be checked
	 * @param str2, second string to be checked
	 * @return true if the strings are permutations of each other, false if not
	 */
	private static boolean checkPermutation(String str1, String str2) {
		boolean isPermutation = true;
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		str1 = new String(chars1); // make strings from sorted char arrays
		str2 = new String(chars2);
		
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) { // check character by character to see if characters are same
				isPermutation = false;
			}
		}
		
		return isPermutation;
	}
	
	/**
	 * Checks character by character to see if two strings are permutations of each other 
	 * using a hash map method
	 * @param str1, the first string to be checked
	 * @param str2, the second string to be checked
	 * @return true if the strings are permutations of each other, false if not
	 */
	private static boolean checkPermutation2(String str1, String str2) {
		boolean isPermutation = true;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		if(str1.length() != str2.length()) {
			return false;
		}

		for(int i = 0; i < str1.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1); // add all characters from string 1 to hash map
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1); // add all characters from string 2 to hash map
		}
		
		for(int i = 0; i < str1.length(); i++) {
			Integer val1 = 0; 
			Integer val2 = 0;
			Integer index; // need Integer because of potential null return value
			val1 = map1.get(str1.charAt(i));
			index = str2.indexOf(str1.charAt(i)); // reutrns -1 if character is not in string
			if(index < 0) {
				return false;
			}
			val2 = map2.get(str2.charAt(index));
			if(val1 != val2) {
				isPermutation = false;
			}
		}
		
		return isPermutation;
	}
}
