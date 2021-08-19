package PolymorphismExample.MethodOverloadExample;

public class Shapes {
    public void siperfaqja() {
        System.out.println("Gjej siperfaqen: ");
    }

    public void siperfaqja(int r) {
        System.out.println("Siperfaqja e rrethit = " + 3.14 * r * r);
    }

    public void siperfaqja(double b, double h) {
        System.out.println("Siperfaqja e trekendeshit = " + 0.5 * b * h);
    }

    public void siperfaqja(int l, int b) {
        System.out.println("Siperfaqja e drejtkendeshit = " + l * b);
    }
}

