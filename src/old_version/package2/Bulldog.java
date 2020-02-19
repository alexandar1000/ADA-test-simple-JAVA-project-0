package old_version.package2;

import old_version.package1.Animal;
import old_version.package1.Dog;
import old_version.package1.Fish;

public class Bulldog extends Animal {

    void bark() {
        Leg leg = new Dog().getLeg(new Fish(), new Fish().getSpeed(), new Fish().SPEED, 777, "str");
    }

}