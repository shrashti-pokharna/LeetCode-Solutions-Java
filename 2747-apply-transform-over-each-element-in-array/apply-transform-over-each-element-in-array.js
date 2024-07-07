/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    var  number = [];
    for(i=0;  i<arr.length; i++){
        number.push(fn(arr[i], i))
    }
    return number;
};
