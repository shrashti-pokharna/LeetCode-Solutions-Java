class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int num : nums){
            // int digitCount = 0;
            // while(num > 0){
            //     num = num/10;
            //     digitCount++;
            // }
            // if we don't want to use while to calculate no of digits'
            int digitCount = (int)(Math.log10(num)) + 1;
            if(digitCount %2 == 0){
                evenCount++;
            }
        }
        return evenCount;
        
    }
}