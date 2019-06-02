package com.app;

/**
 * @author Victor
 * @version 2
 * This is a abstract class using for making room*/

public abstract class Room {
    protected String id;
    protected int capacity;
    protected double price;
    protected static boolean is3d;
    protected static String type;
    /**
     * This is a constructor of Room class
     * @param id
     * @param capacity
     * @param price
     */
    public Room(String id, int capacity, double price) {
        this.id = id;
        this.capacity = capacity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static boolean isIs3d() {
        return is3d;
    }

    public static void setIs3d(boolean is3d) {
        Room.is3d = is3d;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Room.type = type;
    }

	@Override
	public String toString() {
		return this.id + "\t," + this.capacity;
	}
}
