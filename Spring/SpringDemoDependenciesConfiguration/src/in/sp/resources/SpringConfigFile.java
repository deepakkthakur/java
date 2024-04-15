package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

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
	public Student createStdObj() {
		Student std = new Student();
		std.setName("Prakash");
		std.setRollNo(100);
		std.setAddress(createaddrObj());
		return std;
	}
}
