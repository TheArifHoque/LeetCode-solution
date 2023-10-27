import java.util.Arrays;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (n==0)
            return tasks.length;
        int[] cnt = new int[26];
        for(char task: tasks)
            cnt[task-'A']++;

        Arrays.sort(cnt);

        int mx = cnt[25]-1;
        int space = mx*n;

        for(int i=24;i>=0;i--)
            space-=Math.min(mx,cnt[i]);

        space = Math.max(0,space);

        return tasks.length+space;
    }
}