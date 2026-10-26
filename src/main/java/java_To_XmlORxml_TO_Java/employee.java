package java_To_XmlORxml_TO_Java;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee 
{
	int id;
	String name;
	double salery;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salery=" + salery + "]";
	}
	
	
}
