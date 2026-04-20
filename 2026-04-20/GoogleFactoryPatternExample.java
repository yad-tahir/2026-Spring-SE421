import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import java.io.IOException;

public class GoogleFactoryPatternExample {
	public static void main(String[] args) {

		JsonFactory jsonFactory = GsonFactory.getDefaultInstance();

		System.out.println("Using Factory Implementation: " + jsonFactory.getClass().getSimpleName());

		try {
			String jsonInput = "{\"name\": \"AUIS\", \"status\": \"Online\"}";
			var parser = jsonFactory.createJsonParser(jsonInput);

			System.out.println("Successfully used the factory to create a parser!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
