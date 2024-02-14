import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.toUpperCase();

        int[] arr = new int[26];
        int max = 0;
        char ch = '?';

        for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            }
            else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}