package by.meearlyam.helloleverx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.text.*;

/**
 * HelloLeverX class
 * 
 * @author Vera Shavela
 * @version 2.0.0
 */
public class HelloLeverX {

	/**
	 * This method ask your name and surname and then greets LeverX on your behalf
	 *
	 * @param args represents the arguments given to this method when running HelloLeverX
	 */
	public static void main(String... args) {
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			String name;
			String surname;
			
			System.out.println("Enter your name:");
			name = reader.readLine();

			System.out.println("Enter your surname:");
			surname = reader.readLine();

			if(name == null) {
				name = "Noname";
			}

			if(surname == null) {
				surname = "Nosurname";
			}

			Map<String, String> valuesMap = new HashMap<>();
			valuesMap.put("name", name);
			valuesMap.put("surname", surname);
			
			String templateString = "Hello, LeverX, from ${name} ${surname}!";

			StringSubstitutor sub = new StringSubstitutor(valuesMap);

			String resolvedString = sub.replace(templateString);

			System.out.println(resolvedString);
		}
		catch (IOException e) {
			System.out.println(
				String.format("IOException in main(): %s", e.getMessage())
			);
		}

	}
}