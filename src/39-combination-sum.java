import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates,target,0);
        return ans;
    }

    private void backTrack(int[] candidates, int target, int index) {
        if (target==0)
            ans.add(new ArrayList<>(curr));
        else if (target<0 || index>=candidates.length)
            return;
        else {
            curr.add(candidates[index]);
            backTrack(candidates,target-candidates[index],index);
            curr.remove(curr.get(curr.size()-1));
            backTrack(candidates,target,index+1);
        }
    }
}
