public class Solution {
    public int removeElement(int[] nums, int val) {
        int limit = nums.length - 1;
        int i = 0;
        while (i <= limit) {
            if (nums[i] == val) {
                swap(nums, i, limit);
                limit -= 1;
            } else i++;
        }
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
