package Data;

import java.io.*;
import java.util.ArrayList;

public class DataReader {
	private BufferedReader inputFile;
	private ArrayList<String> dataRaw;
	

	public void openFile(String fileName) {
		try {
			inputFile = new BufferedReader(new FileReader(fileName));
		} catch(FileNotFoundException e) {
			System.out.println();
		}
	}
	
	public void readFile() {
		String line;
		try {
			while((line = inputFile.readLine()) != null) {
				dataRaw.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void closeFile() {
		try {
			inputFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
