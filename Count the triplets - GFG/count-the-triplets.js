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
        let arr = readLine().trim().split(" ").map((x) => parseInt(x)); 
        let obj = new Solution();
        let res = obj.countTriplet(arr,n);
        console.log(res);
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} n
 * @return {number}
*/

class Solution {
    
    countTriplet(arr,n){
       //code here
       
    //   arr.sort((a,b)=>a-b);
    //   let count=0;
    //   for(let i=0;i<n;i++){
    //       let x=arr[i];
    //       let l=1;
    //       let r=n-1;
           
    //       while(l<r){
    //           if(x+arr[l]==arr[r]){
    //               count++;
    //           }else if(x+arr[l]<arr[r]){
    //               r--;
    //           }else{
    //               l++;
    //           }
    //       }
           
    //   }
    //   return count; arr.sort((a,b) => a-b);
 
    // for every element in arr
    // check if a pair exist(in array) whose
    // sum is equal to arr element
    arr.sort((a,b)=>a-b);
    let count=0;
    for (let i = n - 1; i >= 0; i--) {
        let l= 0;
        let r = i - 1;
 
        while (l < r) {
 
            if (arr[i] == arr[l] + arr[r]) {
 
               count++;
             r--;
           
            }
 
            else if (arr[i] > arr[l] + arr[r])
                l =l+ 1;
 
            else
                r =r- 1;
        }
    }
    return count;
       
    }
}