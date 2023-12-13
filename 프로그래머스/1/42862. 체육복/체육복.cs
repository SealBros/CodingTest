using System;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve)
    {
        int answer = n - lost.Length;

        Array.Sort(lost);
        Array.Sort(reserve);
        
        for (int i = 0; i < lost.Length; i++)
        {
            for (int j = 0; j < reserve.Length; j++)
            {
                if (lost[i] == reserve[j])
                {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for (int i = 0; i < lost.Length; i++)
        {
            for (int j = 0; j < reserve.Length; j++)
            {
                if (lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1)
                {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}