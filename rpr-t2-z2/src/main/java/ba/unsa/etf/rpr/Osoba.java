package ba.unsa.etf.rpr;

public class Osoba {
    private
    String ime,prezime;
    public Osoba(String ime, String prezime){
        this.ime=ime; this.prezime=prezime;
    }
    public String toString(){
        return ime +  " " + prezime;
    }
}
