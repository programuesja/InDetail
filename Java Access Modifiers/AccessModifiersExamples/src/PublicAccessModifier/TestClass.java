package PublicAccessModifier;

// Klase publike
public class TestClass {
    public static void main(String[] args) {
        // Krijojme objektin Shpend duke aksesuar klasen publike
        Shpend shpend = new Shpend();

        // Aksesojme variablin publik
        shpend.cicerima = "Ciu ciu";

        // Aksesojme metoden publike shfaq()
        shpend.shfaq();
    }
}
