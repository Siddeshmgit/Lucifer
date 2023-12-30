//Write a program to read data from property file.
package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	//In order to read the data from the external file we need to create an object of FileInputStream.
	//Which will convert high level language into binary language.
	//We need to pass relative path of the file as a parameter in order to execute in multiple systems.
	Properties p=new Properties();
	//In order to read the data from property file we need to create Properties object.
	//With the help of reference we can use non-static methods.
	p.load(fis);
	//To load binary data to the object we use load().
	String url = p.getProperty("url");
	//To read the data from object we use getProperty() which takes string key as parameter 
	//and returns String.
	//If the key is invalid it will return null.
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	
}
}
