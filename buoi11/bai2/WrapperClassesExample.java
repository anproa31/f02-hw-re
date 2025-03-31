package buoi11.bai2;

public class WrapperClassesExample {
    public static void main(String[] args) {
        // Integer wrapper class
        Integer intObj = Integer.valueOf(100);
        System.out.println("Integer.valueOf(100): " + intObj);

        int primitiveInt = intObj.intValue();
        System.out.println("intObj.intValue(): " + primitiveInt);

        System.out.println("Integer.parseInt(\"123\"): " + Integer.parseInt("123"));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.toBinaryString(10): " + Integer.toBinaryString(10));
        System.out.println("Integer.toHexString(255): " + Integer.toHexString(255));
        System.out.println("Integer.compare(5, 10): " + Integer.compare(5, 10));

        // Double wrapper class
        Double doubleObj = Double.valueOf(3.14);
        System.out.println("Double.valueOf(3.14): " + doubleObj);

        double primitiveDouble = doubleObj.doubleValue();
        System.out.println("doubleObj.doubleValue(): " + primitiveDouble);

        System.out.println("Double.parseDouble(\"3.14\"): " + Double.parseDouble("3.14"));
        System.out.println("Double.isInfinite(1.0/0.0): " + Double.isInfinite(1.0/0.0));
        System.out.println("Double.isNaN(0.0/0.0): " + Double.isNaN(0.0/0.0));
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);

        // Boolean wrapper class
        Boolean boolObj = Boolean.valueOf(true);
        System.out.println("Boolean.valueOf(true): " + boolObj);

        boolean primitiveBool = boolObj.booleanValue();
        System.out.println("boolObj.booleanValue(): " + primitiveBool);

        System.out.println("Boolean.parseBoolean(\"true\"): " + Boolean.parseBoolean("true"));
        System.out.println("Boolean.parseBoolean(\"false\"): " + Boolean.parseBoolean("false"));

        // Character wrapper class
        Character charObj = Character.valueOf('A');
        System.out.println("Character.valueOf('A'): " + charObj);

        char primitiveChar = charObj.charValue();
        System.out.println("charObj.charValue(): " + primitiveChar);

        System.out.println("Character.isDigit('5'): " + Character.isDigit('5'));
        System.out.println("Character.isLetter('A'): " + Character.isLetter('A'));
        System.out.println("Character.isUpperCase('A'): " + Character.isUpperCase('A'));
        System.out.println("Character.toLowerCase('A'): " + Character.toLowerCase('A'));
        System.out.println("Character.isWhitespace(' '): " + Character.isWhitespace(' '));
    }
}