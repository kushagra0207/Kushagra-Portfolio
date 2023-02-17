/*
 * You are given an array of n strings strs, all of the same length.


 Java Code 
 Kushagra Gupta - 201500364
 Gla University Mathura
 Contact Me - kushagraguptafzd02@gmail.com


 Java code for String str to print and display as usual


 */ 


class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length - 1; j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
