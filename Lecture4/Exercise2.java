
public class StringManipulation {

public static void main(String[] args) {

String word = "Computer";

// Original form, capital, and small letters

System.out.println("Original: " + word);

System.out.println("In small letters: " + word.toLowerCase());

System.out.println("In capital letters: " + word.toUpperCase());

// Length of the word

System.out.println("Length: " + word.length());

// In small letters: com

System.out.println("In small letters: " + word.substring(0, 3).toLowerCase());

// In capital letters: CO

System.out.println("In capital letters: " + word.substring(0, 2).toUpperCase());

// First letter: C

System.out.println("First letter: " + word.charAt(0));

// Last letter: r

System.out.println("Last letter: " + word.charAt(word.length() - 1));

// Middle letter: u

System.out.println("Middle letter: " + word.charAt(word.length() / 2));

// The word starts with "Con"

System.out.println("The word starts with 'Con': " + word.startsWith("Con"));

// The word ends with "ion"

System.out.println("The word ends with 'ion': " + word.endsWith("ion"));

// First two letters: "Co"

String firstTwoLetters = word.substring(0, 2);

System.out.println("The first two letters are: " + firstTwoLetters);

// Swap 'e' letters with 'o'

String swappedWord = word.replace('e', 'o');

System.out.println("Swapped 'e' with 'o: " + swappedWord);

// Replace "Compu" with "Calcula"

String replacedWord = word.replace("Compu", "Calcula");

System.out.println("Replaced 'Compu' with 'Calcula: " + replacedWord);

}

}
