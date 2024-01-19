public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals(t))
            return true;
        int i = 0;
        int j = 0;
        while (true) {
            if (j >= t.length() || i == s.length())
                break;
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else
                j++;
        }
        if (i == s.length())
            return true;
        return false;
    }
}
