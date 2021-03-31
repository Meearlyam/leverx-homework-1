package by.meearlyam.helloleverx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.mail.*;

/**
 * HelloLeverX class
 * 
 * @author Vera Shavela
 * @version 1.0.0
 */
public class HelloLeverX {

	/**
	 * This method ask your name and email and then greets you by sending message "Hello, [name]!" to your email.
	 *
	 * @param args represents the arguments given to this method when running HelloLeverX
	 */
	public static void main(String... args) {
		String name;
		String fromEmail = "shavela99@gmail.com";
		String toEmail;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			
			System.out.println("Enter your name:");
			name = reader.readLine();

			System.out.println("Enter your email to get the greeting:");
			toEmail = reader.readLine();

			if(name == null) {
				name = "Noname";
			}

			if(toEmail == null) {
				toEmail = fromEmail;
			}
		}
		catch (IOException e) {
			System.out.println(
				String.format("IOException in main(): %s", e.getMessage())
			);
		}
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.googlemail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("username", "password"));
		email.setSSLOnConnect(true);
		email.setFrom(fromEmail);
		email.setSubject("TestMail");
		email.setMsg(String.format("Hello, %s", name));
		email.addTo(toEmail);
		email.send();
		System.out.println("Hello email was successfully sent :)");
	}
}