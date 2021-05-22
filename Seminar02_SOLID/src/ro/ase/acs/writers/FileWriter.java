package ro.ase.acs.writers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import ro.ase.acs.contracts.Writeable;

public class FileWriter implements Writeable {

	@Override
	public void print(String message) {
		OutputStreamWriter osWriter = null;
		try {
			FileOutputStream fileOutputStream = 
					new FileOutputStream("output.txt");
			 osWriter = new OutputStreamWriter(fileOutputStream);
			osWriter.write(message);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(osWriter != null) {
				try {
					osWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
