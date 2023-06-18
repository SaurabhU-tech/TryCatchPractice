package tcPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//File not found exception (Checked Exception)
		FileInputStream fis = new FileInputStream("C:\\Users\\asus\\Desktop\\Case Movement.xlsx");
		//Class not found exception (Checked Exception)
		Class.forName("com.mysql.jdbc.Driver");
	}

}
