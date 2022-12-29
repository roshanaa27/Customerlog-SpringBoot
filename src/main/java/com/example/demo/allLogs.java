package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class allLogs {
  @Autowired repository ob;
  @GetMapping()
  public List<user> getAllNotes()
  {
	  return ob.findAll();
  }
}
