package in.findia.core.rest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.findia.core.service.UserService;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;

	

	@GetMapping(value="/user")
	public void registerUser() {
		
		userService.saveUser();
		
		
	}

	
}
