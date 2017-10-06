package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class DataProcessor {
	private ArrayList<String> dataRaw;
	
	public DataProcessor(ArrayList<String> dataRaw) {
		this.dataRaw = dataRaw;
	}
	
	public int getTruckSize() {
		int truckSize = 0;
		Scanner sc = new Scanner(dataRaw.get(0));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextDouble()) {
				truckSize = sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		System.out.println("Arda");
		return truckSize;
	}
	
	
	
}
