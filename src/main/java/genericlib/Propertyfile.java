package genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String getData(String key) throws IOException {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoConstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
	}

	
	}
