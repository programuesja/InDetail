package PolymorphismExample.MethodOverloadExample;

public class TestClass {
    public static void main(String[] args) {
        Shapes forma = new Shapes();  // Krijojme nje objekt Shapes

        forma.siperfaqja();
        forma.siperfaqja(5);
        forma.siperfaqja(6.0, 1.2);
        forma.siperfaqja(6, 2);
    }
}
