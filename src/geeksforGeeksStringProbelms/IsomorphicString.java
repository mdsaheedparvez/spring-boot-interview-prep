package geeksforGeeksStringProbelms;

import java.util.*;

public class IsomorphicString {

    public static void main(String[] args) {

        IsomorphicString isomorphicString = new IsomorphicString();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String s1 = sc.next();

        System.out.println("Enter the second String: ");
        String s2 = sc.next();

        if (s1.length() == s2.length()) {

            boolean result = isomorphicString.checkIsomorphic(s1, s2);

            if (result)
                System.out.println("Strings are Isomorphic");
            else
                System.out.println("Strings are NOT Isomorphic");

        } else {
            System.out.println("Length not same. Not Isomorphic.");
        }

        sc.close();
    }

    private boolean checkIsomorphic(String s1, String s2) {

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {

            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Check s1 → s2 mapping
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else {
                map1.put(c1, c2);
            }

            // Check s2 → s1 mapping
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1)
                    return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
}