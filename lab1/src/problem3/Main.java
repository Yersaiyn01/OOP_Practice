package problem3;

public class Main {
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        Temperature t2 = new Temperature(299, 'C');
        Temperature t3 = new Temperature(999, 'F');

        System.out.println("T2 in F: " + t2.getFahrenheit());
        System.out.println("T3 in C: " + t3.getCelsius());

        t1.setBoth(25.0, 'C');
        System.out.println("T1: " + t1.getCelsius() + " " + t1.getScale());
    }
}