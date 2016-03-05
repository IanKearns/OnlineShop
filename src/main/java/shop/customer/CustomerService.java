package shop.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired//spring creates student repository
	private CustomerRepository customerRepository;

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void save(Customer stu) {
		customerRepository.save(stu);
	}

	public void remove(Customer stu) {
		customerRepository.delete(stu);
	}

}

