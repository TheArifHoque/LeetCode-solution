import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combination(candidates,target,0);
        return ans;
    }

    private void combination(int[] candidates, int target, int ind) {
        if (target==0)
            ans.add(new ArrayList<>(comb));
        else if (target<0)
            return;
        else {
            for (int i=ind;i<candidates.length;i++) {
                if (i>ind && candidates[i]==candidates[i-1])
                    continue;
                if (candidates[i]>target)
                    break;
                comb.add(candidates[i]);
                combination(candidates,target-candidates[i],i+1);
                comb.remove(comb.size()-1);
            }
        }
    }
}
