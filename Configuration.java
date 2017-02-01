package brickv2;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.file.FileSystems;

public class Configuration {
	
	InputStream stream_conf;
		
	public Configuration() throws IOException{

		File def_conf = new File(Configuration.class.getResource("Configuration.cfg").toString());
		File conf = new File(FileSystems.getDefault().getPath(System.getProperty("user.home"), ".armoroid").toString());
		
		try {
			stream_conf = new FileInputStream(def_conf);
		} catch (FileNotFoundException e) {
			System.out.println("Configuration par defaut pas trouve");
			e.printStackTrace();
		}
		
		
		Properties properties = new Properties();
		properties.load(stream_conf);		
		
		
		try {
			stream_conf = new FileInputStream(conf);
		} catch (FileNotFoundException e) {
			System.out.println("Configuration .armoroid pas trouve");
			e.printStackTrace();
		}
		properties.load(stream_conf);
	}
	
}
