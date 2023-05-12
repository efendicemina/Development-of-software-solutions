package ba.unsa.etf.rpr;

import java.util.List;

public class Banka {
    private Long broj_racuna;
    protected List<Korisnik> korisnici;
    protected List<Uposlenik>uposlenici;
    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String i,String p){
        Korisnik k=new Korisnik(i,p);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String i,String p){
        Uposlenik k=new Uposlenik(i,p);
        uposlenici.add(k);
        return k;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
       Racun r=new Racun(broj_racuna,k);
       return r;
    }
}
