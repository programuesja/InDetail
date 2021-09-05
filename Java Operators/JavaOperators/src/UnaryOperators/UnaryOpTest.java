package UnaryOperators;

public class UnaryOpTest {
    public static void main(String[] args) {
        // deklarojme variablat
        int a = 7, b = 7;
        int result1, result2;

        // vlera fillestare e a
        System.out.println("Vlera e variablit a: " + a);
        result1 = ++a;
        System.out.println("Pas inkrementimit: " + result1);

        // vlera fillestare e b
        System.out.println("Vlera e variablit b: " + b);
        result2 = --b;
        System.out.println("Pas dekrementimit: " + result2);

        /** Shembull me operatorin ! */
        boolean boolVariable = false;
        boolean isJava = !boolVariable;

        //Vlera e boolVariable
        System.out.println("Vlera e boolVariable: " + boolVariable);

        //Vlera e isJava
        System.out.println("Vlera e isJava: " + isJava);
    }
}
