package com.example.demo;
import org.springframework.data.repository.CrudRepository;
public interface ContactRepository extends CrudRepository<Contact,String>{
}