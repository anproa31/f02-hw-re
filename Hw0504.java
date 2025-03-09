import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hw0504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dimensions of the 3D array (x y z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int[][][] array = new int[x][y][z];

        System.out.println("Enter the elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = scanner.nextInt();
                }
            }
        }

        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < z; k++) {
                        writer.write(array[i][j][k] + " ");
                    }
                    writer.write("\n");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
