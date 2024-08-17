package Java_Daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
	    String input = "my name is my name is vaibhav";

        // Split the input string into words
        String[] words = input.split(" ");
      

        // Use a LinkedHashSet to maintain the order of the last occurrence of each word
        LinkedHashSet<String> uniqueWordsSet = new LinkedHashSet<>();

        // Add words to the set, starting from the end of the list
        for (int i = words.length - 1; i >= 0; i--) {
            uniqueWordsSet.add(words[i]);
        }

        // Create a list to reverse the set
        List<String> uniqueWordsList = new ArrayList<>(uniqueWordsSet);

        // Join the words back into a single string in reverse order
        String result = String.join(" ", uniqueWordsList);

        // Output the result
        System.out.println(result);
        
        
    }
	}


