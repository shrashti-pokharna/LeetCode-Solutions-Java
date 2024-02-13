class Solution {
    public String mergeAlternately(String word1, String word2) {
       String[] arr = {word1, word2};
       int count = 0;
       for(String word : arr){
           count = Math.max(count, word.length());
       }

       int i = 0;
       StringBuilder sb = new StringBuilder();
       while(i < count){
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