package ba.unsa.etf.rpr;

public class Racun {
    protected Long broj_racuna;
    protected Osoba korisnik;
    protected boolean odobrenje;
    protected double stanje;
    public Racun(Long broj_racuna,Korisnik k ){
        this.broj_racuna=broj_racuna; korisnik=k;
        stanje=0;
    }
    private boolean provjeriOdobrenjePrekoracenje(double broj){
        return odobrenje;
    }
    public boolean izvrsiUplatu(double x){
        if(Double.compare(x,0)>=0) {
            stanje+=x;
            return true;
        }
        return false;
    }
    public boolean izvrsiIsplatu(double x){
        if(Double.compare(stanje,x)<0 && !odobrenje) return false;
        stanje-=x;
        return true;
    }
    void odobriPrekoracenje(double x){
        odobrenje=true;
    }
}
