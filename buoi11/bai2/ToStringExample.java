package buoi11.bai2;

public class ToStringExample {
    public static void main(String[] args) {
        // toString() tự định nghĩa
        Student student = new Student("Nguyen Van A", 20, "Computer Science");
        System.out.println(student.toString());
        System.out.println(student); // Gọi toString() ngầm định

        // toString() của các class có sẵn
        Integer num = 123;
        System.out.println("Integer.toString(): " + num.toString());

        Double d = 456.789;
        System.out.println("Double.toString(): " + d.toString());

        Boolean b = true;
        System.out.println("Boolean.toString(): " + b.toString());

        // Chuyển đổi số thành chuỗi với cơ số khác
        int value = 255;
        System.out.println("Integer.toString(value, 2): " + Integer.toString(value, 2)); // Binary
        System.out.println("Integer.toString(value, 8): " + Integer.toString(value, 8)); // Octal
        System.out.println("Integer.toString(value, 16): " + Integer.toString(value, 16)); // Hex
    }

    static class Student {
        private String name;
        private int age;
        private String major;

        public Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", major='" + major + '\'' +
                    '}';
        }
    }
}