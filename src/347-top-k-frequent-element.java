class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] box = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : nums)
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (box[frequency] == null)
                box[frequency] = new ArrayList<>();
            box[frequency].add(key);
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = box.length - 1; i >= 0 && ans.size() < k; i--)
            if (box[i] != null)
                ans.addAll(box[i]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) 
            result[i] = ans.get(i);
        
        return result;
    }
}
