/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function(num) {
    return helper(num, 0)    
};

var helper = (num, count) => {
    if(num === 0){
        return count;
    }
    if(num % 2 === 0){
        return helper(num/2, count+1)
    }else{
        return helper(num - 1, count+1)
    }

}