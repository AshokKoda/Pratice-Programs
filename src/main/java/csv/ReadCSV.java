package csv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.google.gson.Gson;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		
		String PATH = "CSVFile.csv";
		
		Reader reader = Files.newBufferedReader(Paths.get(PATH));
		CsvToBean<CSVUser> csvToBean = new CsvToBeanBuilder<CSVUser>(reader).withType(CSVUser.class).withIgnoreLeadingWhiteSpace(true).build();
		List<CSVUser> csvUsers = csvToBean.parse();
		System.out.println("CSV Format:");
		System.out.println(csvUsers);
		
		//Display CSV data to Json data
		Gson gson = new Gson();
		String jsonUsers = gson.toJson(csvUsers);
		System.out.println("Json Format:");
		System.out.println(jsonUsers);
		
		//Write json
		String JSONPATH = "JsonFile.json";
		FileWriter writer = new FileWriter(JSONPATH);
		writer.write(jsonUsers);
		writer.close();

	}

}
