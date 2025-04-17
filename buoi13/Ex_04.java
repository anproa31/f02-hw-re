package buoi13;

import java.util.Scanner;
import java.util.Stack;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(char c : input.toCharArray()) {
            st.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while(!st.empty()) {
            reversed.append(st.pop());
        }

        System.out.println("String reversed: " + reversed);

        sc.close();
    }
}
