package in.webinar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;


/**
 * http://localhost:8080/user 
 */
@RestController
@RequestMapping("/user")
public class UserProfileService {
	
	@Autowired
	private Faker faker; // Not a part of spring family
	
	
	/**
	 * DYAMIC PLACEHOLDER
	 * PATH VARIABLE
	 * 
	 * http://localhost:8080/user/1
	 * 
	 * @return
	 */
	@GetMapping("/{id}")
	public User profileService(@PathVariable int id ) {
		
		// Not Good Practice
		// Object is created every time this method is getting called.
		// Faker faker = new Faker();
		
		
		String username = faker.name().username();
		String password = faker.crypto().md5();
		String email = faker.internet().emailAddress();
		String mobile = faker.phoneNumber().cellPhone();
		
		User user = new User(id, username, password, email, mobile);
		
		return user;
	}
	


	/**
	 * http://localhost:8080/user/ 
	 */
	@GetMapping("/")
	public String sayHi() {
		return "UserProfileService!!!";
	}
	
	
	/**
	 * http://localhost:8080/user/hello
	 * @return
	 */
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
	
}
