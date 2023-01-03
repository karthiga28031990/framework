package com.firelawn.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtilities {

	public String getProperties(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fs=new FileInputStream(AutoConstant.PropertyFilePath);
		p.load(fs);
		return p.getProperty(key);
	}
}
