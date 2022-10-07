package com.project.sheikah_store.service;

import org.springframework.stereotype.Service;

import com.project.sheikah_store.model.Customer;
import com.project.sheikah_store.repository.ICustomerRepository;

@Service
public class CustomerService implements ICustomerService {

    private ICustomerRepository iCustomerRepository;

    public CustomerService(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public Customer insertCustomer(Customer customer) {
        return iCustomerRepository.save(customer);
    }

}
