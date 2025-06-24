package com.crushoncode.collectorscollect;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class StringStreamAPI {

	public static void main(String[] args) {
			String str="Anand";
		
		List<String> nameList = Arrays.asList(
			    "Anand", "Priya", "Rohit", "Sneha", "Amit", "Vikram", "Nisha", "Meena",
			    "Ajay", "Ritu", "Sunil", "Kiran", "Divya", "Rakesh", "Bhavna", "Neha",
			    "Ravi", "Manish", "Pooja", "Kunal", "Isha", "Deepak", "Alok", "Tina",
			    "Preeti", "Gaurav", "Simran", "Zoya", "Ashok", "Harsh", "Kapil", "Ramesh",
			    "Suman", "Shivani", "Lokesh", "Hemant", "Yogesh", "Nikhil", "Tanvi",
			    "Mansi", "Siddharth", "Abhay", "Shweta", "Parul", "Komal", "Naveen",
			    "Vivek", "Raj", "Megha", "Payal", "Tarun", "Sandeep", "Rahul", "Chirag",
			    "Farah", "Geeta", "Irfan", "Jatin"
			);
		
		
		
//		Count Vowels in a String
//		Q: Count the total number of vowels in a given string using streams.
	

	
//		Remove Duplicates from a String
//		Q: Remove duplicate characters from a string using Stream API.

		

		  
		        String input = "programming";

		        String result = input.chars()
		            .mapToObj(c -> (char) c)
		            .collect(Collectors.collectingAndThen(
		                Collectors.toCollection(LinkedHashSet::new), // maintains insertion order
		                set -> set.stream()
		                          .map(String::valueOf)
		                          .collect(Collectors.joining())
		            ));

		        System.out.println("Original  : " + input);
		        System.out.println("No Duplicates: " + result);
		
		/*
		 * 
		 * ✅ Core String Questions Using Stream API



Find First Non-Repeating Character

Q: Find the first non-repeating character in a string using streams.

Reverse a String Using Stream

Q: Reverse a given string using Stream API.

Frequency of Each Character

Q: Get the frequency of each character in a string using Collectors.groupingBy.

Convert String to Upper case Without Loop

Q: Convert all characters of a string to upper case using streams.

Check if a String is Palindrome

Q: Write a method that checks if a string is a palindrome using Stream API.

Find All Digits in a String

Q: Extract all digits from a given string using streams.

Sort Characters of a String

Q: Sort all characters in a string alphabetically using streams.

Remove All Whitespaces

Q: Remove all whitespace characters from a string using streams.

✅ String List-Based Stream Questions
Filter Names Starting with 'A'

Q: From a list of names, filter and print those starting with 'A' (case-insensitive).

Sort List of Strings by Length

Q: Sort a list of strings by their length using Stream API.

Find the Longest Word in a List

Q: Find the longest word from a list of strings using Stream API.

Count Strings with Length > 5

Q: Count how many strings in a list have length greater than 5.

Convert List of Strings to a Single CSV

Q: Convert a list of strings to a single comma-separated string.

Group Words by Their Length

Q: Group a list of strings based on their length using Stream API.

Check if Any Word Contains Digit

Q: Check if any word in the list contains a digit using streams.

Find Duplicate Strings in a List

Q: Find all strings that occur more than once in a list using Stream API.

List of Unique Words (Ignore Case)

Q: Return a list of unique strings from a list, case-insensitive.

Count Occurrences of Each Word in a Paragraph

Q: Given a paragraph (String), count how many times each word appears using streams.

Would you like answers for any of these, or want me to group them by beginner/intermediate/advanced level?








You said:
more 40 questions


ChatGPT said:
Updated saved memory
Here are ✅ 40 more advanced and realistic String-related Stream API coding questions, grouped by categories for clarity:

🔤 Advanced String Manipulation (Using Streams)
Find the Most Frequent Character in a String

Check if All Characters Are Unique

Convert a String to a List of ASCII Values

Keep Only Alphabetic Characters from a String

Remove Punctuation Marks Using Streams

Swap Case (upper to lower and vice versa)

Print Character Frequency in Sorted Order

Print Only Uppercase Letters from a String

Replace All Vowels with ‘*’ Using Stream

Check If Two Strings Are Anagrams (Using Stream API)

🧮 Streams on List<String> Data
Convert List<String> to Map<String, Integer> (word → length)

Count How Many Words Start with a Capital Letter

Find the Most Frequently Occurring Word in a List

Partition Strings into Shorter/Longer Than 5 Characters

Concatenate List of Strings With Hyphens Between

Sort List of Strings Ignoring Case

Find Common Strings Between Two Lists Using Stream

Remove Null or Empty Strings from a List

Remove Duplicate Words from a Sentence (String → List)

Convert List of Strings to List of First Characters

🔁 Mixed Logic with Strings + Maps + Grouping
Count Words by Length (List<String> → Map<Length, Count>)

Group Words by First Character

Create a Map of First Char → List of Words Starting With It

Split a String Sentence and Count Word Frequencies

Group Words by Number of Vowels

Filter and Sort Palindromes from List<String>

Find First Word in List Longer Than N Characters

Return a Set of Lowercase Words Only

List All Words That Contain a Specific Character (e.g., ‘e’)

List Words Sorted by Vowel Count

🌐 Real-World Data Processing Style
Parse CSV Line to List of Words and Filter by Length

Extract All Emails from List<String> Using Regex + Streams

Validate a List of Strings Are All Valid Emails

Format List of Names to "Mr./Ms. [Name]" Using Streams

Convert List of Strings to JSON-Like Output

Count Special Characters in Each Word (Map<String, Integer>)

Group Emails by Domain Name

Find the Longest Common Prefix from a List of Strings

Split Paragraph into Sentences and Sort by Length

Find Strings That Match a Given Regex Pattern Using Streams
		 */
	}
	
	
}
