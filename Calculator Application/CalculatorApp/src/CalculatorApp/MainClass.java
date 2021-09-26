package CalculatorApp;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        double num1;
        double num2;
        char operatori;
        double rezultati = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zgjidh operatorin [+, -, *, /] \n");
        operatori = sc.next().charAt(0);

        System.out.println("Vendos numrin e pare: \n");
        num1 = sc.nextDouble();

        System.out.println("Vendos numrin e dyte: \n");
        num2 = sc.nextDouble();

        if(Character.compare(operatori, '/') == 0 && num2 == 0) {
            System.out.println("Numri i dyte nuk mund te jete 0. Vendos perseri: \n");
            num2 = sc.nextDouble();
        }

        switch (operatori) {
            case '+':
                rezultati = FunksionetLlogaritese.mbledhje(num1, num2);
                break;
            case '-':
                rezultati = FunksionetLlogaritese.zbritje(num1, num2);
                break;
            case '*':
                rezultati = FunksionetLlogaritese.shumezim(num1, num2);
                break;
            case '/':
                rezultati = FunksionetLlogaritese.pjesetim(num1, num2);
                break;
            default:
                System.out.println("Operatori i zgjedhur eshte i gabuar");
                break;
        }

        sc.close();
        System.out.println(num1 + " " + operatori + " " + num2 + " = " + rezultati);
    }
}
