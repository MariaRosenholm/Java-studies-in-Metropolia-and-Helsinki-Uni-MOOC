
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");
        double lahja = Double.valueOf(lukija.nextLine());
        
        if(lahja < 5000){
            System.out.println("Ei veroa!");
        }
        if((lahja > 4999) && (lahja < 26000)) {
            double vero;
            vero = 100 + (lahja - 5000)*0.08;
            System.out.println("Vero: "+vero);
        }
        if((lahja > 25000) && (lahja < 56000)) {
            double vero;
            vero = 1700 + (lahja - 25000)*0.1;
            System.out.println("Vero: "+vero);
        }
        if((lahja > 55000) && (lahja < 200001)) {
            double vero;
            vero = 4700 + (lahja - 55000)*0.12;
            System.out.println("Vero: "+vero);
        }
        if((lahja > 200000) && (lahja < 1000000)) {
            double vero;
            vero = 22100 + (lahja - 200000)*0.15;
            System.out.println("Vero: "+vero);
        }
        if(lahja > 1000000) {
            double vero;
            vero = 142100 + (lahja - 1000000)*0.17;
            System.out.println("Vero: "+vero);
        }
    }
}
