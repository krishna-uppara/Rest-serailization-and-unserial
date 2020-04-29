package Jaxb;

public class emp {
	

	private String fName;
	private String lName;
	private long phoneNumber;
	Address address;

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public emp(String empid, String fName, String lName, long phoneNumber,Address address) {
		super();
		this.empid = empid;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public emp() {
		super();
	}
	private String empid;
	@Override
	public String toString() {
		return "emp [empid=" + empid + ", fName=" + fName + ", lName=" + lName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}

}
