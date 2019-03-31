package org.learn.java;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Controller
@RequestMapping("/api/rest")
public class WelcomeRestController {

	
	
	// THE METHOD TO BE USED when api/rest is hit
	/*@GetMapping(value="welcome", produces =MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<String> welcome(){
		String s = "I HATE MY JOB";
		return  new ResponseEntity<String>(s, HttpStatus.OK);
		*/
	/*
	 * RestTemplate rstp = new RestTemplate(); List<JsonPojo> jp =
	 * rstp.getForObject("192.168.1.232:8087/api/rest/books", JsonPojo.class);
	 * assertThat(myList.getName(), notNullValue()); assertThat(mylist.getId(),
	 * is(1L));
	 */
		 
				
		/*
		 * RestTemplate restTemplate = new RestTemplate(); String fooResourceUrl =
		 * "192.168.1.232:8087/api/rest/books"; ResponseEntity<String> response =
		 * restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
		 * assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
		 */
		
	
	// since i annotated rest controller automatciicaly ocnverted to json from http response

	/*public static void getEmployees()
	{
	    final String uri = "192.168.1.232:8087/api/rest/books";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    JsonPojo result = restTemplate.getForObject(uri, JsonPojo.class);
	  
	    System.out.println(result);
	}*/
	
}
