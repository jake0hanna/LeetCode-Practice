/**
 * @return {Function}
 */
var createHelloWorld = function() 
{//2667
    return function(...args) 
    {

        return "Hello World";
        
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */