package Data;

import java.util.ArrayList;
import java.util.Scanner;

public class DataProcessor {
	private ArrayList<String> dataRaw;
	private int truckSize;
	
	public DataProcessor(ArrayList<String> dataRaw) {
		this.dataRaw = dataRaw;
	}
	
	public int getTruckSize() {
		int tSize = 0;
		Scanner sc = new Scanner(dataRaw.get(0));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextInt()) {
				tSize = sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		return tSize;
	}
	
	public int getNumberOfOrders() {
		int noOfOrders = 0;
		Scanner sc = new Scanner(dataRaw.get(1));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextInt()) {
				noOfOrders = sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		return noOfOrders;
	}
	
	public int getNumberOfNodes() {
		int noOfNodes = 0;
		Scanner sc = new Scanner(dataRaw.get(2));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextInt()) {
				noOfNodes = sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		return noOfNodes;
	}
	
	public int getNumberOfRoutes() {
		int noOfRoutes = 0;
		Scanner sc = new Scanner(dataRaw.get(3));
		sc.useDelimiter("=");
		while(sc.hasNext()) {
			if (sc.hasNextInt()) {
				noOfRoutes = sc.nextInt();
			} else 
				sc.next();
		}
		sc.close();
		return noOfRoutes;
	}
	
	public double[] getOrderSize() {
		double[] orderSize = new double[getNumberOfOrders()];
		String oSString = dataRaw.get(4);
		String[] splitOS = oSString.split("=");
		Scanner sc = new Scanner(splitOS[1]);
		sc.useDelimiter(",");
		int i=0;
		while(sc.hasNext()) {
			orderSize[i] = sc.nextDouble();
			i++;
		}
		return orderSize;
	}
	
}
