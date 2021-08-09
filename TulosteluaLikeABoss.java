
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int a = 0;
        while(a != maara){
            System.out.print("*");
            a++;
        } 
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        int a = 0;
        while(a != maara){
            System.out.print(" ");
            a++;
        } 
    }

    public static void tulostaKolmio(int koko) {
        int a = 1;
        int b = koko-1;
       
        while(a != (koko+1)){
            tulostaTyhjaa(b);
            tulostaTahtia(a);
            a++;
            b--;
        }
    }

    public static void jouluKuusi(int korkeus) {
        int a = 1;
        int b = 1;
        int d = korkeus-1;
       
        while(a != (korkeus+1)){
            tulostaTyhjaa(d);
            tulostaTahtia(b);
            a++;
            b = b+2;
            d--;
        }
        int c = 1;
        int jalka = korkeus;
        while(c != 3){
            tulostaTyhjaa(jalka-2);
            tulostaTahtia(3);
            c++;
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
