package invocation.attribute_invocation;

public class Horse {

    int speed = Donkey.fast_speed + Donkey.slow_speed * 2;

    // inside constructor
    public Horse() {
        HorseColor color = HorseColor.BLUE;

        System.out.println(new Donkey().name);
    }

    // inside method
    HorseColor horseChase() {
        new Donkey().chase(Donkey.fast_speed);

        return HorseColor.YELLOW;
    }

}
