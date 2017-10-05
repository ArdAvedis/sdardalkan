package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class DataProcessor {
	private ArrayList<String> dataRaw;
	
	public DataProcessor(ArrayList<String> dataRaw) {
		this.dataRaw = dataRaw;
	}
	
	public int getTruckSize() {
		Scanner sc = new Scanner(dataRaw.get(0));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				sc.close();
				return sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		return 0;
	}
	
	
	
}
