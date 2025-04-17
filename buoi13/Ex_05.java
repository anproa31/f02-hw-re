package buoi13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to add to queue (type 'done' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                queue.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, skipped: " + input);
            }
        }

        System.out.println("\nNumbers in queue (in input order):");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        scanner.close();
    }
}