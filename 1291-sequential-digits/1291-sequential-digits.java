class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List <Integer> al =new ArrayList<>();
        for(int i=1;i<=9;i++){
            seqNum(i,i,low,high,al);
        }
        Collections.sort(al);
        return al;
    }
    
    private void seqNum(int num,int  currentDigit, int low, int high,List<Integer> al){
        
        if(num>=low && num<=high){
            al.add(num);
        }
        if(num>=high||currentDigit>=9){
            return;
        }
        
        seqNum(num*10+(currentDigit+1),currentDigit+1,low,high,al);
    }
}