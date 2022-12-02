package Vorlesung9;

public class Beleg {
    public int getOid() {
        return oid;
    }

    private int oid;
    private static int lastOid = 10000;

    public Beleg(){
        this.oid = lastOid++;
    }
}
