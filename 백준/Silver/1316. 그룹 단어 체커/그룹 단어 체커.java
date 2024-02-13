import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for (int j = 0; j < s.length(); j++) {
                int ch = s.charAt(j) - 'a';
                if (arr[ch]) {
                    if (s.charAt(j) != s.charAt(j - 1)) {
                        check = false;
                        break;
                    }
                } else {
                    arr[ch] = true;
                }
            }
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }
}