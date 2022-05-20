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

/* Function to print an array */
function printArray(arr, size) {
  let i;
  let s = "";
  for (i = 0; i < size; i++) {
    s += arr[i] + " ";
  }
  console.log(s);
}

function main() {
  let t = parseInt(readLine());
  let i = 0;
  for (; i < t; i++) {
    let n = parseInt(readLine());
    let arr = new Array(n);
    let input_ar1 = readLine().split(" ").map((x) => parseInt(x));
    for (let i = 0; i < n; i++) arr[i] = input_ar1[i];
    let obj = new Solution();
    let res = obj.remove_duplicate(arr,n);
    printArray(arr,res);
  }
}// } Driver Code Ends


//User function Template for javascript

/**
 * @param {Number[]} arr
 * @param {Number} n
 * @returns {Number}
 */

class Solution{
    remove_duplicate(a,n){
        //code here
        
        //we will maintain two pointers i and j.. i at 0 and j at 1; 
        //i will keep track for unique values
        //if  a[i] and a[j] is not equal then i++ and replace a[i]=a[j]
        //because j standind where the differnt unique element is present and i stopped 
        //at last unique element in his traversal
        let i=0;
        let j=1;
        
        while(i<n & j<n){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
            j++;
        }
        return i+1;
        
        
    
    }
}