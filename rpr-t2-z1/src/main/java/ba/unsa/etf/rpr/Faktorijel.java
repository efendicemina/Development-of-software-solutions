package ba.unsa.etf.rpr;
public class Faktorijel {
    public static Integer fact(Integer n){
        Integer rez=1;
        for(int i=1;i<=n;i++){
            rez=rez*i;
        }
        return rez;
    }
}
