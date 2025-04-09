package buoi12.bai9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Thêm sinh viên");
                System.out.println("2. Xóa sinh viên theo chỉ số");
                System.out.println("3. Hiển thị danh sách sinh viên");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Xóa dấu enter

                switch (choice) {
                    case 1:
                        System.out.print("Nhập tên sinh viên: ");
                        String name = scanner.nextLine();
                        if (name == null || name.trim().isEmpty()) {
                            throw new InvalidStudentException("Tên sinh viên không hợp lệ.");
                        }
                        students.add(name);
                        System.out.println("Đã thêm sinh viên.");
                        break;

                    case 2:
                        if (students.isEmpty()) {
                            throw new InvalidStudentException("Danh sách sinh viên đang rỗng.");
                        }
                        System.out.print("Nhập chỉ số sinh viên cần xóa: ");
                        int index = scanner.nextInt();
                        scanner.nextLine(); // Xóa newline
                        students.remove(index);
                        System.out.println("Đã xóa sinh viên.");
                        break;

                    case 3:
                        if (students.isEmpty()) {
                            throw new InvalidStudentException("Danh sách sinh viên đang rỗng.");
                        }
                        System.out.println("Danh sách sinh viên:");
                        for (int i = 0; i < students.size(); i++) {
                            System.out.println(i + ": " + students.get(i));
                        }
                        break;

                    case 0:
                        System.out.println("Thoát chương trình.");
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Nhập sai định dạng.");
                scanner.nextLine(); // Xóa dữ liệu sai
                choice = -1;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Lỗi: Chỉ số không hợp lệ.");
                choice = -1;
            } catch (InvalidStudentException | NullPointerException e) {
                System.out.println("Lỗi: " + e.getMessage());
                choice = -1;
            }
        } while (choice != 0);
    }
}
