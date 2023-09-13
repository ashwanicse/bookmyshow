package com.bookmyshow.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie extends Base{

	private String description;
	private String name;
	private String language;
	private Date releaseDate;

}
