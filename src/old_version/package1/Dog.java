package old_version.package1;

import old_version.package2.Bulldog;
import old_version.package2.Leg;
import old_version.package2.Term;

public class Dog extends Animal implements Entity, Term {

    static long LENGTH = 12;

    public Dog() {
    }

    public Dog(int number, String str) {
    }

    public Leg getLeg(Fish fish, int x, int y, int z, String s) {
        fish.swim();
        Cat cat = new Cat();
        cat.catchMouse();
        cat.eat(new Bulldog());
        return new Leg();
    }

}
