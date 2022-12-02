package Vorlesung9;

public class Person {
    private int alter;
    private int groesse;

    public Person(int alter, int groesse, String name, String wohnOrt) {
        this.alter = alter;
        this.groesse = groesse;
        this.name = name;
        this.wohnOrt = wohnOrt;
    }
    public Person(){
        this(18,180,"Max Mustermann", "Musterstraße");
    }

    private String name;
    static String heimatPlanet = "Erde";

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWohnOrt() {
        return wohnOrt;
    }

    public void setWohnOrt(String wohnOrt) {
        this.wohnOrt = wohnOrt;
    }

    private String wohnOrt;

    @Override
    public String toString() {
        return "Person{" +
                "alter=" + alter +
                ", groesse=" + groesse + '\'' +
                ", name='" + name + '\'' +
                ", wohnOrt='" + wohnOrt + '\'' +
                ", heimatplanet='" + heimatPlanet + '\'' +
                '}';
    }
}
