package buoi3.buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0201F {
    public static void main(String[] args) {
        String inputFile = "src/input.txt";   // Input file path
        String outputFile = "src/output.txt";

        File inputPath = new File(inputFile);
        File outputPath = new File(outputFile);

        // Check if the input file exists
        if (!inputPath.exists()) {
            System.out.println("Input file does not exist: " + inputFile);
            return; // Exit the program if the input file doesn't exist
        }

        // Ensure the output directory exists
        File outputDir = outputPath.getParentFile();
        if (outputDir != null && !outputDir.exists()) {
            outputDir.mkdirs(); // Create the directory if it doesn't exist
        }

        // Use try-with-resources to automatically close Scanner and PrintWriter
        try (Scanner scanner = new Scanner(inputPath);
             PrintWriter writer = new PrintWriter(outputPath)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    double inches = Double.parseDouble(line.trim());
                    double centimeters = inches * 2.54;
                    writer.printf("%.2f inches is equal to %.2f centimeters.%n", inches, centimeters);
                } catch (NumberFormatException e) {
                    writer.println("Invalid number format: " + line);
                }
            }

            System.out.println("Check the output file: " + outputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to create or write to the output file: " + outputFile);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
