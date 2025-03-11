package buoi3.buoi2.buoi1;

public class Hw0110 {
    public static void main(String[] args) {
        System.out.println("The solution to the system of equations is:");
        /*
            3.4x + 50.2y = 44.5
            2.1x + .55y = 5.9
        * */
        System.out.println("a: " + 3.4);
        System.out.println("b: " + 50.2);
        System.out.println("e: " + 44.5);

        System.out.println("c: " + 2.1);
        System.out.println("d: " + 0.55);
        System.out.println("f: " + 5.9);

        // Formula for x = (ed - bf) / (ad - bc)
        System.out.println("x = " + ((44.5 * 0.55 - 50.2 * 5.9) / (3.4 * 0.55 - 50.2 * 2.1)));

        // Formula for y = (af - ec) / (ad - bc)
        System.out.println("y = " + ((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * 0.55 - 50.2 * 2.1)));
    }
}

