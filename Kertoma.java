public class Kertoma {
	public static void main(String[] args) { 

		int syotetty_luku, luku;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Anna kokonaisluku:");      
			syotetty_luku = Integer.parseInt(in.readLine()); 
		
			for(luku = 1; luku*luku; luku++)
			{
			System.out.println(luku);
			break;
			}
       }	 catch(Exception e) {
			System.out.print("Antamasi syöte oli virheellinen...");
		}    
	}
}	