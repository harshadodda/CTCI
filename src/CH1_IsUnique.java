import java.util.HashMap;
import java.util.Scanner;

/**
 * 1.1 Is Unique: Implement an algorithm to determine if a string has all 
 * unique characters. What if you cannot use additional data structures?
 * 
 * Runtime: O(N)
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_IsUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a string:");
		String str = sc.nextLine();
		boolean isUnique = isUnique(str);
		System.out.println(isUnique);
		System.out.println("Bye.");
		sc.close();
	}
	
	/**
	 * Checks character by character to see if the string contains entirely unique characters
	 * @param str, the string to check for uniqueness in characters
	 * @return true if the string has all unique characters, false if not
	 */
	private static boolean isUnique(String str) {
		HashMap<Character, Character> characters = new HashMap<Character, Character>();
		boolean isUnique = true;
		for(int i = 0; i < str.length(); i++) {
			// puts char in hash map and returns null if the char is not in hash map already returns previous value if char is in map already
			Character ret = characters.put(str.charAt(i), str.charAt(i)); 	// <-|
			if(ret != null) {
				isUnique = false;
			}
		}
		return isUnique;
	}
}
