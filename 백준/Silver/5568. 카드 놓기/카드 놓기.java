import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] arr;
    static int[] card;
    static boolean[] isCheck;
    static HashSet<String> set=new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        card = new int[n];
        arr = new int[n];
        isCheck = new boolean[n];

        for(int i = 0; i<n; i++){
            card[i] = sc.nextInt();
        }
        dfs(0);
        System.out.println(set.size());
    }
    static void dfs(int depth) {
        if (depth == k) {
            String str = "";
            for (int i = 0; i < arr.length; i++)
                str += arr[i];
            set.add(str);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isCheck[i] == false) {
                isCheck[i] = true;
                arr[depth] = card[i];
                dfs(depth + 1);
                isCheck[i] = false;
            }
        }
    }
}