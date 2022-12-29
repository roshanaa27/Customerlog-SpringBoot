
package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface repository extends JpaRepository<user,Integer>{
	@Query(value="SELECT * FROM user u where u.date=?1",nativeQuery=true)
	List<user>findbydate(String date);
}