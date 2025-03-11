package buoi3.buoi2.buoi1;

public class Hw0112 {
        public static void main(String[] args) {
            System.out.println("The sum of the digits of 538 is:");
            System.out.println("Hundreds digit: " + (538 / 100));
            System.out.println("Tens digit: " + ((538 % 100) / 10));
            System.out.println("Ones digit: " + (538 % 10));
            System.out.println("Sum of digits: " + ((538 / 100) + ((538 % 100) / 10) + (538 % 10)));
        }

}

