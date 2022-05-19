// { Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            arr[i] = input_ar1[i];
        let obj = new Solution();
        if(obj.findTriplets(arr, n)){
            console.log("1");
        }
        else{
            console.log("0");
        }
        
    }
}// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {boolean}
*/

class Solution {
    //Function to find triplets with zero sum.
    findTriplets(arr, n)
    {
       
       
    //   for(let i=0;i<n-2;i++){
    //       for(let j=i+1;j<n-1;j++){
    //           for(let k=j+1;k<n;k++){
    //               if(arr[i]+arr[j]+arr[k]===0){
    //                   return 1;
    //               }
    //               return 0;
    //           }
    //       }
    //   }
    
    
    for (var i = 0; i < n - 1; i++)
    {
        // Find all pairs with sum equals to
        // "-arr[i]"
        var s = new Set();
        for (var j = i + 1; j < n; j++)
        {
            var x = -(arr[i] + arr[j]);
            if (s.has(x))
            {
                return 1;
            }
            else
                s.add(arr[j]);
        }
    }
 
    return 0;
    }
}