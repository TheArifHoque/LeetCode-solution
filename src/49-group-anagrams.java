class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> mp = new HashMap<>();
        
        for(String word:strs){
            char[] schar = word.toCharArray();
            Arrays.sort(schar);
            String sortedWord = new String(schar);
            if(!mp.containsKey(sortedWord))
                mp.put(sortedWord, new ArrayList<>());
                
            mp.get(sortedWord).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}
