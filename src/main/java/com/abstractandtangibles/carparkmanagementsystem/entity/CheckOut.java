package com.abstractandtangibles.carparkmanagementsystem.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CheckOut {
	
	private Date checkOut;
	private BigDecimal rentCharge;
	
	private CheckIn checkIn;
	
	public CheckOut() {}
	
	public CheckOut(Date checkOut, BigDecimal rentCharge, CheckIn checkIn) {
		this.checkOut = checkOut;
		this.rentCharge = rentCharge;
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public BigDecimal getRentCharge() {
		return rentCharge;
	}

	public void setRentCharge(BigDecimal rentCharge) {
		this.rentCharge = rentCharge;
	}

	public CheckIn getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(CheckIn checkIn) {
		this.checkIn = checkIn;
	}
}
