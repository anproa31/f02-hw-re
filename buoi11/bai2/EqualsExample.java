package buoi11.bai2;

public class EqualsExample {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
        System.out.println("str1 == str2: " + (str1 == str2)); // true (do String pool)
        System.out.println("str1 == str3: " + (str1 == str3)); // false (khác tham chiếu)

        // So sánh Integer bằng equals()
        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = new Integer(100);

        System.out.println("num1.equals(num2): " + num1.equals(num2)); // true
        System.out.println("num1.equals(num3): " + num1.equals(num3)); // true
        System.out.println("num1 == num2: " + (num1 == num2)); // true (do Integer cache)
        System.out.println("num1 == num3: " + (num1 == num3)); // false (khác tham chiếu)

        // Tự định nghĩa phương thức equals() cho class
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        Person p3 = new Person("Jane", 25);

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Person person = (Person) obj;
            return age == person.age &&
                    (name == null ? person.name == null : name.equals(person.name));
        }
    }
}