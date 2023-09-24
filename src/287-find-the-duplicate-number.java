class Solution {
    public int findDuplicate(int[] nums) {
        //Floyd's algorithm
        //LinkedList approach
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);

        int newSlow = 0;

        do{
            newSlow = nums[newSlow];
            slow = nums[slow];
        } while (newSlow!=slow);

        return newSlow;
    }
}