class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for(String s: strs){
            char[] c = s.toCharArray(); //轉成 char 進行排列
            Arrays.sort(c);

            String sortStr = String.valueOf(c); // char 轉 string
            if(!map.containsKey(sortStr)){
                map.put(sortStr, new ArrayList<>());
            }
            map.get(sortStr).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}