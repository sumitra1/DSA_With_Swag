//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
         int size = n - 1;
  
        // Let the first element be stored as
        // previous, we shall loop from index 1
       long prev = arr[0];
  
        // To store previous wall's index
       long prev_index = 0;
        long water = 0;
  
        // To store the water until a larger wall
        // is found, if there are no larger walls
        // then delete temp value from water
       long temp = 0;
        for (int i = 1; i <= size; i++) {
  
            // If the current wall is taller than
            // the previous wall then make current
            // wall as the previous wall and its
            // index as previous wall's index
            // for the subsequent loops
            if (arr[i] >= prev) {
                prev = arr[i];
                prev_index = i;
  
                // Because larger or same height wall is
                // found
                temp = 0;
            }
            else {
  
                // Since current wall is shorter than
                // the previous, we subtract previous
                // wall's height from the current wall's
                // height and add it to the water
                water += prev - arr[i];
  
                // Store the same value in temp as well
                // If we dont find any larger wall then
                // we will subtract temp from water
                temp += prev - arr[i];
            }
        }
  
        // If the last wall was larger than or equal
        // to the previous wall then prev_index would
        // be equal to size of the array (last element)
        // If we didn't find a wall greater than or equal
        // to the previous wall from the left then
        // prev_index must be less than the index
        // of the last element
        if (prev_index < size) {
  
            // Temp would've stored the water collected
            // from previous largest wall till the end
            // of array if no larger wall was found then
            // it has excess water and remove that
            // from 'water' var
            water -= temp;
  
            // We start from the end of the array, so
            // previous should be assigned to the last
            // element
            prev = arr[size];
  
            // Loop from the end of array up to the
            // 'previous index' which would contain the
            // "largest wall from the left"
            for (int i = size; i >= prev_index; i--) {
  
                // Right end wall will be definitely smaller
                // than the 'previous index' wall
                if (arr[i] >= prev) {
                    prev = arr[i];
                }
                else {
                    water += prev - arr[i];
                }
            }
        }
  
        // Return the maximum water
        return water;
    } 
}


