import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> subSet = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        createSubSet(nums,0);
        return ans;
    }

    private void createSubSet(int[] nums, int ind) {
        ans.add(new ArrayList<>(subSet));
        for (int i=ind;i<nums.length;i++) {
            if (i>ind && nums[i]==nums[i-1])
                continue;
            subSet.add(nums[i]);
            createSubSet(nums,i+1);
            subSet.remove(subSet.size()-1);
        }
    }
}
