package in.tecmentor.controller;

import java.util.Calendar;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.tecmentor.jpa.model.Employee;
import in.tecmentor.jpa.model.Gender;
import in.tecmentor.jpa.model.User;
import in.tecmentor.jpa.model.UserProfile;
import in.tecmentor.jpa.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping(value = "/save-user")
	public void saveUser(@RequestBody User user) {

		/*user = new User("Rajeev", "Singh", "rajeev@callicoder.com", "MY_SUPER_SECRET_PASSWORD");

		Calendar dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(1992, 7, 21);

		UserProfile userProfile = new UserProfile("+91-8197882053", Gender.MALE, dateOfBirth.getTime(), "747",
				"2nd Cross", "Golf View Road, Kodihalli", "Bangalore", "Karnataka", "India", "560008");

		user.setUserProfile(userProfile);

		userProfile.setUser(user);*/
		user.getUserProfile().setUser(user);

		userRepository.save(user);
	}
	
	@GetMapping(value="/get-user/{id}")
	public UserModel getUser(@PathVariable("id") Long userId) {
		Optional<User> a= userRepository.findById(userId);
		User user= a.get();
		
		UserModel target=new UserModel();
		UserProfileModel userProfileModel= new UserProfileModel();
		BeanUtils.copyProperties(user, target);
		BeanUtils.copyProperties(user.getUserProfile(), userProfileModel);
		target.setUserProfile(userProfileModel);
		Employee employee=new Employee(1L, "rupendra");
		return target;
		
		
		
	}

}
