package Data;

import java.io.*;
import java.util.ArrayList;

public class DataReader {
	private BufferedReader inputFile;
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
			inputFile = new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e) {
			System.out.println();
		}
	}
	
	private void readFile() {
		String line;
		try {
			while((line = inputFile.readLine()) != null) {
				dataRaw.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void closeFile() {
		try {
			inputFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
