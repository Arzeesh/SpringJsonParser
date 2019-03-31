package org.learn.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SpringApplication.run(SpringSecurityApplication.class, args);
		
   // need to create rstp coz it return type of collection we are expecting
		RestTemplate rstp = new RestTemplate();
		
		// list is wat we are expecting in json
		String url = "http://192.168.1.232:8087/api/rest/books";
		// need responseentity and exchange overloaded method
	     ResponseEntity<List<JsonPojo>>  response = rstp.exchange(url, HttpMethod.GET,null, 
	    		 new ParameterizedTypeReference<List<JsonPojo>>(){});
	    System.out.println("Before Sorting " );
	     response.getBody().forEach(System.out::println);
	     
	     
	     // saving the response body in arraylist
	    List <JsonPojo> json = new ArrayList<>(response.getBody());
	   // System.out.println("After Sorting " );
	    //json.stream().sorted((x,y)->x.getName().compareToIgnoreCase(y.getName())).forEach(System.out::println);
	   // System.out.println("Again printing "+"\n"+json);
	    	 
	    
	    //implementing comparator
		// we do collections.sort
		 Collections.sort(json, new Comparator <JsonPojo>() {
		
		  
		  @Override
		  public int compare(JsonPojo o1, JsonPojo o2) { 
			  return o1.getName().compareTo(o2.getName() );}
			   });
		  for(JsonPojo jp :   json)
			     System.out.println("After sorting again " +jp);
		  
	}	
}
			
	     
		
	


