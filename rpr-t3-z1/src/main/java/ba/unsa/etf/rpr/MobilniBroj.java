package ba.unsa.etf.rpr;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilni;
    private String broj;
    MobilniBroj(int mobilnaMreza, String broj){
      this.mobilni=mobilnaMreza;
      this.broj=broj;
    }
    @Override
    public String ispisi() {
        return 0+mobilni+"/"+broj;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobilni);
    }
}
