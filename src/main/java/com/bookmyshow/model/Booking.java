package com.bookmyshow.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
//@Entity
public class Booking extends Base {
	private Customer customer;
	private List<MovieShowSeat> showSeats;
	private MovieShow movieShow;
	private Date bookedAt;
	private double amount;
}
	