package buoi11.bai2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {
        // Khởi tạo BigDecimal
        BigDecimal bd1 = new BigDecimal("123.456789");
        BigDecimal bd2 = BigDecimal.valueOf(23.45);
        BigDecimal bd3 = new BigDecimal(123.456789); // Không chính xác, nên tránh

        System.out.println("bd1: " + bd1);
        System.out.println("bd2: " + bd2);
        System.out.println("bd3 (khởi tạo không chính xác): " + bd3);

        // Các hằng số
        System.out.println("BigDecimal.ZERO: " + BigDecimal.ZERO);
        System.out.println("BigDecimal.ONE: " + BigDecimal.ONE);
        System.out.println("BigDecimal.TEN: " + BigDecimal.TEN);

        // Các phép toán cơ bản
        System.out.println("bd1.add(bd2): " + bd1.add(bd2));
        System.out.println("bd1.subtract(bd2): " + bd1.subtract(bd2));
        System.out.println("bd1.multiply(bd2): " + bd1.multiply(bd2));

        // Phép chia (cần chỉ định cách làm tròn)
        System.out.println("bd1.divide(bd2, 4, RoundingMode.HALF_UP): " +
                bd1.divide(bd2, 4, RoundingMode.HALF_UP));
        System.out.println("bd1.divide(bd2, RoundingMode.HALF_UP): " +
                bd1.divide(bd2, RoundingMode.HALF_UP));
        System.out.println("bd1.divide(bd2, new MathContext(5)): " +
                bd1.divide(bd2, new MathContext(5)));

        // Các phép toán nâng cao
        System.out.println("bd1.pow(2): " + bd1.pow(2));
        System.out.println("bd1.pow(2, new MathContext(5)): " +
                bd1.pow(2, new MathContext(5)));
        System.out.println("bd1.abs(): " + bd1.abs());
        System.out.println("bd1.negate(): " + bd1.negate());

        // Làm tròn
        System.out.println("bd1.setScale(2, RoundingMode.HALF_UP): " +
                bd1.setScale(2, RoundingMode.HALF_UP));
        System.out.println("bd1.setScale(2, RoundingMode.DOWN): " +
                bd1.setScale(2, RoundingMode.DOWN));
        System.out.println("bd1.round(new MathContext(4)): " +
                bd1.round(new MathContext(4)));

        // Di chuyển dấu thập phân
        System.out.println("bd1.movePointLeft(2): " + bd1.movePointLeft(2));
        System.out.println("bd1.movePointRight(2): " + bd1.movePointRight(2));

        // Lấy thông tin
        System.out.println("bd1.precision(): " + bd1.precision());
        System.out.println("bd1.scale(): " + bd1.scale());
        System.out.println("bd1.signum(): " + bd1.signum());

        // So sánh
        System.out.println("bd1.compareTo(bd2): " + bd1.compareTo(bd2));
        System.out.println("bd1.max(bd2): " + bd1.max(bd2));
        System.out.println("bd1.min(bd2): " + bd1.min(bd2));

        // So sánh bằng (cẩn thận)
        BigDecimal a = new BigDecimal("1.00");
        BigDecimal b = new BigDecimal("1.0");
        System.out.println("a.equals(b): " + a.equals(b)); // false vì khác scale
        System.out.println("a.compareTo(b) == 0: " + (a.compareTo(b) == 0)); // true, nên dùng cách này

        // Chuyển đổi
        System.out.println("bd1.unscaledValue(): " + bd1.unscaledValue());
        System.out.println("bd1.intValue(): " + bd1.intValue());
        System.out.println("bd1.longValue(): " + bd1.longValue());
        System.out.println("bd1.floatValue(): " + bd1.floatValue());
        System.out.println("bd1.doubleValue(): " + bd1.doubleValue());
        System.out.println("bd1.toBigInteger(): " + bd1.toBigInteger());
        System.out.println("bd1.toPlainString(): " + bd1.toPlainString());
        System.out.println("bd1.toEngineeringString(): " + bd1.toEngineeringString());
    }
}