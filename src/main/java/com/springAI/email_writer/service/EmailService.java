package com.springAI.email_writer.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.springAI.email_writer.model.EmailRequest;

@Service
public class EmailService {
	public String generateEmailReply(EmailRequest emailRequest) {
		
		//Build the prompt
		String prompt = buildPrompt(emailRequest);
		
		//Prepare body
		Map<String, Object> reqBody = Map.of(
				"contents", new Object[] {
						"parts", new Object[] {
								"text", prompt
						}
				});
		
		//do request and response
		
		
		//return response
		return null;
	}

	public String buildPrompt(EmailRequest emailRequest) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("Generate a professional email reply for the following email content. Please don't genarate subject line. ");
		if(emailRequest.getTone() != null && !emailRequest.getEmailContent().isEmpty()) {
			sb.append("Use a ").append(emailRequest.getTone()).append(" tone.");
			sb.append("\nOriginal email is: \n").append(emailRequest.getEmailContent());
		}
		return sb.toString();
	}
}
