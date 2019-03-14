package com.akshaydamle.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.akshaydamle.model.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	/*@Autowired
	private MongoTemplate mongoTemplate;*/
	
	public static final String COLLECTIONNAME = "person";
	
	public void clearDB() {
		/*if(mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.dropCollection(COLLECTIONNAME);
		}*/
	}
	
	public void addPerson(Person p) {
		/*if(!mongoTemplate.collectionExists(Person.class)) {
			mongoTemplate.createCollection(Person.class);
		}
		mongoTemplate.insert(p, COLLECTIONNAME);
		System.out.println("Added person");
		listAllPersons();*/
	}

	public List<Person> listAllPersons() {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person("Ajinkya", "121"));
		l.add(new Person("Ajinkya", "121"));
		return l;
		/*List<Person> l = mongoTemplate.findAll(Person.class, COLLECTIONNAME);
		for(Person p : l) {
			System.out.println(p.getName());
			System.out.println(p.getId());
		}
		return null;*/
	}

	public List<Person> searchByName(String name) {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person("Ajinkya", "121"));
		l.add(new Person("Ajinkya", "121"));
		return l;
		/*Query q = new Query();
		q.addCriteria(Criteria.where("name").is(name));
		return mongoTemplate.find(q, Person.class, COLLECTIONNAME);*/
	}

	public List<Person> searchByID(String id) {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person("Ajinkya", "121"));
		l.add(new Person("Ajinkya", "121"));
		return l;
		/*Query q = new Query();
		q.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.find(q, Person.class, COLLECTIONNAME);*/
	}

	public List<Person> searchByBoth(String name, String id) {
		List<Person> l = new ArrayList<Person>();
		l.add(new Person("Ajinkya", "121"));
		l.add(new Person("Ajinkya", "121"));
		return l;
		/*Query q = new Query();
		q.addCriteria(Criteria.where("name").is(name));
		q.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.find(q, Person.class, COLLECTIONNAME);*/
	}

	public void deletePerson(String id) {
		/*mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Person.class);*/
	}
	
	public void updatePerson(String id, String newName) {
		/*deletePerson(id);
		addPerson(new Person(newName, id));*/
	}
}