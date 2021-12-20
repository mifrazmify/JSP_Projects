package service;

import java.util.Objects;

public class StudentService {

	public boolean login(String username, String password) throws Exception {
		boolean isLogged = false;
		if(Objects.nonNull(username) && Objects.nonNull(password) && !username.isEmpty() && !password.isEmpty()) {
			if(username.equals("abc") && password.equals("1234")) {
				isLogged = true;
			} else {
				throw new RuntimeException("Couldn't find the user");
			}
		}
		
		return isLogged;
	}
}
