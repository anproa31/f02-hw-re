package buoi5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hw0505 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            int sum = 0;

            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
            }

            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write("Sum of integers: " + sum);
            } catch (IOException e) {
                e.printStackTrace();
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
