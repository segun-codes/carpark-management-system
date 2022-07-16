package com.abstractandtangibles.carparkmanagementsystem.entity;

import java.util.Date;

public class CheckIn {
	private Car car;
	private CarParkingSlot carParkingSlot;
	private Date checkIn;
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public CarParkingSlot getCarParkingSlot() {
		return carParkingSlot;
	}
	
	public void setCarParkingSlot(CarParkingSlot carParkingSlot) {
		this.carParkingSlot = carParkingSlot;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
}
