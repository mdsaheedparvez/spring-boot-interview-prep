package pracHere;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        // Create strings
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Print length
        System.out.println("Length of str1: " + str1.length());

        // Character at index
        System.out.println("Character at index 7: " + str1.charAt(7));

        // Substring
        System.out.println("Substring (0, 5): " + str1.substring(0, 5));

        // String comparison
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase("hello, world!"));

        // Concatenation
        String concatenated = str1.concat(" ").concat(str2);
        System.out.println("Concatenated: " + concatenated);

        // Replacement
        System.out.println("Replaced: " + str1.replace("World", "Java"));

        // Trimming
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // Splitting
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("Fruits: " + Arrays.toString(fruits));

        // Finding index
        System.out.println("Index of 'o': " + str1.indexOf('o'));

        // Checking contains
        System.out.println("Contains 'Java': " + str2.contains("Java"));
    }
}
