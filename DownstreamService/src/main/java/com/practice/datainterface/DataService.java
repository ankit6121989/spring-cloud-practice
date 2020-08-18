package com.practice.datainterface;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class DataService implements CommandLineRunner {

  @Autowired
  private DatabaseService databaseService;

  public List<Customer> getAllCustomer(){
    return databaseService.findAll();
  }

  public Customer getPassword(String username){
    return databaseService.findByUsername(username);
  }

  public Customer findByFirstname(String firstname){
    return  databaseService.findByfirstName(firstname);
  }

  @Override
  public void run(String... args) throws Exception {
    databaseService.save(new Customer("Ankit","Singh","ankit61289","password"));
    databaseService.save(new Customer("Vinita","Singh","vini","vinipassword"));
    databaseService.save(new Customer("Avanika","Singh","avni","avnipassword"));
  }
}
