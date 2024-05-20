package in.balaji;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.balaji.entity.Customer;

@RestController
public class MsgController {
	
	@GetMapping("/greet")
	public ResponseEntity<String> greet(@RequestParam ("name") String name) {
		String msg = name + ", How are you...!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);		
	}
	
	@GetMapping("/welcome/{name}")
	public ResponseEntity<String> welcome(@PathVariable ("name") String name) {
		String msg = name + ", How are you doing...!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);		
	}
	
	@GetMapping("/consumer")
	public Customer getCustomer() {
		
		Customer customer = new Customer(1, "anil", "anil@gmail.com");
		return customer;
		
	}
	@GetMapping("/consumers")
	public List<Customer> getCustomers() {
		
		Customer c1 = new Customer(1, "anil", "anil@gmail.com");
		Customer c2 = new Customer(2, "manu", "manu@gmail.com");
		Customer c3 = new Customer(3, "raja", "raja@gmail.com");
		List<Customer> c  = Arrays.asList(c1, c2, c3);
		return c;
		
	}
	@PostMapping("/customer")
	public String getData(@RequestBody Customer c) {
		System.out.println(c);
		
		return "Data Created";
	}
	
}
