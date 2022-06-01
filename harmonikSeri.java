import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args){

        // Harmanik seri toplamı hesaplama

        int n;
        double top = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("N sayisini giriniz : ");
        n = inp.nextInt();
        for (int i = 1; i <=n; i++){
            top += (1.0 / i);
        }
        System.out.print("n=" + n + " degeri icin Harmonik Seri toplami : " + top);
    }
}
