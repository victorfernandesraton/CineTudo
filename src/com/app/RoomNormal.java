package com.app;

public class RoomNormal extends Room {

    /**
     * This is a constructor of Room class
     *
     * @param id
     * @param capacity
     * @param price
     */
    public RoomNormal(String id, int capacity, double price) {
        super(id, capacity,price);
        Room.is3d = false;
        Room.type = "Normal room";
    }
    /**
     * This is a default price constructor of Room class
     *
     * @param id
     * @param capacity
     */

    public RoomNormal(String id, int capacity) {
        this(id,capacity,25);
        Room.is3d = false;
        Room.type = "Normal room";
    }
    
    @Override
	public String toString() {
		return "\nNormalRoom [" + super.toString() + "]";
	}
}
