// Java program to count frequencies of
// characters in string using Hashmap
import java.io.*;
import java.util.*;
class Main{
	static void characterCount(String inputString)
	{
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<String, Integer> charCountMap
			= new HashMap<String, Integer>();

		// Converting given string to char array

		String[] strArray = inputString.split(" ");

		// checking each char of strArray
		for (String c : strArray) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
        String s="Ajit is not google is";
        String[] arr=s.split(" ");
		characterCount(s);
	}
}
