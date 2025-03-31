package buoi11.bai2;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Khởi tạo StringBuilder
        StringBuilder sb1 = new StringBuilder(); // Empty
        StringBuilder sb2 = new StringBuilder("Hello"); // With initial content
        StringBuilder sb3 = new StringBuilder(50); // With initial capacity

        System.out.println("sb2: " + sb2);

        // Thêm nội dung
        sb2.append(", World");
        System.out.println("sb2.append(\", World\"): " + sb2);

        sb2.append('!');
        System.out.println("sb2.append('!'): " + sb2);

        sb2.appendCodePoint(128512); // Smile emoji unicode
        System.out.println("sb2.appendCodePoint(128512): " + sb2);

        // Chèn nội dung
        sb2.insert(5, " Java");
        System.out.println("sb2.insert(5, \" Java\"): " + sb2);

        // Thay thế nội dung
        sb2.replace(6, 10, "Python");
        System.out.println("sb2.replace(6, 10, \"Python\"): " + sb2);

        // Xóa nội dung
        sb2.delete(6, 12);
        System.out.println("sb2.delete(6, 12): " + sb2);

        sb2.deleteCharAt(5);
        System.out.println("sb2.deleteCharAt(5): " + sb2);

        // Đảo ngược chuỗi
        sb2.reverse();
        System.out.println("sb2.reverse(): " + sb2);
        sb2.reverse(); // Đảo ngược lại

        // Đặt kí tự ở vị trí cho trước
        sb2.setCharAt(0, 'h');
        System.out.println("sb2.setCharAt(0, 'h'): " + sb2);

        // Thông tin về capacity và length
        System.out.println("sb2.length(): " + sb2.length());
        System.out.println("sb2.capacity(): " + sb2.capacity());

        // Thay đổi capacity và length
        sb2.ensureCapacity(50);
        System.out.println("sb2.ensureCapacity(50), capacity = " + sb2.capacity());

        sb2.setLength(5);
        System.out.println("sb2.setLength(5): " + sb2);

        // Lấy substring
        System.out.println("sb2.substring(0, 3): " + sb2.substring(0, 3));

        // Chuyển thành String
        String result = sb2.toString();
        System.out.println("sb2.toString(): " + result);
    }
}