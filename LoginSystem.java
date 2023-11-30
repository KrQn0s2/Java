import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class LoginSystem {

	public static void main(String[] args) throws InterruptedException {
		
		// Registered Accounts \\
		
		String Username1 = "user";
		String Password1 = "123";
		String Key1 = "1KSU569129LADS";
		String Username2 = "admin";
		String Password2 = "1234";
		String Key2 = "GDJK384518JA58";
		String Username3 = "user1";
		String Password3 = "12345";
		String Key3 = "HK1J5ISDA98455";
		String Username4 = "admin1";
		String Password4 = "123456";
		String Key4 = "KHGK1J5ISDA85J";
		String Username5 = "user2";
		String Password5 = "1234567";
		String Key5 = "LGJ5781JSAJFJ4";
		
		// Login System \\
		
		Scanner Username = new Scanner(System.in);
		String whatusername = JOptionPane.showInputDialog("What's Your Username?");
		Scanner Password = new Scanner(System.in);
		String whatpassword = JOptionPane.showInputDialog("What's Your Password?");
		
		if (whatusername.equals(Username1) && whatpassword.equals(Password1)) {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Correct Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Successful!");
			TimeUnit.SECONDS.sleep(1);
			JOptionPane.showMessageDialog(null, "Your Username Is: "+Username1+" | Your Password Is: "+Password1+" | Your Key Is: "+Key1);
		}
		
		else if (whatusername.equals(Username2) && whatpassword.equals(Password2)) {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Correct Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Successful!");
			TimeUnit.SECONDS.sleep(1);
			JOptionPane.showMessageDialog(null, "Your Username Is: "+Username2+" | Your Password Is: "+Password2+" | Your Key Is: "+Key2);
	}
		
		else if (whatusername.equals(Username3) && whatpassword.equals(Password3)) {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Correct Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Successful!");
			TimeUnit.SECONDS.sleep(1);
			JOptionPane.showMessageDialog(null, "Your Username Is: "+Username3+" | Your Password Is: "+Password3+" | Your Key Is: "+Key3);
			}
		
		else if (whatusername.equals(Username4) && whatpassword.equals(Password4)) {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Correct Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Successful!");
			TimeUnit.SECONDS.sleep(1);
			JOptionPane.showMessageDialog(null, "Your Username Is: "+Username4+" | Your Password Is: "+Password4+" | Your Key Is: "+Key4);
			}
		
		else if (whatusername.equals(Username5) && whatpassword.equals(Password5)) {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Correct Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Successful!");
			TimeUnit.SECONDS.sleep(1);
			JOptionPane.showMessageDialog(null, "Your Username Is: "+Username5+" | Your Password Is: "+Password5+" | Your Key Is: "+Key5);
			}
		
		else {
			System.out.println("Checking...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Incorrect Credentials!");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connecting...");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Connection Unsuccessful!");
		}
	}
}