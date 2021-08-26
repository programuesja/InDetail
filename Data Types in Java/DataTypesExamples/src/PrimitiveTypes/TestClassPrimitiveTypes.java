package PrimitiveTypes;

public class TestClassPrimitiveTypes {
    static boolean isFalse;
    static int i2;
    static float floatVariable;

    public static void main(String[] args) {

        /** Shembull me tipin boolean */
        boolean isJava = false;
        if(isJava) {
            System.out.println("isJava is true!!"); //nuk printohet pasi isJava eshte false
        }

        /** Shembull me tipin byte */
        byte a = 126;
        System.out.println("\nShembull per byte: ");
        System.out.println("Vlera fillestare e a: " + a);

        a++; // rrisim vleren me 1
        // Overflows sepse byte ka vlerat ne rangun -128 deri 127
        System.out.println("Vlera e a: " + a);

        a++;
        System.out.println("Vlera e a: " + a);

        a++; // vlera ketu behet -127 sepse -128 + 1 = -127
        System.out.println("Vlera e a: " + a);

        /** Shembull me tipin char */
        char c = 'B';
        System.out.println("\nShembull per char: ");
        System.out.println("Vlera e variablit c eshte: " + c);

        /** Shembull me tipin short */
        short s = 123;
        System.out.println("\nShembull per short: ");
        System.out.println("Vlera e variablit s eshte: " + s);
        short sv = 32767;
        sv++;
        System.out.println("Vlera e variablit sv eshte: " + sv);

        /** Shembull me tipin int */
        int i = 753;
        System.out.println("\nShembull per int: ");
        System.out.println("Vlera e variablit i eshte: " + i);

        /** Shembull me tipin long */
        long l = 1253223L;
        long h = 563l;
        System.out.println("Shembull per long: ");
        System.out.println("Vlera e variablit l eshte: " + l);
        System.out.println("Vlera e variablit h eshte: " + h);

        /** Shembull me tipin float */
        float f = 43.28f;
        float f2 = 75.433F;
        System.out.println("\nShembull per float: ");
        System.out.println("Vlera e variablit f eshte: " + f);
        System.out.println("Vlera e variablit f2 eshte: " + f2);

        /** Shembull me tipin double */
        double d = 76.32d;
        double d2 = 76.32;
        System.out.println("\nShembull per double: ");
        System.out.println("Vlera e variablit d eshte: " + d);
        System.out.println("Vlera e variablit d2 eshte: " + d2);

        /** Shembull per vlerat default */
        System.out.println("\nShembull per vlerat default: ");
        System.out.println("Vlera e isFalse: " + isFalse); //per te treguar se vlera default eshte false
        System.out.println("Vlera e i2: " + i2); //per te treguar se vlera default eshte 0
        System.out.println("Vlera e floatVariable: " + floatVariable); //per te treguar se vlera default eshte 0.0
    }
}
