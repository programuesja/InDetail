package PrivateAccessModifier;

public class TestClassPrivate {
    public static  void main(String[] args) {
        Shpend shpend = new Shpend();
//        shpend.ngjyra = "e zeze";
//        shpend.emri = "nje emer";

        // Vendosim ngjyren dhe emrin
        shpend.setNgjyra("e zeze");
        shpend.setEmri("nje emer");

        // Printojme vlerat e sapo vendosura
        System.out.println("Ngjyra e vendosur eshte: " + shpend.getNgjyra());
        System.out.println("Emri i vendosur eshte: " + shpend.getEmri());
    }
}
