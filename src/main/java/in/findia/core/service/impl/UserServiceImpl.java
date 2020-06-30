package in.findia.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.findia.core.domain.UserEntity;
import in.findia.core.model.User;
import in.findia.core.repository.UserRepository;
import in.findia.core.rest.resource.UserResource;
import in.findia.core.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private static final Logger logger = LoggerFactory.getLogger(UserResource.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		logger.info("inside saveUser");
		UserEntity userEntity = new UserEntity();

		userEntity.setUserName(user.getUserName());
		userEntity.setAge(user.getAge());
		userEntity.setCity(user.getCity());
		userEntity.setMobileNum(user.getMobileNum());
		userEntity.setState(user.getState());

		userRepository.save(userEntity);

	}

	@Override
	public List<User> findUser(String mobileNum) {
		logger.info("inside findUser");

		List<UserEntity> userList = userRepository.findByMobileNum(mobileNum);
		List<User> userListRes = new ArrayList<>();
		for (UserEntity userEntity : userList) {
			User user = new User();

			user.setUserName(userEntity.getUserName());
			user.setAge(userEntity.getAge());
			user.setCity(userEntity.getCity());
			user.setMobileNum(userEntity.getMobileNum());
			user.setState(userEntity.getState());
			userListRes.add(user);
		}
		return userListRes;
	}

}
