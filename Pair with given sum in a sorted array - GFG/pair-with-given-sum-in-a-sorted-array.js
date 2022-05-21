// { Driver Code Starts
//Initial Template for javascript

"use strict";

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", (inputStdin) => {
  inputString += inputStdin;
});

process.stdin.on("end", (_) => {
  inputString = inputString
    .trim()
    .split("\n")
    .map((string) => {
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
  for (; i < t; i++) {
    let n = parseInt(readLine());
    let arr = readLine()
      .trim()
      .split(" ")
      .map((x) => parseInt(x));
    let k = parseInt(readLine());
    let obj = new Solution();
    let res = obj.Countpair(arr, n, k);
    console.log(res);
  }
}// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} arr
 * @param {number} n
 * @param {number} k
 * @return {number}
 */

class Solution {
  Countpair(arr, n, k) {
    //code here
    
    let l=0;
    let r=n-1;
    let count=0;
    let flag=false;
    while(l<r){
        if(arr[l]+arr[r]==k){
            
            count++;
            flag=true;
            l++;
        }else if(arr[l]+arr[r]<k){
            l++;
        }else{
            r--;
        }
    }
    if(flag){
        return count;
    }else{
        return -1;
    }
    
    
  }
}