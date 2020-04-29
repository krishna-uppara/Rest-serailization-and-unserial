package Jaxb;

public class Address {
	
	private String city ;
	private String location;
	private String pincode;
	
	public Address(String city, String location, String pincode) {
		super();
		this.city = city;
		this.location = location;
		this.pincode = pincode;
	}
	
	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", location=" + location + ", pincode=" + pincode + "]";
	}

}
