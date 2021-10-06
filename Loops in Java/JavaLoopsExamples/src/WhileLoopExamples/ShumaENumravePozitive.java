package WhileLoopExamples;

import java.util.Scanner;

// Program per llogaritjen e shumes se numrave pozitive
public class ShumaENumravePozitive {
    public static void main(String[] args) {
        int shuma = 0;
        // Krijojme objekt te klases Scanner
        Scanner input = new Scanner(System.in);

        // Merr input int nga perdoruesi
        System.out.println("Vendos nje numer");
        int numer = input.nextInt();

        // while loop vazhdon derisa te vendoset nje numer negativ
        while (numer >= 0) {
            // Mbledh vetem numra pozitive
            shuma += numer;

            System.out.println("Vendos nje numer");
            numer = input.nextInt();
        }

        System.out.println("Shuma = " + shuma);
        input.close();
    }
}
