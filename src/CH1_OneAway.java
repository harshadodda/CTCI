import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * 1.5 One Away: There are three types of edits that can be performed 
 * on strings: insert a character, remove a character, or replace a character. 
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * 
 *	EXAMPLE
 *	pale, ple -> true
 *  pales, pale -> true
 *  pale, bale -> true
 *  pale, bake -> false
 *  
 * @author Harsha Dodda
 *
 */
public class CH1_OneAway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "";
		String str2 = "";
		boolean oneAway = true;
		
		System.out.println("Please enter the starting string: ");
		str1 = sc.nextLine();
		System.out.println("Please enter the resulting string: ");
		str2 = sc.nextLine();
		
		oneAway = checkOneAway(str1, str2);
		System.out.println("are " + str1 + " and " + str2 + " are one away? " + oneAway);
		
		sc.close();
	}
	
	public static boolean checkOneAway(String str1, String str2) {
		boolean oneAway = true;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i = 0; i < str1.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
		}
		for(int i = 0; i < str2.length(); i++) {
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
		}
		if(str1.equals(str2)) {
			return true;
		}
		else if(str1.length() - 1 == str2.length() || str2.length() - 1 == str2.length()) { // check remove 1 char/ add one char
			int oneCharExtra = 0;
			String smallerStr = smallerString(str1, str2);
			for(int i = 0; i < smallerStr.length(); i++) {
				int val1 = map1.get(smallerStr.charAt(i));
				int val2 = map2.getOrDefault(smallerStr.charAt(i), 0);
				if(val1 != val2) {
					oneCharExtra++;
				}
				if(oneCharExtra > 1) {
					return false;
				}
			}
		}
		return oneAway;
	}

	public static String smallerString(String str1, String str2) {
		if(str1.length() < str2.length()) {
			return str1;
		}
		else {
			return str2;
		}
	}
	
}
