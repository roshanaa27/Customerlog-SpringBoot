package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="date/{date}")

public class date {
 @Autowired repository ob;
 @GetMapping()
 public List<user>getDate(@PathVariable("date") String date){
	 return ob.findbydate(date);
 }
}
