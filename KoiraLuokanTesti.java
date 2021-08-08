public class KoiraLuokanTesti
{
 public static void main(String[] args)
 {

class Koira
   {
      String rotu;
      String nimi;
      int ika;
  
      public Koira(){
         nimi = null;
         rotu = null;
         ika = 0;
      }
  
      public Koira(String uusi_nimi, String uusi_rotu, int uusi_ika){
         nimi = uusi_nimi;
         rotu = uusi_rotu;
         ika = uusi_ika;
      }
  
      public void hauku(){
         System.out.println("Hau hau!!!");
      }
  
      public void asetaNimi(String uusi_nimi){
         nimi = uusi_nimi;
      }
  
      public void asetaRotu(String uusi_rotu){
         rotu = uusi_rotu;
      }
  
      public void asetaIka(int uusi_ika){
          ika = uusi_ika;
      }
  
      public void tulostaTiedot() {
          System.out.println(nimi + ": " + ika + " vuotias " + rotu);
      }
   }

 Koira eka_koira = new Koira();

  String tokan_nimi = "Rekku";
   String tokan_rotu = "Dalmatialainen";
 int tokan_ika = 7;

  Koira toka_koira = new Koira(tokan_nimi, tokan_rotu, tokan_ika);

 System.out.println("Koirien tiedot alussa:\n");
    eka_koira.tulostaTiedot();
   toka_koira.tulostaTiedot();

 System.out.println("Eka koira sanoo: ");
   eka_koira.hauku();
 
 eka_koira.asetaNimi("Pluto");
    eka_koira.asetaRotu("Vinttikoira");
 eka_koira.asetaIka(3);

System.out.println("Nyt ekalla koiralla on nimikin:");
 eka_koira.tulostaTiedot();
 }

}


// ei toimi//