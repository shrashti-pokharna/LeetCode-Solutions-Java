class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String result = "";

        for(int i = arr.length - 1; i>= 0; i--){
            result += arr[i]+ " ";
        }
        
        return result.trim().replaceAll("\\s+"," ") ;
        
    }
}