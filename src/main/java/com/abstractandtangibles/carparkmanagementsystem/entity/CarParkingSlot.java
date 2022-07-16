package com.abstractandtangibles.carparkmanagementsystem.entity;

public class CarParkingSlot implements ParkingSlot {
	
	private String slotId;
	private boolean occupationStatus;
	private Car car;
	
	public CarParkingSlot() {}
	
	public CarParkingSlot(String slotId, boolean occupationStatus) {
		this.slotId = slotId;
		this.occupationStatus = occupationStatus;
	}

	public String getSlotId() {
		return slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
	}

	public boolean isOccupationStatus() {
		return occupationStatus;
	}

	public void setOccupationStatus(boolean occupationStatus) {
		this.occupationStatus = occupationStatus;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
