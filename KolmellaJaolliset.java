
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Alkaen: ");
        int alkaen = Integer.valueOf(lukija.nextLine());
        System.out.println("Asti: ");
        int asti = Integer.valueOf(lukija.nextLine());
        kolmellaJaollisetValilta(alkaen, asti);
        
    }
    public static void kolmellaJaollisetValilta(int alku, int loppu){
        int d1 = 0;
        while(alku <= loppu){
            while(d1 == (alku%3)){
                System.out.println(alku);
                break;
            }
            alku++;
        }
    }
}
