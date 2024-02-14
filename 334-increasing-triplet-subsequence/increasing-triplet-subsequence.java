class Solution {
    public boolean increasingTriplet(int[] nums) {

        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;


        for(int big : nums) {
            if(big <= small) {
                small = big;
            }
            else if(big <= mid) {
                mid = big;
            }
            else return true;
        }
        return false;
        // int n = nums.length;
        // for(int i = 0; i < n ; i++){
        //     if(n==1 || n == 2 ) return false;
        //     int j = i + 1;
        //     int k = j + 1;
        //     if(j <= n - 2 && k <= n-1 &&  nums[j] < nums[k] && nums[i] <nums[j]){
        //         return true;
        //     }
        // }
        // return false;
        
    }
}