package com.victor.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.victor.entities.Person;

@Service
public class PersonService {

 public List<Person> getAllPersons(){
	 
	 List<Person> list = new ArrayList<>();
	 
	 list.add(new Person(1, "mr", "ab", "abc", 23456, "222", 8, "male", "xe", 978, "we", "iu"));
	 list.add(new Person(2, "mrs", "ao", "aby", 2344456, "22552", 8, "mal", "kj", 978, "iu", "yt"));
	 
	 return list;
 }
	
	
	
	
	
	
	
	
}
