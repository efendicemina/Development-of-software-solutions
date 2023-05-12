package ba.unsa.etf.rpr;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj{
    private Grad grad;
    private String broj;
    public FiksniBroj(Grad grad, String broj){
      this.grad=grad; this.broj=broj;
    }
    @Override
    public String ispisi() {
        return(grad+"/"+broj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grad,broj);
    }
}
