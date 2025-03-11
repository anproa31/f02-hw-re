package buoi3.buoi2.buoi1;

public class Hw0109 {
        public static void main(String[] args) {
            System.out.println("Initial population: 312032486");
            System.out.println("Seconds in a year: " + (365 * 24 * 60 * 60));
            System.out.println("Births per year: " + (31536000 / 6));
            System.out.println("Deaths per year: " + (31536000 / 15));
            System.out.println("Immigrants per year: " + (31536000 / 40));
            System.out.println("Net change per year: " + (31536000 / 6 + 31536000 / 40 - 31536000 / 15));
            System.out.println("Total change in 5 years: " + (5 * (31536000 / 6 + 31536000 / 40 - 31536000 / 15)));
            System.out.println("Step 8: Final population after 5 years: " + (312032486 + 5 * (31536000 / 6 + 31536000 / 40 - 31536000 / 15)));
        }

}

