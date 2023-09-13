package com.bookmyshow.model;

import com.bookmyshow.enums.BookingStatus;

public class MovieShowSeat extends Base{

	private MovieShow moviesShow;
	private Seat seat;
	private BookingStatus bookingStatus;

	public MovieShowSeat(MovieShow moviesShow, Seat seat, BookingStatus bookingStatus) {
		super();
		this.moviesShow = moviesShow;
		this.seat = seat;
		this.bookingStatus = bookingStatus;
	}
	
	

}
