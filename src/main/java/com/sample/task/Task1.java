package com.sample.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task1 {

	@GetMapping("/getReverse/{name}") 
	public String getReverse(@PathVariable String name) {
		//char[]c = name.toCharArray();
		String name1 = "";
		for(int i=name.length()-1; i>=0; i--) {
			name1= name1+name.charAt(i);
		
		}
		return name1;
		
	}
	
	@GetMapping("/getPrime/{number}")
	public String getPrime(@PathVariable int number) {
		int count = 0;
		for(int i=2; i<number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==0) {
			return "Prime";
		}
		else {
			return "NotPrime";
		}
	}
	
	//public String getDuplicate
	
}
