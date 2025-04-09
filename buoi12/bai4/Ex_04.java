package buoi12.bai4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex_04 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập chỉ số mảng (0-4): ");
                int index = scanner.nextInt();
                System.out.print("Nhập giá trị cần gán: ");
                int value = scanner.nextInt();
                array[index] = value;
                System.out.println("Giá trị tại vị trí " + index + " là: " + array[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lỗi: Vượt quá chỉ số mảng. Vui lòng nhập lại.");
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Nhập sai định dạng. Vui lòng nhập số nguyên.");
                scanner.nextLine(); // Xóa dữ liệu sai
            }
        }
    }
}
