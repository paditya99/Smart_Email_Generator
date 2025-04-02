package com.springAI.email_writer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springAI.email_writer.model.EmailRequest;

@RestController
@RequestMapping("/api/email")
public class EmailController {
	public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
		return ResponseEntity.ok("");
	}
}
