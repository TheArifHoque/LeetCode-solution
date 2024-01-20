import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j > 0 && i > 0 && ans.get(i - 1).size() - 1 >= j) {
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                } else row.add(1);
            }
            ans.add(row);
        }
        return ans;
    }
}
