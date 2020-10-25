package com.riigsoft.service;

import java.util.List;
import java.util.Optional;

import com.riigsoft.model.User;

public interface IUserService {

	void createUser(User u);
	void updateUser(User u);
	void deleteUser(Integer id);
	List<User>getAllUsers();
	Optional<User> getOneUser(Integer id);
}
