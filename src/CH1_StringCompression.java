import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * 1.6 String Compression: String Compression: Implement a method to perform basic string 
 * compression using the counts of repeated characters. For example, the string aabcccccaaa
 * would become a2b1c5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string. You can assume the string
 * has only uppercase and lowercase letters (a - z).
 * 
 * Runtime: O(N) or O(M), we go through at maximum the string given or the larger "compressed" stirng
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string to compress: ");
		String input = sc.nextLine();
		String compressedStr = "";
		
		input = input + "\0";
		compressedStr = compressString(input);
		
		// if the compressed string is larger, print the original string instead
		if(compressedStr.length() > input.length()) {
			System.out.println("The compressed string was longer here is the original string: " + input);
		}
		else {
			System.out.println("Here is the compressed string: " + compressedStr);
		}
		
		sc.close();
	}
	
	/**
	 * Takes in a string and compresses it into a potentially smaller string 
	 * EX. aaaabbbaa becomes a4b3a2
	 * @param str, the string to compress
	 * @return returns the compressed string in the format mentioned in the example above
	 */
	public static String compressString(String str) {
		String compressedStr = "";
		char[] chars = new char[str.length()];
		chars = str.toCharArray();
		ArrayList<String> newCharArr = new ArrayList<String>();
		int letterCounter = 0;
		char compChar = str.charAt(0);
		
		for(int i = 0; i < str.length(); i++) {
			if(chars[i] == compChar) {
				letterCounter++; // if the letter is the same as the one we are currently on in the string, increase the letter count 
			}
			else {
				// if we see a character that is new we must add the old character and the number of times we saw it into the new array
				newCharArr.add(String.valueOf(compChar)); // add the character into the new array
				newCharArr.add(String.valueOf(letterCounter)); // add the number of times the new character occured into the new array
				compChar = chars[i]; // update the character to compare to 
				letterCounter = 1; // update the number of times we have seen the new character
			}
		}
		for(String character : newCharArr) {
			compressedStr += character; // loop through the Array List and construct the compressed string from it
		}
		return compressedStr;
	}

}
