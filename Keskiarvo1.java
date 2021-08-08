import java.io.*;

public class Keskiarvo1 {
	public static void main(String[] args) { 
	
	double summa1, määrä1, keskiarvo;
	int arvosana, summa, määrä;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.");
		System.out.println("Lopetus negatiivisella kokonaisluvulla.");
		summa = 0;
		määrä = 0;
			
			do { 

		     System.out.print("Anna arvosana (4-10):");
			 arvosana = Integer.parseInt(in.readLine());

				switch (arvosana) {
						
				case 4: case 5: case 6: case 7: case 8: case 9:case 10:
				määrä = määrä+1; 
				summa = summa + arvosana; 	
				break;

				case -1:
				määrä1 = Double.valueOf(määrä);	
				summa1 = Double.valueOf(summa);
				keskiarvo = summa1 / määrä1;
				System.out.println("Ohjelmaan syötetty " + määrä +" arvosanaa.");
				System.out.println("Arvosanojen keskiarvo: " + keskiarvo); 
				}
		 } while (arvosana >= 0);
				
      } catch(Exception e) {
		System.out.println("Ohjelmassa tapahtunut virhe!");
		} 
	}
}