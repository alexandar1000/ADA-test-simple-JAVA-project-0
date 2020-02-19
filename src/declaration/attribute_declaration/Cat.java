package declaration.attribute_declaration;

import java.util.ArrayList;
import java.util.List;

public class Cat {

    int age;

    public int length = 40;

    final String name = "Kitty";

    private CatEye leftEye;

    protected static final CatEye rightEye = new CatEye("blue");

    List<CatEye> catEyes = new ArrayList<>();

}
