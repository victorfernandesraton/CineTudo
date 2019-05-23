package com.app;

public class Room3d extends Room{
    /**
     * This is a constructor of Room class
     *
     * @param id
     * @param capacity
     * @param price
     */
    public Room3d(String id, int capacity, double price) {
        super(id, capacity,price);
        Room.is3d = true;
        Room.type = "3-D room";
    }
    /**
     * This is a default price constructor of Room class
     *
     * @param id
     * @param capacity
     */

    public Room3d(String id, int capacity) {
        this(id,capacity,30);
        Room.is3d = true;
        Room.type = "3-D room";
    }
    
	@Override
	public String toString() {
		return "\nRoom3d [" + super.toString() + "]";
	}
}
