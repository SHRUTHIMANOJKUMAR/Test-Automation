package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropFiles 
{
	public static String getprop(String path,String key) throws FileNotFoundException, IOException
	{
		
		Properties p = new Properties();
		p.load(new FileInputStream(path));
		String url = p.getProperty(key);
		return url;
		
	}

}

