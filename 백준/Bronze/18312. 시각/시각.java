import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count=0;

        for(int hour=0;hour<=N;hour++) {
            for(int min=0;min<60;min++) {
                for(int sec=0;sec<60;sec++) {
                    if( hour % 10 == K || hour / 10 == K || min % 10 == K || min / 10 == K || sec % 10 == K || sec / 10 == K ) {
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}