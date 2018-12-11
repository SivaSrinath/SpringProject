package com.cons.map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new FileSystemResource(
				"E:\\workspace\\SrinivasSpring\\SpringProject\\src\\main\\java\\com\\nt\\context\\applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Question que= factory.getBean(Question.class);
		System.out.println(que);
		
		Question2 que2= factory.getBean(Question2.class);
		System.out.println(que2);

	}

}
