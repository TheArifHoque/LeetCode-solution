class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> hashMap = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                ans[0] = hashMap.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            hashMap.put(nums[i],i);
        }
        return ans;
    }
}
