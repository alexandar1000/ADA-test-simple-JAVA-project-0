package declaration.constructor_declaration;

public class Bird {

    public Bird() {}

    protected Bird(int age, String name) {}

    Bird(int age, String name, Callee callee) {}

    Bird(Callee callee, int age, String name) {}

    Bird(Callee callee, Integer age, String name) {}
}
