package in.webinar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

@SpringBootApplication
public class Day1ProfileService1Application {
	
	/**
	 * Method Name Canb be Anything
	 * @Bean is Createing Object
	 * @return
	 */
	@Bean
	public Faker getFakerObject() {
		return new Faker();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Day1ProfileService1Application.class, args);
	}

}
