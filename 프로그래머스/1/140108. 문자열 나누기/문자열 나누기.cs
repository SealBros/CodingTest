using System;

public class Solution {
    public int solution(string s)
    {
        char c = '0';
        
        int answer = 1;
        int sameNumber = 0;
        int differentNumber = 0;

        for(int i = 0; i < s.Length; i++)
        {
            if(c.Equals('0'))
            {
                c = s[i];
            }

            if (c.Equals(s[i]))
            {
                sameNumber++;
            }
            else
            {
                differentNumber++;
            }

            if(sameNumber == differentNumber && i != s.Length - 1)
            {
                answer++;
                c = '0';
                sameNumber = 0;
                differentNumber = 0;
            }
        }
        return answer;
    }
}