package shop;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.customer.Customer;
import shop.customer.CustomerRepository;


@Service
public class InitDbService {

	@Autowired
	private CustomerRepository customerRepository;

	@PostConstruct
	public void init() {
		System.out.println("*** INIT DATABASE START ***");
		{
			Customer a = new Customer();
			a.setName("joe");
			a.setAddress("cork");
			customerRepository.save(a);//saves student object to database
		}
		{
			Customer a = new Customer();
			a.setName("mary");
			a.setAddress("dublin");
			customerRepository.save(a);
		}
		System.out.println("*** INIT DATABASE FINISH ***");
	}
}
