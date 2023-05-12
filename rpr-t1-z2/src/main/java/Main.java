package ba.unsa.etf.rpr
import java.util.Scanner;
public class Main {
    static int  SumaCifara(int n){
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("Brojevi djeljivi sa sumom svojih cifara: ");
        for(int i=1; i<=n; i++){
            if(i%SumaCifara(i)==0) System.out.println(i);
        }
    }
}