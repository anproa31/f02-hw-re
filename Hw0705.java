

public class Ex05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    public static void printTriangle(int[] arr) {
        printArray(arr);

        // Base case: Stop recursion when only one element remains
        if (arr.length == 1) return;

        // Create a new array with size reduced by 1
        int[] newArr = new int[arr.length - 1];

        // Compute adjacent sums to populate the new array
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }

        // Recursive call with the new computed array
        printTriangle(newArr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

}
