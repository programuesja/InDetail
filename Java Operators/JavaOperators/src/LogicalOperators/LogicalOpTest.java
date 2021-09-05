package LogicalOperators;

public class LogicalOpTest {
    public static void main(String[] args) {
        int a = 7, b = 23;

        /** Shembuj me operatorin && (AND) */
        if((a < 5) && (b > 20)) {
            System.out.println("Test 1 AND"); //nuk printohet
        }

        if((a > 5) && (b < 3)) {
            System.out.println("Test 2 AND"); //nuk printohet
        }

        if((a > 5) && (b < 24)) {
            System.out.println("Test 3 AND"); //printohet
        }

        /** Shembuj me operatorin || (OR) */
        if((a < 5) || (b > 20)) {
            System.out.println("Test 1 OR"); //printohet
        }

        if((a > 5) || (b < 3)) {
            System.out.println("Test 2 OR"); //printohet
        }

        if((a > 5) || (b < 24)) {
            System.out.println("Test 3 OR"); //printohet
        }

        if((a < 5) || (b > 24)) {
            System.out.println("Test 4 OR"); //nuk printohet
        }
    }
}
