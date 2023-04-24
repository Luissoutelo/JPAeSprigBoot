package com.educandoweb.course.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
public ResponseEntity<User> findAll(){
	User u=new User(1L, "Maria","maria@gmail.com","9999999" ,"password");
	return ResponseEntity.ok().body(u);
}
}
