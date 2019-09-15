package in.findia.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@PropertySource("classpath:/application.properties")
@SpringBootApplication
public class FicoreApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(FicoreApplication.class, args);
		System.out.println("Hi SUMIT RAM");
	}

}
