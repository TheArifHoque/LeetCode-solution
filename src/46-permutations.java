import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        function(nums,0);
        return ans;
    }

    private void function(int[] nums, int index) {
        if (index==nums.length) {
            List<Integer> curr = new ArrayList<>();
            for (int i:nums)
                curr.add(i);
            ans.add(curr);
            return;
        }
        for (int i=index;i<nums.length;i++) {
            swap(nums,index,i);
            function(nums,index+1);
            swap(nums,index,i);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
