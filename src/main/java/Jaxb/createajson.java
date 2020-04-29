package Jaxb;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class createajson {

	public void convertsxmlmarshallers() throws JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		emp emp = new emp("emp173217213", "krishna", "Uppara", 7897439532L,
				new Address("Bangaluru", "sarjapura", "562125"));
		mapper.writeValue(new File("./xml/emp.json"), emp);
		String json = mapper.writeValueAsString(emp);
		System.out.println(json);

		// emp emp1 =mapper.readValue(json,emp.class);

		emp emp1 = mapper.readValue(new File("./xml/emp.json"), emp.class);
		System.out.println(emp1.getfName());
		System.out.println(emp1.toString());
	}

	public static void main(String[] args) throws JAXBException, JsonMappingException, IOException {

		createajson aa = new createajson();

		aa.convertsxmlmarshallers();

	}

}
