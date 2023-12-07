using System;
using System.Collections.Generic;
using System.Linq;

class Solution
{
    public int solution(int[] nums){
        int sum = 0;
        int count = 0;
        
        List<int>sumList = new List<int>();
        
        for(int i = 0; i <= nums.Length - 2; i++){
            for(int j = i + 1; j < nums.Length - 1; j++){
                for(int k = j + 1; k< nums.Length; k++){
                    
                    sum = nums[i] + nums[j] + nums[k];
                    sumList.Add(sum);
                }
            }
        }
        foreach(int num in sumList){    
            if (isPrimeNumber(num)) count++;
        }
        return count;
    }
    
    public bool isPrimeNumber(int num){
        for(int i = 2; i<= num/2; i++){
            
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}