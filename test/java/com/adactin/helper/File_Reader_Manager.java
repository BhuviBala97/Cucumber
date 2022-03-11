package com.adactin.helper;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		
	}

	public static File_Reader_Manager getinstance() {
		File_Reader_Manager fir = new File_Reader_Manager();
		return fir;

	}

	public Configuration_Reader getinstanceCR() throws IOException {
		Configuration_Reader cir = new Configuration_Reader();
		return cir;
	}

}
