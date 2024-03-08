class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        get(candidates, 0, target, list, res);
        return res;

    }

    public static void get(int[] nums, int i, int target, List<Integer> list,List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int j = i;j<nums.length;j++){
            if(target - nums[j] >= 0){
                list.add(nums[j]);
                get(nums, j, target - nums[j], list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    
}