class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> word=new HashSet(wordList);//it will be easy to check if wordlist contains that word
        Queue<String> q=new LinkedList<>();
        Set<String> visited=new HashSet<>();//to keep track of visited words;
        q.add(beginWord);
        visited.add(beginWord);
        
        int level=0;
        while(!q.isEmpty())
        {
            for(int i=q.size();i>0;i--)
            {
                String curr_word=q.poll();
                if(curr_word.equals(endWord))
                    return level+1;
                
                char[] c=curr_word.toCharArray();
                for(int j=0;j<c.length;j++)//to replace every character of that word and check if it is present in wordlist
                {
                   char temp=c[j];
                   for(char ch='a'; ch<='z'; ch++)
                   {
                       c[j]=ch;
                       String word_formed=String.valueOf(c);//if this newly formed word isnt visited and also present in the wordlist add it to the queue
                       if(!visited.contains(word_formed) && word.contains(word_formed))
                       {
                           q.add(word_formed);
                           visited.add(word_formed);
                       }
                   }
                    c[j]=temp;
                }
            }
            
            level++;//moving to the next level
        }
        
        return 0;
    }

        
    
}