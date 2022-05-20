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
        let [n,sum] = readLine().trim().split(" ").map((x)=>parseInt(x));
        let arr = readLine().trim().split(" ").map((x)=>parseInt(x));
        let obj = new Solution();
        let res = obj.countTriplets(arr,n,sum);
        if(res===-0)
            res = 0;
        console.log(res.toString());
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} n
 * @param {number} sum
 * @return {number}
*/

class Solution {

    countTriplets(arr,n,sum){
        //code here
        arr.sort((a,b)=>a-b);
    let count=0;
    for (let i = n - 1; i >= 0; i--) {
        let l= 0;
        let r = i - 1;
 
        while (l < r) {
 
            if ( arr[l] + arr[r]+arr[i]>=sum) {
 
             r--;
           
            }
 
 
            else{
                count=count+(r-l);
                l=l+1;
            }
                
        }
    }
    return count;
    }
}