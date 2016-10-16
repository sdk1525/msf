package com.mfs.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HttpHeadersV1 {

	 
	
	
	
	 
	public  static ResponseEntity<String> postData(String key, String value, String url) {
		RestTemplate restTemplate = new RestTemplate();
		//String url = "http://localhost:8080/mfs/message/redirect";
		//HttpEntity<String> request = addHeaders(key, value);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("accept", "application/xml");
		 headers.setContentType(MediaType.APPLICATION_XML);
		Map<String,String> param = new HashMap<>();
		param.put(key,value);
	//	HttpEntity<String> request = new HttpEntity<>(headers);
		HttpEntity<String> request = new HttpEntity<>(value, headers);
		
		
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, request,String.class);
		return exchange;
	}

	private static HttpEntity<String> addHeaders(String key, String value) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("accept", "application/xml");
		 headers.setContentType(MediaType.APPLICATION_XML);
		Map<String,String> param = new HashMap<>();
		param.put(key,value);
		HttpEntity<String> request = new HttpEntity<String>(headers);
		return request;
		
		//accept == "accept"
	}

 

}