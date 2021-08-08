import java.io.*;

public class Silmukka 
{
	public static void main(String[] args) 
	{ 	
		int syotetty_luku, luku;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			for(luku = 1; ; luku++ ) 
			{  

			System.out.println(luku); 
			} 	
		
		} catch(Exception e) {
		  System.out.print("Virhe syötteissä...ohjelma suljetaan.");
		}
	}
}