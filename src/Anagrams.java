import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(isAnagram(s1, s2));
    }

    public static String isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return "NO";
        }

        Map<Character, Integer> s1Map = getMapFromString(s1);
        Map<Character, Integer> s2Map = getMapFromString(s2);

        if (s1Map.equals(s2Map)) {
            return "YES";
        }

        return "NO";
    }

    public static Map<Character, Integer> getMapFromString(String s) {
        Map<Character, Integer> sMap = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            Integer curr = sMap.get(ch);

            if (curr == null) {
                sMap.put(ch, 1);
                continue;
            }

            sMap.put(ch, ++curr);
        }

        return sMap;
    }
}
