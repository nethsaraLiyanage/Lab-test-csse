package common;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.Properties;


public class CommonUtil {

	public static final Properties p = new Properties();

	static {
		try {
			p.load(QueryUtil.class.getResourceAsStream("../config/config.properties"));
		} catch (Exception e) {
			
		}
	}
}
