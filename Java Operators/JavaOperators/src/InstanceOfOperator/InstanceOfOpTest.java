package InstanceOfOperator;

public class InstanceOfOpTest {
    public static void main(String[] args) {
        Shpend obj1 = new Shpend();
        Shpend obj2 = new Harabel();

        // Shembuj me objektin e tipit Shpend
        System.out.println("obj1 instanceof Shpend: "
                + (obj1 instanceof Shpend));
        System.out.println("obj1 instanceof Harabel: "
                + (obj1 instanceof Harabel));
        System.out.println("obj1 instanceof TestInterface: "
                + (obj1 instanceof TestInterface));

        // Shembuj me objektin e tipit Harabel
        System.out.println("obj2 instanceof Shpend: "
                + (obj2 instanceof Shpend));
        System.out.println("obj2 instanceof Harabel: "
                + (obj2 instanceof Harabel));
        System.out.println("obj2 instanceof TestInterface: "
                + (obj2 instanceof TestInterface));
    }
}

class Shpend {
}

class Harabel extends Shpend implements TestInterface {
}

interface TestInterface {
}
