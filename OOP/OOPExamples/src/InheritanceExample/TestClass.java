package InheritanceExample;

public class TestClass {
    public static void main(String[] args) {
        Harabel h = new Harabel(); // Krijimi i objektit Harabel
        h.setNgjyra("kafe"); // Vendosja e ngjyres se Harabelit
        System.out.println("Zhurma: " + h.getCicerima());
        System.out.println("Ngjyra: " + h.getNgjyra());
    }
}
