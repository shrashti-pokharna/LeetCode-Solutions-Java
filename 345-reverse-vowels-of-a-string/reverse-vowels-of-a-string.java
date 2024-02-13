class Solution {
    public String reverseVowels(String s) {
       char[] word = s.toCharArray();
       int start = 0;
       int end = word.length - 1;

       String vowels = "aeiouAEIOU";
       while(start < end){

           while (start < end && vowels.indexOf(word[start]) == -1) {
                start++;
            }
            
            while (start < end && vowels.indexOf(word[end]) == -1) {
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
       }
       return String.valueOf(word);
        
    }
}