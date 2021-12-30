package json;

public class JsonUser {

	public String name;
	public String email;
	public long phone;
	public String country;
	
	public JsonUser(String name, String email, long phone, String country) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.country = country;
	}

	@Override
	public String toString() {
		return "JsonUser [name=" + name + ", email=" + email + ", phone=" + phone + ", country=" + country + "]";
	}
	
	
}
