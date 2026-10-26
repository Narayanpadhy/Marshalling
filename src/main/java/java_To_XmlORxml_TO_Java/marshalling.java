package java_To_XmlORxml_TO_Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class marshalling 
{
	public static void main(String[] args) throws JAXBException, FileNotFoundException
	{
		employee emp=new employee();
		emp.setId(1);
		emp.setName("Narayan");
		emp.setSalery(50000);
		
		//java to xml convert
		
		JAXBContext context = JAXBContext.newInstance(employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(emp, new FileOutputStream("emp.xml"));
		System.out.println("marshalling");
		
		//xml to java convert
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		employee e=(employee)unmarshaller.unmarshal(new File("emp.xml"));
		System.out.println("unmarshalling");
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salery);
		
	}
	
}