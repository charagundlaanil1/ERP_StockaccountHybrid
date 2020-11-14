package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFilUtils {
public static String getvalueofkey(String key) throws Throwable, Throwable{
	Properties configPropeties= new Properties();
    configPropeties.load(new FileInputStream("C:\\Users\\Amar Ch\\Desktop\\ankesh\\ERP_StockAccounting\\Propertyfile\\Environment.properties"));
    return configPropeties.getProperty(key);

}
}
