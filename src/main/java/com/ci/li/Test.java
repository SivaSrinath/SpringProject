package com.ci.li;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource =new FileSystemResource(
				 "E:\\workspace\\SrinivasSpring\\SpringProject\\src\\main\\java\\com\\nt\\context\\applicationContext.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		QuestionLis ql= factory.getBean(QuestionLis.class);
		System.out.println(ql);
		
		QuestionLis2 ql2= factory.getBean(QuestionLis2.class);
		System.out.println(ql2);
	}
}