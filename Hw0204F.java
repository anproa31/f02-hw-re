import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0204F {
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
                String[] parts = line.split("\\s+");

                if (parts.length == 3) {
                        int day = Integer.parseInt(parts[0]);
                        int month = Integer.parseInt(parts[1]);
                        int year = Integer.parseInt(parts[2]);

                        String formattedDate = String.format("%02d/%02d/%04d", day, month, year);
                        writer.println("Formatted Date: " + formattedDate);
                } else {
                    writer.println("Invalid input format: " + line);
                }
            }

            scanner.close();
            writer.close();
            System.out.println("Check the output file in the resources folder.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
        }
    }
}

