package InheritanceExample;

public class Harabel extends Shpend {
    private String ngjyra; // variabel instance

    public Harabel(){
        // konstruktor bosh
    }

    // Metode per te vendosur ngjyren e harabelit
    public void setNgjyra(String ngjyra) {

        // this -> keyword per t'ju referuar variablit te instances
        this.ngjyra = ngjyra;
    }

    // Metode per te marre ngjyren e harabelit pasi fusha eshte private
    public String getNgjyra() {
        return ngjyra;
    }
}
