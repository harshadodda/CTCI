import java.util.HashMap;
import java.util.Scanner;

/**
 * 1.4 Palindrome Permutation: Given a string, write a function to check if it is a 
 * permutation of a palindrome. A palindrome is a word or phrase that is the same 
 * forwards and backwards. A permutation is a rearrangement of letters. The palindrome 
 * does not need to be limited to just dictionary words.
 * 
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 * 
 * Runtime: O(N) (Hash table method)
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_PalindromePermutation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		
		boolean result = checkPalindromePermutation(str);
		System.out.println("This string is a permutation of a palindrome: "  + result);

		sc.close();
	}
	
	/**
	 * takes in a string and determines if it is a permutation of a palindrome
	 * @param str the string to check
	 * @return true if the string is a permutation of a palindrome, false if not
	 */
	public static boolean checkPalindromePermutation(String str) {
		boolean isPermPal = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		if(str.length() % 2 == 0) { // string is of even length
			for(int i = 0; i < str.length(); i++) {
				int mappedValue = map.get(str.charAt(i));
				if(mappedValue % 2 != 0) {
					isPermPal = false;
				}
			}
		}
		else { // string is of odd length
			for(int i = 0; i < str.length(); i++) {
				int numOddLetterOut = 0;
				int mappedValue = map.get(str.charAt(i));
				if(mappedValue % 2 != 0) {
					numOddLetterOut++;
				}
				if(numOddLetterOut == 1) { // if there is more than one letter that has no pair, the string is not a value palindrome 
					isPermPal = true; 
				}
			}
		}
		return isPermPal;
	}
	
}
