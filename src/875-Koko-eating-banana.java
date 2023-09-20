import java.util.Arrays;

class Solution {
    //Binary Search Problem
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];
        while (left<right){
            int middle = (left+right)/2;
            int hourTaken = 0;
            for (int banana:piles)
                hourTaken+= (int) Math.ceil((double) banana/middle);

            if (hourTaken<=h)
                right = middle;
            else
                left = middle+1;
        }
        return right;
    }
}