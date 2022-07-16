package com.abstractandtangibles.carparkmanagementsystem.entity;

public interface ParkingSlot {
	
	public String getSlotId();
	public void setSlotId(String slotId);
	public boolean isOccupationStatus();
	public void setOccupationStatus(boolean occupationStatus);
}
