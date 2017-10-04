import java.util.Scanner;
import Data.DataReader;

public class Main {
	
	public static void main(String[] args) {
		//DataReader dataReader = new DataReader();
		
		Scanner sc = new Scanner("Arda Avedis Özgül=5");
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				System.out.println(sc.nextDouble());
			} else {
				System.out.println(sc.next());
			}
		}
		sc.close();
	}
}
