package Data;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
	private Scanner inputFile;
	private ArrayList<String> dataRaw;
	
	public DataReader() {
		dataRaw = new ArrayList<String>();
		
		openFile("Data.txt");
		readFile();
		closeFile();
	}
	

	public ArrayList<String> getDataRaw() {
		return dataRaw;
	}

	private void openFile(String fileName) {
		try {
			inputFile = new Scanner(new FileReader(fileName));
		} catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
	
	private void readFile() {
		inputFile.useDelimiter(";");
		while(inputFile.hasNext()) {
			dataRaw.add(inputFile.next());
		}
	}
	
	
	private void closeFile() {
		inputFile.close();
	}	
}
