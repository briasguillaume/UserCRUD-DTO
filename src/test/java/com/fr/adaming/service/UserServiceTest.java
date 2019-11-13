package com.fr.adaming.service;


import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fr.adaming.entity.User;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService service;
	
	@Test
	public void createValidUser_shouldReturnUserWithIdNotNull() {
		//Préparer les input
		User u = new User();
		
		u.setNom("Nom3");
		u.setEmail("e@e.e");
		u.setPwd("wxcvbn");
		
		//Ivoquer la méthode
		
		User returnedUser = service.save(u);
		
		//Vérifier le résultat
		assertNotNull(returnedUser);
		assertNotNull(returnedUser.getId());
		
	}

}
