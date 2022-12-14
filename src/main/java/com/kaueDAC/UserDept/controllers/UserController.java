package com.kaueDAC.UserDept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaueDAC.UserDept.entities.User;
import com.kaueDAC.UserDept.repositories.UserRepository;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/")
	public String home() { return "Bem vindo, acesse a rota '/users' para ver os usuários";}
	
	@GetMapping("/users")
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	
	@PostMapping(value = "/{id}")
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
}
