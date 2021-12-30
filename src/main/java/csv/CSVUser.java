package csv;

import com.opencsv.bean.CsvBindByName;

public class CSVUser {

	@CsvBindByName
	public String name;
	@CsvBindByName
	public String email;
	@CsvBindByName
	public long phone;
	@CsvBindByName
	public String country;
	
	public CSVUser(String name, String email, long phone, String country) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.country = country;
	}
	
	public CSVUser() {}

	@Override
	public String toString() {
		return "CSVUser [name=" + name + ", email=" + email + ", phone=" + phone + ", country=" + country + "]";
	}
	
}
