package Jaxb;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//@XmlTransient
@XmlRootElement(name = "Employee")
//@XmlType(propOrder = { "fName", "lName", "empId", "phoneNumber", "address" })
//@XmlAccessorOrder // ascending order
//@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable{

	@XmlAttribute(name = "id")
	private String empid;
	private String fName;
	private String lName;
	private long phoneNumber;
	Address address;



	public Employee(String empid, String fName, String lName, long phoneNumber, Address address) {
		super();
		this.empid = empid;
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Employee() {
		super();
	}

	@XmlElement
	public String getempId() {
		return empid;
	}

	public void setempId(String empid) {
		this.empid = empid;
	}

	
	@XmlElement
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	@XmlElement

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@XmlElement

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@XmlElement
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

}
