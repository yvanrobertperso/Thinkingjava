//Dog.java
import java.util.*;

public class Dog {
    String name;
    String says;
    
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "Spot";
        spot.says = "Ruff!";
        scruffy.name = "Scruffy";
        scruffy.says = "Wurf!";

        System.out.println(spot.name + " says " + spot.says);
        System.out.println(scruffy.name + " says " + scruffy.says);

        Dog butch = new Dog();
       // butch = spot;
        butch.name = "Butch";
        butch.says = "Ruff!";

        System.out.println(butch == spot);
        System.out.println(butch.equals(spot));
        System.out.println(butch.name.equals(spot.name));
        System.out.println(butch.says == spot.says);
        System.out.println(butch.name == spot.name);
        System.out.println(butch.says.equals(spot.says));
        System.out.println(butch.name + " says " + butch.says);
}
}

