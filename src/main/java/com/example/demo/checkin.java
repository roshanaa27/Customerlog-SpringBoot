
package com.example.demo;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="checkin/{name}")
public class checkin{
	String LogType="In",i;
	LocalDate date;
	LocalTime time;
@Autowired repository ob;
@GetMapping()
public String getCustomer(@PathVariable("name") String name)
{
	date=LocalDate.now();
	time=LocalTime.now();
	i=name.concat(time.toString());
	user store=new user();
	store.setDate(date.toString());
	store.setTime(time.toString());
	store.setI(i.toString());
	store.setLogType(LogType);
	
	user first=new user(LogType, date.toString(),time.toString(),i);
	ob.save(first);
	return "IN"+" "+date.toString()+" "+time.toString()+" "+i;
			
}
}
