import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            // If duplicate, shrink window from left
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current char and expand window
            set.add(c);
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }
}
