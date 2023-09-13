class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    if((nums[i] + nums[j] + nums[k]) == 0) {
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }

        for(int i = 0; i < res.size(); i++) {
            for(int j = i+1; j < res.size(); j++) {
                List<Integer> item = res.get(i);
                Collections.sort(item);
                List<Integer> item2 = res.get(j);
                Collections.sort(item2);
                if(item.equals(item2)) {
                    res.remove(j);
                }
            }
        }

        return res;
    }
}