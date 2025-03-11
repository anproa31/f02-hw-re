package buoi1;

public class Hw0108 {
    public static void main(String[] args) {
        System.out.println("Distance: 24 miles"); //convert miles to km (24 * 1.6)
        System.out.println("Time: 1 hour, 40 minutes, and 35 seconds"); //convert to hours (1 + 40.0 / 60 + 35.0 / 3600)
        System.out.println("Average speed: " + ((24 * 1.6) / (1 + 40.0 / 60 + 35.0 / 3600)) + " km/h");
    }
}

