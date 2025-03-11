package buoi10.bai2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private void simplify() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction other) {
        return new Fraction(
                this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator
        );
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(
                this.numerator * other.denominator - other.numerator * this.denominator,
                this.denominator * other.denominator
        );
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Fraction divide(Fraction other) {
        return new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("Sum: " + f1.add(f2));
        System.out.println("Difference: " + f1.subtract(f2));
        System.out.println("Product: " + f1.multiply(f2));
        System.out.println("Quotient: " + f1.divide(f2));
    }
}
