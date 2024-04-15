package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/ApplicationContext.xml");
		Student std = (Student) context.getBean("student");
		std.display();
	}
}
