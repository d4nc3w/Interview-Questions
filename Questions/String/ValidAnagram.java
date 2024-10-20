package Questions.String;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean response = isAnagram(s, t);
        System.out.println(response);
    }
}
