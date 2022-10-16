/**
 * 
 */
package com.kapil.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HOME PC
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/")
	public ResponseEntity<String> showMessage() {
		return ResponseEntity.ok("WELCOME TO PRODUCT SERVICE!");
	}

}
