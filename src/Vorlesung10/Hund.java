package Vorlesung10;

public class Hund extends Lebewesen{
    public Hund(String art, String lebensraum, int maxAlter) {
        super(art, lebensraum, maxAlter);
    }
    public Hund(){
    }

    public Hund(String art, String lebensraum, int maxAlter, boolean extinct) {
        super(art, lebensraum, maxAlter, extinct);
    }

    @Override
    public void movement(){
        System.out.println("Der Hund laeuft");
    }
}
