import java.util.Scanner;

import Data.DataProcessor;
import Data.DataReader;

public class Main {
	
	public static void main(String[] args) {
		DataReader dataReader = new DataReader();
		DataProcessor dataProcessor = new DataProcessor(dataReader.getDataRaw());
	}
}
