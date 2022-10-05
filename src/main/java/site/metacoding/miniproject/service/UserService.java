package site.metacoding.miniproject.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject.domain.user.User;
import site.metacoding.miniproject.domain.user.UserDao;

@RequiredArgsConstructor
@Service
public class UserService {
	private final UserDao userDao;

	public void 회원가입(User user) {
		userDao.insert(user);
	}
}
