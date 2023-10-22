/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) 
{
    if(obj === undefined || obj === null )
        return true;
        
    if(Object.keys(obj).length === 0)
        return true;

    if(obj instanceof Array && obj.length === 0)
        return true;
    
    return false;
    
};