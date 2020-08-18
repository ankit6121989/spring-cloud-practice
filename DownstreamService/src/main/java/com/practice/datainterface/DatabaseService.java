package com.practice.datainterface;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DatabaseService extends JpaRepository<Customer,Long> {
  public Customer findByUsername(String username);
  public Customer findByfirstName(String lastname);
}
