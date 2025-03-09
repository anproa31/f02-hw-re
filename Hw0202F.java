import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0202F {
    public static void main(String[] args) {
        String inputFile = "src/input.txt";   // Relative path for input file
        String outputFile = "src/output.txt"; // Relative path for output file

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
                String line = scanner.nextLine().trim();
                if (line.endsWith("F") || line.endsWith("C")) {
                    try {
                        double value = Double.parseDouble(line.substring(0, line.length() - 1).trim());
                        if (line.endsWith("F")) {
                            double celsius = (value - 32) * 5 / 9;
                            writer.printf("%.2f F is equal to %.2f C%n", value, celsius);
                        } else if (line.endsWith("C")) {
                            double fahrenheit = (value * 9 / 5) + 32;
                            writer.printf("%.2f C is equal to %.2f F%n", value, fahrenheit);
                        }
                    } catch (NumberFormatException e) {
                        writer.println("Invalid number format: " + line);
                    }
                } else {
                    writer.println("Invalid format: " + line);
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
