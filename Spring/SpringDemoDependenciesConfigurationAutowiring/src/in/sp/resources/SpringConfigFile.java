package in.sp.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createaddrObj() {
		Address addr = new Address();
		addr.setHouseNo(101);
		addr.setCity("Giridih");
		addr.setPincode(815312);
		return addr;
	}
	@Bean
	public Subjects createSubObj() {
		Subjects sbj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("java");
		subjects_list.add("php");
		subjects_list.add("python");
		
		sbj.setSubjects(subjects_list);
		
		return sbj;
	
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Prakash");
		std.setRollNo(100);
//		std.setAddress(createaddrObj());
//		std.setSubjects(createSubObj());
		
		return std;
	}
}
