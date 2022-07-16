package com.abstractandtangibles.carparkmanagementsystem.entity;

public class Car implements Vehicle {
	private String vehicleId;
	private String type;
	
	public Car() {}
	
	public Car(String vehicleId, String type) {
		this.vehicleId = vehicleId;
		this.type = type;
	}

	public String getId() {
		return vehicleId;
	}

	public void setId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
