package ba.unsa.etf.rpr;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Main {
    static boolean broj(String s){
        for (int i = 0; i < s.length(); ++i)
            if (!Character.isDigit(s.charAt(i)))
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> lista=new ArrayList<>();
        System.out.println("Unesite brojeve: ");
        boolean flag=true;
        while(flag){
            String pom=scanner.nextLine();
            if(pom.equals("stop")) flag=false;
            if(broj(pom)){
                lista.add(Integer.valueOf(pom));
            }
            else if(flag){
                System.out.println("Niste unijeli broj ni stop, ponovite unos: ");
            }
        }
        System.out.println("Min i max su: "+ Collections.min(lista)+ " "+Collections.max(lista));
        double suma=0;
        for(Integer i: lista) suma+=i;
        double srednja=suma/lista.size();
        System.out.println("Srednja vrijednost je: "+ srednja);
        suma = 0D;
        for (Integer x : lista)suma += Math.pow(x - srednja,2);
        suma /= lista.size() - 1;
        System.out.println("Standardna devijacija je: " + Math.sqrt(suma));
    }
}