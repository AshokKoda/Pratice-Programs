package csv;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class WriteCSV {

	public static void main(String[] args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, IOException {
		
		String PATH = "D:\\Eclipse Java Projects\\New-Workspace\\PraticePrograms\\src\\main\\resources\\CSVFile.csv";
		
		//Create new file and existing file
		File file = new File(PATH);
		if(file.createNewFile()) {
			System.out.println("New file is created");
		}else {
			System.out.println("File is exists!");
		}
		
		//Write data
		try {
			Writer writer = Files.newBufferedWriter(Paths.get(PATH));
			StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder<CSVUser>(writer).withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).build();
			List<CSVUser> myList = new ArrayList<>();
			myList.add(new CSVUser("Koda Ashok", "akoda@gmail.com", 1234567890, "Indian"));
			myList.add(new CSVUser("John Sasi", "john@gmail.com", 321456745, "Indian"));
			myList.add(new CSVUser("Kumar", "kumar@gmail.com", 123654852, "Indian"));
			beanToCsv.write(myList);
			
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
