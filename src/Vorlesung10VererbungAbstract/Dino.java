package Vorlesung10VererbungAbstract;

public class Dino extends Lebewesen{
    @Override
    public void movement() {
        System.out.println("Der Dinosaurier rennt");
    }

    public Dino(String art, String lebensraum, int maxAlter, boolean extinct) {
        super(art, lebensraum, maxAlter, extinct);
    }

    public Dino(String art, String lebensraum, int maxAlter) {
        super(art, lebensraum, maxAlter);
    }

    public Dino() {
    }
}
