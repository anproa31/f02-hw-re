package buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0203F {
    public static void main(String[] args) {
        String inputFile = "src/input.txt";
        String outputFile = "src/output.txt";

        File inputPath = new File(inputFile);
        File outputPath = new File(outputFile);

        if (!inputPath.exists()) {
            System.out.println("File not found: " + inputFile);
            return;
        }

        File outputDir = outputPath.getParentFile();
        if (outputDir != null && !outputDir.exists()) {
            outputDir.mkdirs(); // Create the directory if it doesn't exist
        }

        try (Scanner scanner = new Scanner(inputPath);
             PrintWriter writer = new PrintWriter(outputPath)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                try {
                    int totalMinutes = Integer.parseInt(line);
                    int years = totalMinutes / 525600;
                    int remainingMinutes = totalMinutes % 525600;
                    int days = remainingMinutes / 1440;
                    remainingMinutes %= 1440;
                    int hours = remainingMinutes / 60;
                    int minutes = remainingMinutes % 60;

                    writer.printf("%d phút = %d năm, %d ngày, %d giờ, %d phút%n",
                            totalMinutes, years, days, hours, minutes);
                } catch (NumberFormatException e) {
                    writer.println("Invalid number format: " + line);
                }
            }
            System.out.println("Check the output file in the resources folder.");
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
    }
}

