package problem5;

import java.util.Vector;

enum Gender {
    BOY, GIRL
}

class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

  
    public String toString() {
        return gender == Gender.BOY ? "B" : "G";
    }
}

public class DragonLaunch {

    private Vector<Person> victims;

    public DragonLaunch() {
        victims = new Vector<>();
    }

    public void kidnap(Person p) {
        victims.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boys = 0;

        for (Person p : victims) {
            if (p.getGender() == Gender.BOY) {
                boys++;
            } else { 
                if (boys > 0) {
                    boys--;
                } else {
                    return true; 
                }
            }
        }
        return boys > 0; 
    }

    public String toString() {
        return victims.toString();
    }
}
