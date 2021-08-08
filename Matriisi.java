import java.io.*;

public class Matriisi
{
  public static void main(String[] args)
  {
    	int matriisi[][] = new int[5][5];
    	int summa;

    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for (int x = 0; x < 5; x++){
      System.out.print ("Anna luku: ");

        for (int y = 0; y < 5; y++){
	  System.out.print ("Anna luku: ");
          matriisi[x][y] = Integer.parseInt(in.readLine());
        }
      }
  
      System.out.print("Matriisi:\n\n");
      tulosta_matriisi(matriisi);
      summa = laske_summa(matriisi);
      System.out.print("\nMatriisin alkioiden summa: " +summa);

    }catch(Exception e){
      System.out.print("Antamasi syöte oli virheellinen..." + e);
    }
  }

public static int tulosta_matriisi (int matriisi) {
			int tulosta_matriisi;
			int matriisi = matriisi;
									
			try {
				System.out.print(matriisi);

			}catch(Exception e){
      			System.out.print("Antamasi syöte oli virheellinen..." + e);
		
			return tulosta_matriisi;
			}
	}
public static int laske_summa (int matriisi) {
			int summa;
			int matriisi = matriisi;

			try {
				summa = (matriisi + matriisi);
	
			}catch(Exception e){
      			System.out.print("Antamasi syöte oli virheellinen..." + e);
		
			return summa;
			}
	}
}