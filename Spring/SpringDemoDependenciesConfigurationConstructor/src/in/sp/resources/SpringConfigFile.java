package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createaddrObj() {
		Address addr = new Address(111,"Ranchi",259658);
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student("Deepak",125,createaddrObj());
		return std;
	}
}
