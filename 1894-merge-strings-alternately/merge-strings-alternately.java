class Solution {
    public String mergeAlternately(String word1, String word2) {
       String[] arr = {word1, word2};
       int word1Length =word1.length();
       int word2Length =word2.length();

       int i = 0;
       StringBuilder sb = new StringBuilder();
       while(i < word1Length || i < word2Length){
           for(String word : arr){
               if(i>= word.length()){
                   continue;
               }else{
                   sb.append(word.charAt(i));
               }
           }
           i++;
       } 
       return sb.toString();
    }
}