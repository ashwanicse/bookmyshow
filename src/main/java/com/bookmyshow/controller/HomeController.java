package com.bookmyshow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<String> home() {
		log.info("BookMyShow is up.");
		return new ResponseEntity<>("BookMyShow is up.", HttpStatusCode.valueOf(HttpStatus.OK.value()));
	}

}
