package ba.unsa.etf.rpr;

public enum Grad {
    Sarajevo("033"), Zenica("032"),Tuzla("035");
    private String pozivni;
    Grad (String broj){
        pozivni=broj;
    }
    @Override
    public String toString() {
        return pozivni;
    }
}
