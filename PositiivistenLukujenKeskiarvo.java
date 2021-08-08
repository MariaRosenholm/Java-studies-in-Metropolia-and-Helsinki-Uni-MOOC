
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku =0;
        double keskiarvo = 0;
        double maara = 0;
        
        while(true){
            System.out.println("Syötä luku");
            luku = Integer.valueOf(lukija.nextLine());
            
            if(luku == 0){
                if(maara == 0){
                    System.out.println("keskiarvon laskeminen ei ole mahdollista");
                }else{
                    System.out.println("Lukujen keskiarvo " + (keskiarvo/maara)); 
                }
                break;
            } else if (luku > 0){
                maara++;
                keskiarvo = keskiarvo + (luku);
                continue;
            }
        }
    }
}
