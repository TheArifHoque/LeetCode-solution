public class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        for (int i=arr.length-1;i>=0;i--) {
            if (greatest<arr[i]) {
                int temp = arr[i];
                arr[i] = greatest;
                greatest = temp;
            } else {
                arr[i] = greatest;
            }
        }
        return arr;
    }
}
