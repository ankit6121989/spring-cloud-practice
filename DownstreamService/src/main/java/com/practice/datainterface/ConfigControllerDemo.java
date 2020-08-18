package com.practice.datainterface;

import com.practice.datainterface.Customer;
import com.practice.datainterface.DataService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigControllerDemo {

  @Autowired
  private DataService dataService;

  @RequestMapping(path="/allCustomer")
  public List<Customer> printName(){
    return dataService.getAllCustomer();
  }

  @RequestMapping(path="/getPassword")
  public Customer getPassword(@RequestParam(name="username") String username){
    return dataService.getPassword(username);
  }

  @RequestMapping(path="/getByFirstname")
  public Customer getByFirstname(@RequestParam(name="firstName") String firstName){
    return dataService.findByFirstname(firstName);
  }
}
