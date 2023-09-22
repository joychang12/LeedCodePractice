class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int reslen;
        double res;

        int len1 = nums1.length;
        int len2 = nums2.length;

        int[] newArr = new int[len1 + len2];
        System.arraycopy(nums1, 0, newArr, 0, len1);
        System.arraycopy(nums2, 0, newArr, len1, len2);
        int newlen = newArr.length;
        Arrays.sort(newArr);

        if(newlen%2 != 0){
            reslen = newlen/2;
            res = newArr[reslen];
            return res;
        } else {
            reslen = newlen/2;
            res = (double)(newArr[reslen] + newArr[reslen - 1])/2;
            return res;
        }
    }
}