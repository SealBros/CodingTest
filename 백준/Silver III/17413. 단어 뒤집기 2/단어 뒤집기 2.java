import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        String result = "";

        boolean check = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<') {
                check = true;
                while (!stack.empty()) {
                    result += stack.pop();
                }
                result += s.charAt(i);
            } 
            else if (s.charAt(i) == '>') {
                check = false;
                result += s.charAt(i);
            } 
            else if (check) {
                result += s.charAt(i);
            } 
            else if (!check) {
                if (s.charAt(i) == ' ') {
                    while (!stack.empty()) {
                        result += stack.pop();
                    }
                    result += s.charAt(i);
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        while (!stack.empty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}