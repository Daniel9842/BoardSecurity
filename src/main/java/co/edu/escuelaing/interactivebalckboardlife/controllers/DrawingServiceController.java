/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.interactivebalckboardlife.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.escuelaing.interactivebalckboardlife.cacheMemory.cacheUser;

@RestController
public class DrawingServiceController {

	private cacheUser cache = cacheUser.getInstance();
	
	@GetMapping("/status")
	public String status() {
		return "{\"status\":\"Greetings from Spring Boot. " + java.time.LocalDate.now() + ", "
				+ java.time.LocalTime.now() + ". " + "The server is Runnig!\"}";
	}
	
	@GetMapping("/login")
	public String login(@RequestParam String user,@RequestParam String password ) {
		cache.setUsers(user, password);
		return "";
	}
	
}