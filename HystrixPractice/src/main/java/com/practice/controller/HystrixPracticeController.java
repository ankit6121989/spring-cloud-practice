package com.practice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HystrixPracticeController {

  @Autowired
  private RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "getAnyName")
  @RequestMapping(path="/getAll")
  public ResponseEntity<String> printName(){
    return restTemplate.getForEntity("http://DOWNSTREAMSERVICE/allCustomer", String.class);
  }

  public ResponseEntity<String> getAnyName(){return new ResponseEntity<String>(new String("Fallback method"), HttpStatus.OK);}
}
