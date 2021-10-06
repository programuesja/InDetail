package DoWhileLoopExamples;

public class ComparisonDoWhileAndWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            //ekzekutohet 1 here
            System.out.println("do-while loop");
            System.out.println(i);
            i++;
        } while (i < 1);

        int j = 1;
        while (j  < 1) {
            // nuk ekzekutohet
            System.out.println("while loop");
            System.out.println(j);
            j++;
        }
    }
}
