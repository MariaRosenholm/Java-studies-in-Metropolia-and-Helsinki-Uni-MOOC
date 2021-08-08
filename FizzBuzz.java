import java.io.*;

public class FizzBuzz  {
	public static void main(String[] args) {
		
		int luku,jaettunakolmella, jaettunaviidella;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.print("Valitse kokonaisluku 1-100 väliltä?");
			luku =  Integer.parseInt(in.readLine());


				if((luku > 0) && (luku < 101)) {


					if(luku%3 == 0) {
					System.out.print("Fizz"); }

					if(luku%5 == 0) {
					System.out.print("Buzz"); }

					if ((luku%3 != 0) && (luku%5 != 0)){
					System.out.print(luku);}

				}
		} catch(Exception e) {
			System.out.println("Antamasi syöte oli virheellinen...");
		} 
	}
}