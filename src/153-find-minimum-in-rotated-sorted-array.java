//Binary Search Problem
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            if (nums[left]<nums[right])
                return nums[left];

            int mid = (left+right)/2;
            if (nums[mid]>=nums[left])
                left = mid+1; //rotated array has smaller value on right portion
            else
                right = mid; //rotated array has smaller value on left portion
        }
        return nums[left]; //if the array has only one value
    }
}