class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int count = 0;

        Set<Character> set = new HashSet<Character>();
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count = Math.max(set.size(),count);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}