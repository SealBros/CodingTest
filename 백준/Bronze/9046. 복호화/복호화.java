import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine().replaceAll(" ", "");

            int max = 0;
            int count = 0;

            int[] alphabet = new int[26];

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c >= 'a' && c <= 'z') {
                    alphabet[c - 'a']++;
                }
            }

            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] > alphabet[max]) {
                    max = j;
                }
            }

            for (int k : alphabet) {
                if (k == alphabet[max]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("?");
            } else {
                System.out.println((char) ('a' + max));
            }
        }
    }
}
