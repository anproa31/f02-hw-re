package buoi11.bai2;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Khởi tạo BigInteger
        BigInteger bi1 = new BigInteger("9876543210987654321098765432109876543210");
        BigInteger bi2 = BigInteger.valueOf(123456789);
        BigInteger bi3 = new BigInteger("FFFF", 16); // Từ số hex

        System.out.println("bi1: " + bi1);
        System.out.println("bi2: " + bi2);
        System.out.println("bi3 (hex FFFF): " + bi3);

        // Các hằng số
        System.out.println("BigInteger.ZERO: " + BigInteger.ZERO);
        System.out.println("BigInteger.ONE: " + BigInteger.ONE);
        System.out.println("BigInteger.TEN: " + BigInteger.TEN);

        // Các phép toán cơ bản
        System.out.println("bi1.add(bi2): " + bi1.add(bi2));
        System.out.println("bi1.subtract(bi2): " + bi1.subtract(bi2));
        System.out.println("bi1.multiply(bi2): " + bi1.multiply(bi2));
        System.out.println("bi1.divide(bi2): " + bi1.divide(bi2));
        System.out.println("bi1.remainder(bi2): " + bi1.remainder(bi2));
        System.out.println("bi1.divideAndRemainder(bi2)[0]: " + bi1.divideAndRemainder(bi2)[0]); // Phần nguyên
        System.out.println("bi1.divideAndRemainder(bi2)[1]: " + bi1.divideAndRemainder(bi2)[1]); // Phần dư

        // Các phép toán nâng cao
        System.out.println("bi2.pow(3): " + bi2.pow(3));
        System.out.println("bi2.sqrt(): " + bi2.sqrt());
        System.out.println("bi2.gcd(BigInteger.valueOf(12345)): " +
                bi2.gcd(BigInteger.valueOf(12345)));
        System.out.println("bi2.abs(): " + bi2.abs());
        System.out.println("bi2.negate(): " + bi2.negate());

        // Kiểm tra số nguyên tố
        BigInteger prime = BigInteger.valueOf(997);
        System.out.println("prime.isProbablePrime(100): " + prime.isProbablePrime(100));

        // So sánh
        System.out.println("bi1.compareTo(bi2): " + bi1.compareTo(bi2));
        System.out.println("bi1.min(bi2): " + bi1.min(bi2));
        System.out.println("bi1.max(bi2): " + bi1.max(bi2));

        // Chuyển đổi
        System.out.println("bi3.intValue(): " + bi3.intValue());
        System.out.println("bi3.longValue(): " + bi3.longValue());
        System.out.println("bi3.floatValue(): " + bi3.floatValue());
        System.out.println("bi3.doubleValue(): " + bi3.doubleValue());

        // Các phương thức bit
        System.out.println("bi3.bitCount(): " + bi3.bitCount());
        System.out.println("bi3.bitLength(): " + bi3.bitLength());
        System.out.println("bi3.and(BigInteger.valueOf(255)): " + bi3.and(BigInteger.valueOf(255)));
        System.out.println("bi3.or(BigInteger.valueOf(1)): " + bi3.or(BigInteger.valueOf(1)));
        System.out.println("bi3.xor(BigInteger.valueOf(65535)): " + bi3.xor(BigInteger.valueOf(65535)));
        System.out.println("bi3.shiftLeft(4): " + bi3.shiftLeft(4));
        System.out.println("bi3.shiftRight(4): " + bi3.shiftRight(4));
    }
}