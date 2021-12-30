package json;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class WriteJson {

	public static void main(String[] args) {
		
		List<JsonUser> myList = new ArrayList<>();
		JsonUser user1 = new JsonUser("Koda Ashok", "koda@gmail.com", 123654789, "India");
		JsonUser user2 = new JsonUser("Kasi", "kasi12@gmail.com", 123654789, "India");
		JsonUser user3 = new JsonUser("Anuradha", "anu@gmail.com", 123654789, "India");
		
		myList.add(user1);
		myList.add(user2);
		myList.add(user3);
		
		//System.out.println(myList);
		
		//Write JSON
		String PATH = "User.json";
		
		try {
			Writer writer = Files.newBufferedWriter(Paths.get(PATH));
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			JsonElement tree = gson.toJsonTree(myList);
			gson.toJson(tree, writer);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
