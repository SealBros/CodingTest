import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            
            if (s.length() % 2 == 1) continue;
            
            Stack<Character> stack = new Stack<>();
            stack.push(s.charAt(0));
            
            for (int j = 1; j < s.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == s.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(j));
                }
            }
            if (stack.isEmpty()) count++;
        }
        System.out.print(count);
    }
}