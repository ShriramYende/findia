package in.findia.core.service;

import java.util.List;

import in.findia.core.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public List<User> findUser(String mobileNum);

}
