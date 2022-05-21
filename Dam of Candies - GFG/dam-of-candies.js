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

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let height = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            height[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.maxCandy(height, n);
        console.log(res);
        
    }
}// } Driver Code Ends


// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[]} height
 * @param {number} n
 * @returns {number}
*/

class Solution{
    maxCandy(height,n){
        //code here
        let l=0,r=n-1;
        let max_area=0;
       
        while(l<r){
           let area=Math.min(height[l],height[r])*(r-l-1);
            max_area=Math.max(area,max_area);
            
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
            
        }
        return max_area;
        
    }
}

