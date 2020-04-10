package invocation.other_invocation.easy;

import declaration.method_declaration.Fish;
import invocation.attribute_invocation.Donkey;
import invocation.attribute_invocation.Horse;
import invocation.package_invocation.Farmer;

import java.util.HashSet;
import java.util.Set;

// only internal and external invocation should be parsed
// TODO: Recursive constructor call can cause stackoverflow problem
public class Hunter {

    // internal
    Duck duck = new Duck();
    int duckWeight = duck.getWeight();

    // external TODO: find more examples. add constructor, attribute call
    //String s = Strings.repeat("-", 3);

    // self
    Hunter me = new Hunter();
    int myAge = me.getAge();

    // java
    int i = Integer.compare(0, 1);
    Set<String> set = new HashSet<>();

    // inside constructor
    Hunter() {
        // internal
        Horse horse = new Horse();
        horse.toString();

        // external TODO: add constructor
        //boolean boo = Strings.isNullOrEmpty("");

        // self
        Hunter you = new Hunter();
        int yourAge = me.getAge();

        // java
        int i = Integer.compare(0, 1);
        Set<String> set = new HashSet<>();

        new Duck
    }

    // inside method
    void shoot() {
        // internal
        Fish fish = new Fish("little_fishy");
        fish.swim(1);

        // external TODO: add constructor
        //String s = Strings.emptyToNull("");

        Donkey dd = new Donkey();
        dd.chase(0);
        // self
        Hunter me = new Hunter();
        int myAge = me.getAge();

        // java
        System.out.println(666);
        Set<String> set = new HashSet<>();
    }

    int getAge() {
        Farmer ff = new Farmer();
        ff.farm();
        return 20;
    }

}

