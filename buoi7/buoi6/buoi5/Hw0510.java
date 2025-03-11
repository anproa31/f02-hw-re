package buoi7.buoi6.buoi5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hw0510 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        inputArrayFromConsole(array, scanner);

        writeArrayToFile(array, "output.txt");

        int[][] fileArray = readArrayFromFile("output.txt");

        System.out.println("Array entered from console:");
        displayArray(array);

        System.out.println("Array read from file:");
        displayArray(fileArray);

        System.out.println("Sum of elements: " + sumArray(array));

        System.out.println("Maximum value: " + findMax(array));
        System.out.println("Minimum value: " + findMin(array));

        int[] maxPos = findMaxPosition(array);
        int[] minPos = findMinPosition(array);
        System.out.printf("Position of maximum value: [%d, %d]\n", maxPos[0], maxPos[1]);
        System.out.printf("Position of minimum value: [%d, %d]\n", minPos[0], minPos[1]);

        System.out.println("Enter the number to find: ");
        int n = scanner.nextInt();
        int[] firstPos = findFirstOccurrence(array, n);
        int[] lastPos = findLastOccurrence(array, n);
        System.out.printf("First occurrence of %d: [%d, %d]\n", n, firstPos[0], firstPos[1]);
        System.out.printf("Last occurrence of %d: [%d, %d]\n", n, lastPos[0], lastPos[1]);

        System.out.println("Enter positions to swap (row1 col1 row2 col2): ");
        int r1 = scanner.nextInt(), c1 = scanner.nextInt();
        int r2 = scanner.nextInt(), c2 = scanner.nextInt();
        swapElements(array, r1, c1, r2, c2);

        System.out.println("Array after swapping:");
        displayArray(array);
    }

    public static void inputArrayFromConsole(int[][] array, Scanner scanner) {
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void writeArrayToFile(int[][] array, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int[] row : array) {
                for (int value : row) {
                    writer.print(value + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static int[][] readArrayFromFile(String filePath) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));

            int rows = 0, cols = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().trim().split("\\s+");
                cols = line.length;
                rows++;
            }

            int[][] array = new int[rows][cols];

            scanner.close();
            scanner = new Scanner(new File(filePath));

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            return array;
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return new int[0][0];
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                max = Math.max(max, value);
            }
        }
        return max;
    }

    public static int findMin(int[][] array) {
        int min = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                min = Math.min(min, value);
            }
        }
        return min;
    }

    public static int[] findMaxPosition(int[][] array) {
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] findMinPosition(int[][] array) {
        int min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] findFirstOccurrence(int[][] array, int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == n) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] findLastOccurrence(int[][] array, int n) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] == n) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void swapElements(int[][] array, int r1, int c1, int r2, int c2) {
        int temp = array[r1][c1];
        array[r1][c1] = array[r2][c2];
        array[r2][c2] = temp;
    }
}
