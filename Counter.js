/**
 * @param {number} n
 * @return {Function} counter
 */

var createCounter = function(n) 
{
    var timesCalled = 0; 
    return function() 
    {
        var result = n + timesCalled;
        timesCalled++;
        return result;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */