package invocation.package_invocation;

import com.google.common.base.Strings;

import declaration.package_declaration.Dog;
import invocation.attribute_invocation.*;

import java.util.Set;

public class Farmer {

    Horse horse;

    HorseColor horseColor;

    Donkey donkey;

    Dog dog;

    Set<String> set;

    void farm() {
        Strings.repeat("HEY", 5);
    }
}
