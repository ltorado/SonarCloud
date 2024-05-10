import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
			/*
		 * 1- object trida musi obsahovat implementaci Serializable interface
		public class User implements Serializable{}
		2- add import java.io.Serializable;
		3 - FileOutputStream fileOut = new FileOutputStream (file path)
		FileOutputStream fileOut = new FileOutputStream("Userinfo.ser"); // kam asi vytvori stram dat v java bite code
		4- ObjectOutputStream out = new ObjectOutputStream(fileOut)
		ObjectOutputStream out = new ObjectOutputStream(fileOut) // je tu ten obejkt z FileOutputStream
		5 - out.writeObject(user); // vkladam objekt
		6 - out.close();
		fileOut.close();
		 * 
		 * Trow declaration pro vyvolavani chyb misto try catch
		 */
	
		User user = new User();
		
		user.name = "Bro";
		user.password = "Password";
		FileOutputStream fileOut = new FileOutputStream("Userinfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();

	}	
}