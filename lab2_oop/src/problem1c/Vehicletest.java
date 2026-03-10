package problem1c;
import java.util.HashSet;
class TestVehicles {
    public static void main(String[] args) {
        HashSet<Vehicle> set = new HashSet<>();
        set.add(new Car("ABC123", "Toyota"));
        set.add(new Car("ABC123", "Toyota")); 
        set.add(new Car("XYZ789", "Honda"));

        for (Vehicle v : set) {
            System.out.println(v);
        } 
    } 
} 