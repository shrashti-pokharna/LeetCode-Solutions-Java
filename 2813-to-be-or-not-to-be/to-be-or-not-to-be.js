/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    const throwError = (error) => {throw new Error(error)}
    return {
        toBe: (val2) => val2 === val || throwError('Not Equal'),
        notToBe: (val2) => val2 !== val || throwError('Equal'),
    }
    
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */