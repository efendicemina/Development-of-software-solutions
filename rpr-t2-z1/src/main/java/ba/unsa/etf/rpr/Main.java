package ba.unsa.etf.rpr;
import static ba.unsa.etf.rpr.Faktorijel.fact;
public class Main {
    public static void main(String[] args) {
        if(args[0].equals("fact")){
          Integer x=fact(Integer.valueOf(args[1]));
          System.out.println(x);
        }
        if(args[0].equals("sin")){
         System.out.println(Math.sin(Double.parseDouble(args[1])));
        }
    }

}