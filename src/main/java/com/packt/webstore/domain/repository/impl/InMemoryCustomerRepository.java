package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository{

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	 public InMemoryCustomerRepository() {
		 
	 Customer user1 = new Customer("U1234", "Jan Nowak", "Dolna 5, 30-511 Kraków", 3);
	 
	 
	 Customer user2 = new Customer("U1235","Barbara Kowalska", "Mickiewicza 13/16, 92-088 £ódŸ", 1);
	 
	 
	 Customer user3 = new Customer("U1236","Pawe³ Kwiatkowski", "Jana Paw³a II 16 m. 28, 00-352 Warszawa", 10);
	

			 listOfCustomers.add(user1);
			 listOfCustomers.add(user2);
			 listOfCustomers.add(user3);
			 }
	 
			 public List<Customer> getAllCustomers() {
			 return listOfCustomers;
			 }
	
}
