/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function(num) 
{
    this.nums = [...num];
    
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function() 
{
    var sum = 0;
    for(let i = 0; i < this.nums.length; i++)
    {
        sum += this.nums[i];

    }
    return sum;

}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function() 
{

    var str = "[";

    for(let i = 0; i <= this.nums.length; i++)
    {
        str += (this.nums[i]);

        if(i+1 == this.nums.length)
        {
            str += ("]");

            return str;

        }
        else 
            str += (",");


    }

    return "[]";
    
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */