
public class MainStringClass {

	public static String str1 = "yesterday it was raining";
	public static String str2 = "today it is sunny";
	public static String str3 = "today it was raining";
	public static String str4 = "it was raining";
	
	public static void main(String[] args) {
//		System.out.println(concatCapitalize().substring(0, 6) + concatCapitalize().substring(29));
//		System.out.println(countWords(concatCapitalize()));
//		System.out.println(printWordsOnNewLineReverse(concatCapitalize()));
		System.out.println(findSubString(str3, str4));
	}
	
	public static String concatCapitalize() {
		return str2.toUpperCase()+", ".concat(str1).toUpperCase();
	}
	
	public static int countWords(String str) {
		int count = 0;
		if(str.length() > 0) {
			count += 1;
			for(int i = 0; i < str.length(); i++) {
				if(str.substring(i, i+1).equals(" ")) count+=1;
			}			
		}
		return count;
	}
	
	public static String printWordsOnNewLine(String str) {
		if(str.length() > 0) {
			for(int i = 0; i < str.length(); i++) {
				if(str.substring(i, i+1).equals(" ")) {
					System.out.println();
					i+=1;
				}
				System.out.print(str.substring(i, i+1));
			}			
		}
		return "";
	}
	
	public static String printWordsOnNewLineReverse(String str) {
		int tempCount = str.length();
		if(str.length() > 0) {
			for(int i = str.length()-1; i >= 0; i--) {
				if(str.substring(i, i+1).equals(" ") || i == 0) {
					if(i == 0) {
						System.out.println(str.substring(i, tempCount));
					}else {
						System.out.println(str.substring(i+1, tempCount));						
					}
					tempCount = i;
				}
			}			
		}
		return "";
	}
	
	public static boolean findSubString(String str1, String str2) {
		boolean bool = false;
		for(int i = 0; i < str1.length(); i++) {
//			if(str1.substring(i, i+1).equals(str2.substring(0, 1))) {
			if(str1.substring(i, i+str2.length()).equals(str2.substring(0, str2.length()))) {
				bool = true;
			}
//			}
		}
		return bool;
	}
	
}

//
//Create two Strings where one string has a value of “yesterday it was raining” 
//and the other string with a value of “today it is sunny”
//
//Concatenate both values, capitalise both strings and print out the result.
//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
//
//Solution
//Now use the substring method to print out: `TODAY IT IS RAINING`
//Solution
//For this task you are to implement 4 methods that manipulate String objects. 
//For all parts of this section you are only allowed to use the length(), substring(), 
//and equals() methods. Avoid using arrays or any methods you have yet to be taught as 
//this defeats the purpose of the exercise:
//
//Method 1 - When given a String, count and return how many words there are in that String.
//Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
//Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//Method 4 - A find method, which takes 2 Strings; the first is message and the second is the 
//String you want to find in the message. A boolean value should be returned to indicate whether 
//or not the second String has been found in the message.