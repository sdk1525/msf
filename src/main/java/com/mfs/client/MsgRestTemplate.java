package com.mfs.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MsgRestTemplate {

	
	private static HttpStatus statusCode;

	public static void main (String a[]){
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/mfs/message/redirect";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		Map<String,String> param = new HashMap<>();
		param.put("test","data");
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
		statusCode = exchange.getStatusCode();
		System.out.println(statusCode);
		System.out.println(exchange.getBody());
	}
	
}
