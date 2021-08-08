
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Ensimmäinen: ");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int toka = Integer.valueOf(lukija.nextLine());
        int vastaus = eka;
        int b = eka+1;
        
        for(int a = b; a <= toka; a++){

            vastaus = vastaus + a;
        }
        System.out.println("Summa on "+vastaus);
    }
}
