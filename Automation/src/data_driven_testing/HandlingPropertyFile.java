package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
//In order to read the data from external file we need to create an object of FileInputStream
//which will convert the data from human understandable lang to binary lang
//We need to pass rel path of the file as a parameter in order to execute it in multiple systems
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to read data from property file we need to create an object of Properties class,
//since we need to use non static methods of properties class
	Properties pobj=new Properties();
//After creating the obj we should load the binary data to the object using load()of Properties cls
	pobj.load(fis);
//To read the data from obj we use getProperty() which takes String key has parameter and returns
//the value associated with the key in the form of String
//If the key is invalid it will return null has value
	String url = pobj.getProperty("url");
	String un = pobj.getProperty("username");
	String pwd = pobj.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
