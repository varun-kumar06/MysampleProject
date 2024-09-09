package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/getHello")
  public String get() {
		return "Hello World";
	}
	
	@GetMapping("/getBye")
	public String get1() {
		return "Bye World";
	}
	
	@GetMapping("/getName/{name}")  // localhost:8080/getName/Varun
	public String getName(@PathVariable String name) {
		return "Hello"+ name;
		
	}
	
	@GetMapping("/getNum/{num1}/{num2}")
	public int getNum(@PathVariable int num1, @PathVariable int num2) {
		if(num1>num2) {
			return (num1);
		}
		else {
			return (num2);
		}
	}
	
		@GetMapping("/getMin")		
		public String getMin(@RequestParam int num1, @RequestParam int num2) { // http://localhost:8080/getMin?num1=24&num2=6
			if(num1<num2) {
				return num1+"is the Lowest";
			}
			else {
				return num2+"is the Lowest";
			}
		}
		
//		@GetMapping("/getReverse/{word}")
//		public int getPrime(int num ) {
//			
//			
//			 
//		}
		
		
	
}
