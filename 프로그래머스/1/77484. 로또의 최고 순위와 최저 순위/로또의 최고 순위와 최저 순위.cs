using System;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums)
    {
        int zero_count = 0;
        int win_count = 0;

        for(int i = 0; i< lottos.Length; i++)
        {
            if (lottos[i] == 0)
            {
                zero_count++;
            }
            for(int j = 0; j< win_nums.Length; j++)
            {
                if (lottos[i] == win_nums[j])
                {
                    win_count++;
                }
            }
        }
        int max = ranking(zero_count + win_count);
        int min = ranking(win_count);

        int[] answer = new int[] { max, min };

        return answer;
    }

    public int ranking(int num)
    {
        if (num < 2)
            return 6;

        return 7 - num;
    }
}