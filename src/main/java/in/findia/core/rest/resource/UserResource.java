package in.findia.core.rest.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.findia.core.model.User;
import in.findia.core.service.UserService;

@RestController
public class UserResource {
	private static final Logger logger = LoggerFactory.getLogger(UserResource.class);

	@Autowired
	private UserService userService;

	@PostMapping(value = "/user")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		logger.info("registerUser conroller");
		userService.saveUser(user);

		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping(value = "/user")
	public ResponseEntity<List<User>> findUserByMobileNum(@RequestParam("mobileNum") String mobileNum) {
		logger.info("findUserByMobileNum conroller");
		return new ResponseEntity<>(userService.findUser(mobileNum), HttpStatus.OK);
	}

}
