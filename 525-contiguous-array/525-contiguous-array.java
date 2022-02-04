class Solution {
    public int findMaxLength(int[] arr) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sum=sum-1;
            }else if(arr[i]==1) {
                sum=sum+1;
            }
            if(map.containsKey(sum)){
                int idx=map.get(sum);
                int len=i-idx;
                if(len>ans){
                    ans=len;
                }
            }else{
                map.put(sum,i);
            }
        }
        return ans;
        
    }
}