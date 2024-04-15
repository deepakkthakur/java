package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.sp.beans") 
@ComponentScan({"in.sp.beans"}) //second method
@ComponentScan(basePackages = "in.sp.beans") // third method
public class SpringConfigFile {

}
