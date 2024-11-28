package com.gym.One.Controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.One.Entity.Flag;
import com.gym.One.Services.FlagService;


@RestController
@RequestMapping("/api/v1")
public class FlagController {
	
	@Autowired
	private FlagService FlagService;

	@GetMapping(value="/flag/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){ 
		try {
			Flag data  = FlagService.findById(id);
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		} 
		catch (Exception e) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", e.getMessage());
			return new ResponseEntity<>( map, HttpStatus.INTERNAL_SERVER_ERROR);
		} 
 	}
	
}
