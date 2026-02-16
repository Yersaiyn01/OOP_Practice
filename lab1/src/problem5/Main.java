package problem5;

public class Main {
    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));

        System.out.println("Line: " + dl); 

        if (dl.willDragonEatOrNot()) {
            System.out.println("Dragon will have a lunch!");
        } else {
            System.out.println("No one left for a dragon lunch!");
        }
    }
}
