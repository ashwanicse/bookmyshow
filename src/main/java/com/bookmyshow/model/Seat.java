package com.bookmyshow.model;

import com.bookmyshow.enums.SeatType;

public class Seat extends Base{
	
	private int rowNum;
	private int colNum;
	private SeatType seatType;

	public Seat(int rowNum, int colNum, SeatType seatType) {
		super();
		this.rowNum = rowNum;
		this.colNum = colNum;
		this.seatType = seatType;
	}
	
	
	

}
