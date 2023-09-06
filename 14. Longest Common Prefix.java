class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){return "";} //比對不合回傳空字串
        String prefix = strs[0]; // 由第一個字串開始比對
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1); // 若沒有符合的字串由 prefix 最後一個字依依去除
            }
        }
        return prefix;
    }
}