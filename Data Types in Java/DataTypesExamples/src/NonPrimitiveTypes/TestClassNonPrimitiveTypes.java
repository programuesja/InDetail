package NonPrimitiveTypes;

public class TestClassNonPrimitiveTypes {
    static String s;
    static int[] arr;

    public static void main(String[] args) {
        /** Shembull per vleren default */
        System.out.println("\nShembull per vleren default:");
        System.out.println("Vlera e string-ut 's' duhet te jete null: " + s);
        System.out.println("Vlera e array 'arr' duhet te jete null: " + arr);

        /** Shembull per String */
        System.out.println("\nShembull per String:");
        String s1 = "Hello!";
        System.out.println("Vlera e s1: " + s1);
        s1 = "Hi!";
        System.out.println("Vlera e s1: " + s1);

        /** Shembull per Array */
        System.out.println("\nShembull per Array:");
        int arr[] = new int[7]; // Array nje dimensionale me vlera int
        String arr2[] = {"Hi", "Hello"}; // Array nje dimensionale me vlera String

        System.out.println("Numri i elementeve int qe mund te mbaje arr: " + arr.length);
        System.out.println("Numri i elementeve String qe ka arr2: " + arr2.length);
        System.out.println("Elementi i pare i arr2 eshte: " + arr2[0]);

        double arr3[];
        arr3 = new double[5]; // Array nje dimensionale me vlera double dhe madhësi 5, pra ka 5 elemente
        arr3[0] = 1.5; // Gjithmone indeksimi fillon nga 0
        arr3[1] = 43.6;
        arr3[2] = 355.677;
        arr3[3] = 23.56;
        arr3[4] = 95.054;
        System.out.println("Numri i elementeve double qe ka arr3: " + arr3.length);
        System.out.println("NElementi i peste i arr3 eshte: " + arr3[4]);

        // Printojme gjithe elementet e arr3
        System.out.println("\nElementet e arr3 jane: ");
        for(int i = 0; i < arr3.length; i++) { // iterimi fillon nga 0 dhe shkon deri ne 4 (i < arr3.length ne kete rast 5)
            System.out.println("Elementi me indeks '" + i + "' i arr3 eshte: " + arr3[i]); // i rritet me 1 ne cdo iterim. Perfaqeson indeksin per aksesimin e elemteve
        }

        // Aksesim i gabuar i elementit te peste
        // Nxjerr exception ArrayIndexOutOfBoundsException pasi indeksimi fillon nga 0 (pra shkon deri ne n-1)
        System.out.println("Elementi i peste i arr3 eshte: " + arr3[5]);
    }
}
