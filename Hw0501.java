import java.util.*;
class Hw0501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int sum = 0;
        for(int num : arr) sum += num;
        System.out.println("Sum: " + sum);
    }
}

