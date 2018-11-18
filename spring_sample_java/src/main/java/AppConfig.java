import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.Repository.CustomerRepository;
import com.pluralsight.Repository.HibernateCustomerRepositoryImpl;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	/*  Injection 
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		return service;
	} */
	
	/* Setter Injection 
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	} */
	
	/* Constructor Injection 
	@Bean(name = "customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		return service;
	} */

	/*
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	} */

}
