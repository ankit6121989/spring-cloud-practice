package com.practice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "practiceRibbon")
public class ConfigControllerDemo {
  @Value("${firstName}")
  private String firstName;

  @Value("${lastName}")
  private String lastName;

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping(path="/getAll")
  public ResponseEntity<Object> printName(){
    return restTemplate.getForEntity("http://practiceRibbon/allCustomer", Object.class);
  }

  @RequestMapping(path="/name")
  public String getName(){
    return "Hello " + firstName + " "+lastName;
  }
}
