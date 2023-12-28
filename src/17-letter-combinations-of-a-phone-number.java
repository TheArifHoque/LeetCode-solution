import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<Character, String> digitToChar = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty())
            return ans;
        String cur = "";
        combination(digits, ans, cur, 0);
        return ans;
    }

    private void combination(String digits, List<String> ans, String cur, int ind) {
        if (cur.length() == digits.length()) {
            ans.add(cur);
            return;
        } else if (ind >= digits.length()) {
            return;
        } else {
            String digit = digitToChar.get(digits.charAt(ind));
            for (char ch : digit.toCharArray()) {
                combination(digits, ans, cur + ch, ind + 1);
            }
        }
    }
}
