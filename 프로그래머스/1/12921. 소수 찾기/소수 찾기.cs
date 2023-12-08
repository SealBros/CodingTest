public class Solution {
    public int solution(int n)
    {
        int count = 0;
        bool[] isPrimeNumber = new bool[n + 1];
        
        for (int i = 2; i <= n; i++)
        {
            isPrimeNumber[i] = true;
        }

        for (int i = 2; i * i <= n; i++)
        {
            if (isPrimeNumber[i])
            {
                for (int j = i * i; j <= n; j += i)
                {
                    isPrimeNumber[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++)
        {
            if (isPrimeNumber[i])
            {
                count++;
            }
        }
        
        return count;
    }
}