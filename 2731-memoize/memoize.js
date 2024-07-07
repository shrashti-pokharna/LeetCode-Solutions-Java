/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    let mp = new Map();
    return function(...args) {
        if(mp.has(JSON.stringify(args))){
            return mp.get(JSON.stringify(args));
        }
        let result = fn(args[0], args[1]);
        mp.set(JSON.stringify(args),result);
        return result;
        
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */