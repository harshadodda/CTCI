import java.util.Scanner;

/**
 * 1.3 URLify: Write a method to replace all spaces in a string with %20. You may assume 
 * that the string has sufficient space at the end to hold the additional characters, and
 * that you are given the "true" length of the string. Try to do this in place with a char
 * array
 * 
 * Example:
 * "Mr John Smith"
 * 
 * Runtime: O(N) (not inplace method, O(N) space taken)
 *  		O(N) (inplace method, O(1) space taken) (incomplete)
 * 
 * @author Harsha Dodda
 *
 */
public class CH1_URLify {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int trueLength = 0;
		
		System.out.println("Enter a string to URLify:");
		String str = sc.nextLine();
		
		trueLength = getTrueLength(str);
		
		String spaciousString = new String(getSpaciousString(str));
		String retStr = new String(URLify(spaciousString, trueLength));
		System.out.println("Here is your URLified string using a non-inplace method: " + retStr);
		
		//retStr = new String(URLifyInPlace(spaciousString.toCharArray(), trueLength));
		//System.out.println("Here is your URLified string using an inplace method: " + retStr);
		
		System.out.println("Bye.");
		sc.close();

	}
	
	private static int getTrueLength(String str) {
		return str.length();
	}
	
	private static String getSpaciousString(String str) {
		int spaceCounter = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				spaceCounter++;
			}
		}
		
		char[] charArr = new char[str.length() + (spaceCounter * 3)];
		
		for(int i = 0; i < charArr.length; i++) {
			if(i < str.length()) {
				charArr[i] = str.charAt(i);
			}
			else {
				charArr[i] = ' ';
			}
		}
		
		String retStr = new String(charArr);
		return retStr;
	}
	
	private static String URLify(String str, int trueLength) {
		StringBuilder retStr = new StringBuilder();
		String strToInsert = "%20";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				retStr.append(str.charAt(i));
			}
			else if(i < trueLength) {
				retStr.append(strToInsert);
			}
		}
		
		return retStr.toString();
	}
	
	// attempt at in place urlify
	/*
	private static String URLifyInPlace(char[] charArr, int trueLength) {
		
		
		return charArr.toString();
	}
	
	private static String shift(String str, int currentPlace, int shift) {
		for(int i = currentPlace + 1; i < str.length(); i++) {
			
		}
		
		return str;
	}
	*/

}
