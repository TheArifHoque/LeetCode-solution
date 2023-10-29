import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        helper(0,nums);
        return ans;
    }

    public void helper(int start, int[] nums) {
        if (start>=nums.length)
            ans.add(new ArrayList<>(subset));
        else {
            subset.add(nums[start]);
            helper(start+1,nums);
            subset.remove(subset.size()-1);
            helper(start+1,nums);
        }
    }
}
