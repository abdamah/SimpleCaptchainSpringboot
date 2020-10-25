package com.riigsoft.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riigsoft.model.User;
import com.riigsoft.repo.IUserRepository;
import com.riigsoft.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository repo;

	@Override
	public void createUser(User u) {
		repo.save(u);
	}

	@Override
	public List<User> getAllUsers() {

		return repo.findAll();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		return repo.findById(id);
	}

	@Override
	public void updateUser(User u) {
		repo.save(u);

	}

	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
}
