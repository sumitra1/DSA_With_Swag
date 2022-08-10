class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Map<Integer,Double> cache = new HashMap<>();

        for(int i:arr)
            cache.put(i,1d);
        
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            for(int j=0;j<i;j++){
                if(n%arr[j]!=0) 
                    continue;
                int n2 = n/arr[j];
                if(!cache.keySet().contains(n2))
                    continue;
                
                double sum = cache.get(n)+cache.get(arr[j])*cache.get(n2);        
                cache.put(n,sum);
            }
        }
        
        double sum = cache.values().stream().mapToDouble(x->x).sum();
        return (int)(sum%1000000007);
    }
}