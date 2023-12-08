using System;

public class Solution {
    public int solution(int n, int m, int[] section) {
        
        int start = section[0];
        int count = 1;
        
        for(int i = 0; i<section.Length; i++){
            if(start + m-1 < section[i]){
                count++;
                start = section[i];
            }
        }
        return count;
    }
}