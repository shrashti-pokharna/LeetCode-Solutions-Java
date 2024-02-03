class Solution {
    public int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            //checking middle element is odd or even because it follows the pattern
            //[0,1] [2,3] [4,5] then number is at left side 
            //[3,4] [5,6] [7,8] then number is at right side 
            if (mid % 2 == 0) {
                mid++;
            }
            if (nums[mid] != nums[mid - 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];

    }
}