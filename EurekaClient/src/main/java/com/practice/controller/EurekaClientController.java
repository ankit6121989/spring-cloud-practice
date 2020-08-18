package com.practice.controller;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaClientController {
  @Value("${firstName}")
  private String firstName;

  @Autowired
  private RestTemplate template;

  @RequestMapping(path="/getAll")
  public ResponseEntity<Object> printName(){
     return template.getForEntity("http://DOWNSTREAMSERVICE"+"/allCustomer", Object.class);
  }

  @RequestMapping(path="/name")
  public String getName(){
    return "Hello " + firstName ;
  }
}
