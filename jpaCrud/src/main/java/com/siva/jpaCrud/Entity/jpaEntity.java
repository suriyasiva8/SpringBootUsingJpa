package com.siva.jpaCrud.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sample")
public class jpaEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String name;
	String address;
	String city;
	public jpaEntity(String name, String address, String city) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
	}

	

}
