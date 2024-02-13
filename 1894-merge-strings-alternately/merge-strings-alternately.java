class Solution {
    public String mergeAlternately(String word1, String word2) {
       int word1Length =word1.length();
       int word2Length =word2.length();

       int i = 0;
       StringBuilder sb = new StringBuilder();
       while(i < word1Length || i < word2Length){
           if(i < word1Length) sb.append(word1.charAt(i));
           if(i < word2Length) sb.append(word2.charAt(i));

           i++;
       } 
       return sb.toString();
    }
}