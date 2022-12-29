package com.example.demo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class user {
	
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
 
 private int id;
 private String LogType;
 private String date;
 private String time;
 private String i;
 user() {}
 user(String LogType,String date,String time,String i)
 {
	 this.setLogType(LogType);
	 this.setDate(date);
	 this.setTime(time);
	 this.setI(i);
 }
 public String getLogType() {
	 return LogType;
 }
 public void setLogType(String logType) {
	 LogType=logType;
 }
 public String getDate() {
	 return date;
 }
 public void setDate(String date) {
	 this.date=date;
 }
 public String getTime() {
	 return time;
 }
 public void setTime(String time) {
	 this.time=time;
 }
 public String getI() {
	 return i;
 }
 public void setI(String i) {
	 this.i=i;
 }
 
}