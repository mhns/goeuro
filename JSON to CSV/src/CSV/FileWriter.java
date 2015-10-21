package CSV;

import java.util.LinkedList;

public class FileWriter {
	
	String filename;
	
	/**
	 * writes a specified String to the file
	 * @param str The String
	 */
	void writeString(String str){
		
	}
	
	void writeEntry(CSVEntry entr){
		writeString(entr.getCity());
		writeString(entr.getType());
		writeString(entr.getLat());
		writeString(entr.getLon());
		entr.print();
	}
	
	private void toFile(LinkedList <CSVEntry>entries){
		
		for(CSVEntry entr : entries){
			writeEntry(entr);
		}
		
		System.out.println("CSVFile created");
	}
}
