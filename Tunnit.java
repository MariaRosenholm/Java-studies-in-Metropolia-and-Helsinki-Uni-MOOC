import java.io.*;

public class Tunnit {
	public static void main(String[] args) {
		double tunnit[] = new double[31];
		int i;
		double päivät = 0;
		double summa = 0;
		double keski = 0;
		

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Ohjelma laskee yhteen haluamasi ajanjakson aikana");
			System.out.println("tehdyt työtunnit sekä keskimääräisen työpäivän pituuden. \n");
			System.out.print("Kuinka monta päivää:");
			päivät = Double.parseDouble(in.readLine())+1;

				for (i = 1; i < päivät; i++) {
					System.out.print("Anna "+i);
					System.out.print(". päivän työtunnit:");
					tunnit[i] = Double.parseDouble(in.readLine());
					summa += tunnit[i]; 
					continue;
					}

			System.out.println("           \n");
			System.out.println("Tehdyt työtunnit yhteensä: "+summa);
			
			keski = summa / (päivät-1);
			System.out.println("Keskimääräinen työpäivän pituus: "+keski);
			System.out.print("Syötetyt tunnit: ");	
				
				for (i = 1; i < päivät; i++) {		
					System.out.print(tunnit[i]+" ");
				} 
			
	} catch(Exception e) {
	  System.out.println("Ohjelmassa tapahtunut virhe!");
	  } 
	}
}