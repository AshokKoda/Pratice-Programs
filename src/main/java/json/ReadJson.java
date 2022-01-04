package json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

import com.google.gson.Gson;

public class ReadJson {

	public static void main(String[] args) {
		
		String PATH = "D:\\Eclipse Java Projects\\New-Workspace\\PraticePrograms\\src\\main\\resources\\User.json";

		try {
			BufferedReader br = new BufferedReader(new FileReader(PATH));
			Gson gson = new Gson();
			JsonUser[] jsonUser = gson.fromJson(br, JsonUser[].class);
			System.out.println(Arrays.asList(jsonUser));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
