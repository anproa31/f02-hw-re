package buoi3.buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0205F {
    public static void main(String[] args) throws FileNotFoundException {

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
                String fullName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());

                writer.println("Họ và tên: " + fullName);
                writer.println("Tuổi: " + age);
                writer.println("Chiều cao: " + height + "m");
            }

            scanner.close();
            writer.close();
            System.out.println("Check the output file in the resources folder.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFile);
        }

    }
}

