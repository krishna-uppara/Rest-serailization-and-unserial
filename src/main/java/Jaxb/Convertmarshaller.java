package Jaxb;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Convertmarshaller {

	public void convertsxmlmarshallers() throws JAXBException {

		Employee empl = new Employee("emp173217213", "krishna", "Uppara", 7897439532L,new Address("Bangaluru","sarjapura","562125"));
		JAXBContext jc = JAXBContext.newInstance(Employee.class);
		Marshaller ms = jc.createMarshaller();
		ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		ms.marshal(empl, System.out); 
		// StringWriter ss = new StringWriter();
		// ms.marshal(empl,ss);
		// String h= ss.toString();
		// System.out.println(h);
		//
		ms.marshal(empl, new File("E:/RestAssuredLearning/Restlearning/xml/emp.xml"));

	}

	public void convertsxmlUnMarshallers() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(Employee.class);
		Unmarshaller unms = jc.createUnmarshaller();
		Employee emp = (Employee) unms.unmarshal(new              File("E:/RestAssuredLearning/Restlearning/xml/emp.xml"));

		System.out.println(emp.getempId() + emp.getfName() + emp.getlName() + emp.getPhoneNumber() + emp.getAddress());
	}

	public static void main(String[] args) throws JAXBException {

		Convertmarshaller cm = new Convertmarshaller();
		cm.convertsxmlmarshallers();
		cm.convertsxmlUnMarshallers();

	}

}
