/**
 * @param {number[]} nums
 * @return {number}
 */
var minimumOperations = function(nums) {
    let count = 0;
    for(let i = 0; i<nums.length; i++){
        if(nums[i] % 3 === 0) continue
        else if(nums[i] % 3  <  3-(nums[i] % 3)){
            count += nums[i] % 3;
        }else{
            count += 3 -(nums[i] % 3);
        }
    }
    return count;
    
};