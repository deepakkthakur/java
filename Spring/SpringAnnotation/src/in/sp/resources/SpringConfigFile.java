package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
//	@Bean
//	public Student stdId1() {
	@Bean("stdObj1")
	public Student createstdIdObj1() {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setName("Deepak");
		std.setRollNo(101);
		std.setEmail("Deepak@gmail.com");
		
		return std;
	}
	@Bean("stdObj2")
	public Student createstdIdObj2() {
		// TODO Auto-generated method stub
		Student std = new Student();
		std.setName("Rahul");
		std.setRollNo(102);
		std.setEmail("@gmail.com");
		
		return std;
	}
	
}
