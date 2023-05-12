import ba.unsa.etf.rpr.ElementNijePronadjen;
import ba.unsa.etf.rpr.FiksniBroj;
import ba.unsa.etf.rpr.Grad;
import ba.unsa.etf.rpr.Imenik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ImenikTest {
    @Test
    void Test1() throws ElementNijePronadjen {
       Imenik i=new Imenik();
       i.dodaj("Chris Grant",new FiksniBroj(Grad.Zenica,"123-456"));
       assertEquals(i.dajBroj("Chris Grant"), "032/123-456");
    }
    @Test
    void Test2() {
        Imenik i=new Imenik();
        i.dodaj("Chris Grant",new FiksniBroj(Grad.Zenica,"123-456"));
        assertThrows(ElementNijePronadjen.class,()-> i.dajBroj("Chris"));
    }
    @Test
    void Test3() throws ElementNijePronadjen {
        Imenik i=new Imenik();
        FiksniBroj f=new FiksniBroj(Grad.Sarajevo,"123-986");
        i.dodaj("Chris Grant",new FiksniBroj(Grad.Zenica,"123-456"));
        i.dodaj("Chris New",f);
        assertEquals(i.dajIme(f),"Chris New");
    }
}
