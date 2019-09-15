package in.findia.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.findia.core.domain.User;
import in.findia.core.repository.UserRepository;
import in.findia.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser() {
		User user = new User();
		//user.setId(10L);
		user.setName("Ram");
		userRepository.save(user);
		
	}

}
