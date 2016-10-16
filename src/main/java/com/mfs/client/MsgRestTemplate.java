package com.mfs.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MsgRestTemplate{

	
	private static HttpStatus statusCode;
	
	
	 

	public static void main (String a[]){
		Jaxb2RootElementHttpMessageConverter messageConverters = new Jaxb2RootElementHttpMessageConverter();
		RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
		List list = new ArrayList<>();
		list.add(messageConverters);
		adapter.setMessageConverters(list);
		String xml = "<?xml version=\"1.0\"?><customer><age>1</age><name>Gambardella, Matthew</name><id>12</id></customer>";
		ResponseEntity<String> exchange = HttpHeadersV1.postData("test",xml,"http://192.168.0.14:8080/mfs/message/redirectpage");
		statusCode = exchange.getStatusCode();
		System.out.println(statusCode);
		System.out.println(exchange.getBody());
	}
	
}
