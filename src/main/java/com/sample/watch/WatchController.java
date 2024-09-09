package com.sample.watch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/watch")
public class WatchController {
 
	@GetMapping(value="/getWatch")   //http://localhost:8080/getWatch
	public WatchNTT getWatch(@RequestBody WatchNTT w) {
		return w; 
	}
	
	@GetMapping(value="/getWatches")  //http://localhost:8080/watch/getWatches
		public List<WatchNTT>getWatches(@RequestBody List<WatchNTT> w){
		return w; 
	}
	
	@GetMapping(value="/getBrand")  //http://localhost:8080/watch/getBrand
	public ArrayList<String> getBrand(@RequestBody List<WatchNTT> w) {
		ArrayList<String> a = new ArrayList<>();
		for(int i=0; i<w.size(); i++) {
			if(w.get(i).getBrand().startsWith("T")) {
				 a.add(w.get(i).getBrand());
			}
			
		}
		return a;
	}
	
	@GetMapping(value="/getPrice")
	public String getPrice(@RequestBody List<WatchNTT> w){
		
		int  arr1 = w.stream().map(x->x.getBrand().length()).max(Comparable :: compareTo).get();
		List<Integer> arr2 = w.stream().filter(x->x.getBrand().length()== arr1).map(x->x.getPrice()).collect(Collectors.toList());
		List<String> arr3 = w.stream().filter(x->x.getBrand().length()== arr1).map(x->x.getMaterial()).collect(Collectors.toList());
		 return arr2+" "+arr3;
	}
	
}
