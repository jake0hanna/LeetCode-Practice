/** 2677
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) 
{
    let fullArr = [];
    let currentIndex = 0;

    while(currentIndex < arr.length)
    {
        let chunk = [];

        for(let i = 0; i < size && currentIndex < arr.length; i++, currentIndex++)
        {
            chunk.push(arr[currentIndex]);
        }

        fullArr.push(chunk);
    }

    return fullArr;
};
