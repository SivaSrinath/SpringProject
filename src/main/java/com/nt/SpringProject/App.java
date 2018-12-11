package com.nt.SpringProject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Resource resource = new FileSystemResource(
				"E:\\workspace\\SrinivasSpring\\SpringProject\\src\\main\\java\\com\\nt\\context\\applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// Student student=(Student)factory.getBean("st");
		// student.displayInfo();

		College college = (College) factory.getBean("col");
		college.displayInfo();
		
		Address add= factory.getBean("addre",Address.class);
		System.out.println(add);
		
		Employee emp=factory.getBean("Emp",Employee.class);
		System.out.println(emp);
		
	}
}
