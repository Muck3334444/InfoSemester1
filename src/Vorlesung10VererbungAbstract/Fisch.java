package Vorlesung10VererbungAbstract;

public class Fisch extends Lebewesen{
    @Override
    public void movement() {
        System.out.println("Der Fisch schwimmt");
    }
    public Fisch(String art, String lebensraum, int maxAlter) {
        super(art, lebensraum, maxAlter);
    }

    public Fisch(String art, String lebensraum, int maxAlter, boolean extinct) {
        super(art, lebensraum, maxAlter, extinct);
    }

    public Fisch() {
    }
}
