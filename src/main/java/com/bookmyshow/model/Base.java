package com.bookmyshow.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {

	@Id
	private int id;

}
