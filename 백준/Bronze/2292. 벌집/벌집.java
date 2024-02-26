import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 1 6 12 18 24 32
        // 1 2~7 8~19 20~37 28~61 ...
        int count = 1;
        int range = 2;
        int hex = 6;

        // range <= N < range + (range * hex)
        // 2 <= N < 8
        // range = range + (count * hex)

        if(N == 1){
            System.out.println(1);
        }
        else{
            while(true){
                if(range <= N && N < range + (hex * count)){
                    count++;
                    System.out.println(count);
                    break;
                }
                else{
                    range = range + (hex * count);
                    count++;   
                }
            }
        }
    }
}