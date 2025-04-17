package buoi13;

import java.io.*;
import java.util.*;

class Student implements Comparable<Student>, Serializable {
    private String studentId;
    private String fullName;
    private int age;
    private double gpa;

    public Student(String studentId, String fullName, int age, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }

    // Getters and setters
    public String getStudentId() { return studentId; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }

    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAge(int age) { this.age = age; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public int compareTo(Student other) {
        return this.fullName.compareTo(other.fullName);
    }

    @Override
    public String toString() {
        return String.format("ID: %-10s | Name: %-20s | Age: %-3d | GPA: %.2f",
                studentId, fullName, age, gpa);
    }
}

public class StudentManagementSystem {
    private static final String DATA_FILE = "students.dat";
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadStudentsFromFile();

        while (true) {
            displayMainMenu();
            int choice = getIntInput("Nhập lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    sortStudentsMenu();
                    break;
                case 6:
                    searchStudent();
                    break;
                case 7:
                    saveStudentsToFile();
                    System.out.println("Đã lưu dữ liệu và thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nQUẢN LÝ SINH VIÊN – MENU");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Sửa sinh viên");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Hiển thị danh sách sinh viên");
        System.out.println("5. Sắp xếp danh sách");
        System.out.println("6. Tìm kiếm sinh viên");
        System.out.println("7. Thoát chương trình");
    }

    private static void sortStudentsMenu() {
        System.out.println("\nSẮP XẾP SINH VIÊN");
        System.out.println("5.1. Theo họ tên (A → Z)");
        System.out.println("5.2. Theo điểm trung bình (Tăng dần)");
        System.out.println("5.3. Theo điểm trung bình (Giảm dần)");

        int choice = getIntInput("Nhập lựa chọn sắp xếp: ");

        switch (choice) {
            case 1:
                sortByName();
                break;
            case 2:
                sortByGpaAscending();
                break;
            case 3:
                sortByGpaDescending();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void addStudent() {
        System.out.println("\nTHÊM SINH VIÊN MỚI");
        String studentId = getStringInput("Nhập mã sinh viên: ");

        if (findStudentById(studentId) != null) {
            System.out.println("Mã sinh viên đã tồn tại!");
            return;
        }

        String fullName = getStringInput("Nhập họ và tên: ");
        int age = getIntInput("Nhập tuổi: ");
        double gpa = getDoubleInput("Nhập điểm trung bình: ");

        students.add(new Student(studentId, fullName, age, gpa));
        System.out.println("Thêm sinh viên thành công!");
    }

    private static void editStudent() {
        System.out.println("\nCHỈNH SỬA THÔNG TIN SINH VIÊN");
        String studentId = getStringInput("Nhập mã sinh viên cần sửa: ");

        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với mã này!");
            return;
        }

        System.out.println("Thông tin hiện tại:");
        System.out.println(student);

        student.setFullName(getStringInput("Nhập họ tên mới (Enter để giữ nguyên): ", student.getFullName()));
        student.setAge(getIntInput("Nhập tuổi mới (Enter để giữ nguyên): ", student.getAge()));
        student.setGpa(getDoubleInput("Nhập điểm TB mới (Enter để giữ nguyên): ", student.getGpa()));

        System.out.println("Cập nhật thông tin thành công!");
    }

    private static void deleteStudent() {
        System.out.println("\nXÓA SINH VIÊN");
        String studentId = getStringInput("Nhập mã sinh viên cần xóa: ");

        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với mã này!");
            return;
        }

        students.remove(student);
        System.out.println("Xóa sinh viên thành công!");
    }

    private static void displayAllStudents() {
        System.out.println("\nDANH SÁCH SINH VIÊN");
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        System.out.println("Tổng số sinh viên: " + students.size());
        students.forEach(System.out::println);
    }

    private static void sortByName() {
        Collections.sort(students);
        System.out.println("Đã sắp xếp theo tên (A-Z)");
        displayAllStudents();
    }

    private static void sortByGpaAscending() {
        students.sort(Comparator.comparingDouble(Student::getGpa));
        System.out.println("Đã sắp xếp theo điểm TB (tăng dần)");
        displayAllStudents();
    }

    private static void sortByGpaDescending() {
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("Đã sắp xếp theo điểm TB (giảm dần)");
        displayAllStudents();
    }

    private static void searchStudent() {
        System.out.println("\nTÌM KIẾM SINH VIÊN");
        String studentId = getStringInput("Nhập mã sinh viên cần tìm: ");

        Student student = findStudentById(studentId);
        if (student == null) {
            System.out.println("Không tìm thấy sinh viên với mã này!");
            return;
        }

        System.out.println("Thông tin sinh viên:");
        System.out.println(student);
    }

    private static Student findStudentById(String studentId) {
        return students.stream()
                .filter(s -> s.getStudentId().equalsIgnoreCase(studentId))
                .findFirst()
                .orElse(null);
    }

    // Utility methods for input
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static String getStringInput(String prompt, String defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : input;
    }

    private static int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ!");
            }
        }
    }

    private static int getIntInput(String prompt, int defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : Integer.parseInt(input);
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số thực hợp lệ!");
            }
        }
    }

    private static double getDoubleInput(String prompt, double defaultValue) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        return input.isEmpty() ? defaultValue : Double.parseDouble(input);
    }

    // File I/O methods
    @SuppressWarnings("unchecked")
    private static void loadStudentsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATA_FILE))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Đã tải dữ liệu từ lần chạy trước.");
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file dữ liệu. Tạo danh sách mới.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi khi đọc file dữ liệu: " + e.getMessage());
        }
    }

    private static void saveStudentsToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATA_FILE))) {
            oos.writeObject(students);
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu file dữ liệu: " + e.getMessage());
        }
    }
}