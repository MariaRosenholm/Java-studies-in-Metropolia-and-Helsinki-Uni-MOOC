import java.io.*;
public class SuurinPienin1
{
  public static void main(String[] args)
  {
    int luku1, luku2, luku3, suurin, pienin;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    try {

	luku1 = 1;
	luku2 = 2;
	luku3 = 3;
	
		if ((luku1 < luku2) && (luku3 < luku2) && (luku1 < luku3)) {
			suurin = luku2; 
			pienin = luku1;
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);
		 }

		if ((luku1 < luku3) && (luku2 < luku3) && (luku2 < luku1)) {
			suurin = luku3; 
			pienin = luku2; 
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);			
		 }

		if ((luku2 < luku1) && (luku3 < luku1) && (luku2 < luku3)) {
			suurin = luku1; 
			pienin = luku2;
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);
		}

		if ((luku2 < luku1) && (luku3 < luku1) && (luku3 < luku2)) {
			suurin = luku1; 
			pienin = luku3;
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);
		}

		if ((luku1 < luku3) && (luku2 < luku3) && (luku1 < luku2)) {
			suurin = luku3; 
			pienin = luku1;
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);
		}

		if ((luku1 < luku2) && (luku3 < luku2) && (luku3 < luku1)) {
			suurin = luku2; 
			pienin = luku3;
			System.out.print("Syöttämistäsi luvuista suurin oli " +suurin+" ja pienin oli "+pienin);
		}
	}
	catch(Exception e){
      	System.out.print("Antamasi syöte on virheellinen...");
    	}
  }
}



public static int pienin(int luku1, int luku2, int luku3){
	int pienin;
	
	try {
		if ((luku1 > luku2) && (luku3 > luku2)) {
			pienin = luku2;
			return pienin;
		}
		if ((luku1 > luku3) && (luku2 > luku3)) {
			pienin = luku3;
			return pienin;
		}
		if ((luku2 > luku1) && (luku3 > luku1)) {
			pienin = luku1;
			return pienin;
		}
	}
	catch(Exception e){
		 System.out.print("Antamasi syöte on virheellinen...");
    }
  }
}
