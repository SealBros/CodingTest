import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args) throws NumberFormatException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();
        int n = sc.nextInt();
        String buf = sc.nextLine();
        for(int i=0; i<n; i++)
        {
            String temp = sc.nextLine();
            String[] num = temp.replaceAll("[^0-9]", ",").split(",");

            for(String s : num)
            {
                if(!s.isEmpty())
                {
                    list.add(new BigDecimal(s));
                }
            }
        }
        Collections.sort(list);
        for(BigDecimal b : list)
        {
            System.out.println(b);
        }
    }
}