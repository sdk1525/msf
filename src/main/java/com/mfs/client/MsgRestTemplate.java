package com.mfs.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MsgRestTemplate{

	private static HttpStatus statusCode;

	public static void main (String a[]){
		String xml = "<?xml version=\"1.0\"?><customer><age>1</age><name>Gambardella, Matthew</name><id>12</id></customer>";
		ResponseEntity<String> exchange = postData("test",xml,"http://192.168.0.14:8080/mfs/message/redirectpage");
		statusCode = exchange.getStatusCode();
		System.out.println(statusCode);
		System.out.println(exchange.getBody());
	}
	
	public static ResponseEntity<String> postData(String key, String value, String url) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("accept", "application/xml");
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> request = new HttpEntity<>(value, headers);
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, request,String.class);
		return exchange;
	}
	
}
