package ba.unsa.etf.rpr;

public class Program {
    public static void main(String[] args) {
         MobilniBroj k= new MobilniBroj(61,"123-456");
       System.out.println( k.ispisi());
       Imenik i= new Imenik();
       FiksniBroj br= new FiksniBroj(Grad.Sarajevo, "567-345");
       i.dodaj("Neko",br);
       i.dodaj("Nekic",new FiksniBroj(Grad.Tuzla, "666-345"));
       i.dodaj("Chris", new MedunarodniBroj("+387", "61/345-356"));
       try {
           System.out.println(i.dajBroj("Nek"));
           System.out.println(i.dajIme(br));
       } catch (ElementNijePronadjen e) {
           System.out.println(e);
       }
        System.out.println(i.izGrada(Grad.Sarajevo));
       System.out.println(i.izGradaBrojevi(Grad.Tuzla));
       System.out.println(i.naSlovo('N'));
    }
}