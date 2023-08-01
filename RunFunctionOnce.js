/** 2666
 * @param {Function} fn
 * @return {Function}
 */


var once = function(fn) {
    
    var ranOnce = false;

    return function(...args){
        if(!ranOnce)
        {
            ranOnce = true;
            return fn.apply(this, args);
        }
        else return undefined;
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */