package Vorlesung10VererbungAbstract;

public abstract class Lebewesen {
    private String art, lebensraum;
    private int maxAlter;
    private boolean ausgestorben;

    public boolean isAusgestorben() {
        return ausgestorben;
    }

    public void setAusgestorben(boolean ausgestorben) {
        this.ausgestorben = ausgestorben;
    }

    public Lebewesen(String art, String lebensraum, int maxAlter, boolean extinct) {
        this(art,lebensraum,maxAlter);
        ausgestorben = extinct;
    }
    public Lebewesen(String art, String lebensraum, int maxAlter){
        this.art = art;
        this.lebensraum = lebensraum;
        this.maxAlter = maxAlter;
    }
    public Lebewesen(){
        this("","",0, false);
    }
    public void exist(){
        System.out.println(art + " ist " + (isAusgestorben()?"ausgestorben" : "nicht ausgestorben"));
    }
    public abstract void movement();

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getLebensraum() {
        return lebensraum;
    }

    public void setLebensraum(String lebensraum) {
        this.lebensraum = lebensraum;
    }

    public int getMaxAlter() {
        return maxAlter;
    }

    public void setMaxAlter(int maxAlter) {
        this.maxAlter = maxAlter;
    }
}
