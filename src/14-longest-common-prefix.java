import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int match = 0;
        while (match < first.length() && match < last.length()) {
            if (first.charAt(match) == last.charAt(match))
                match++;
            else
                break;
        }
        return first.substring(0, match);
    }
}
