package main;


import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		employeeService a1 = new employeeService();
		try {
			TransformUtil.rEQUESTtRANSFORM();
			a1.a2();
			a1.a3();
			a1.a4();
//			employeeService.eMPLOYEEGETBYID("EMP10004");
//			employeeService.EMPLOYEEDELETE("EMP10001");
			a1.a5();
		} catch (Exception e) {
		}

	}

}
