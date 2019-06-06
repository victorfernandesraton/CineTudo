package com.app;
import java.util.ArrayList;
import java.time.*;
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
    protected ArrayList<Session> listSession = new ArrayList<Session>(); 
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

    public boolean addSessio(Movie movie, LocalDate date, LocalTime startTime, int ocupation) {
        LocalDateTime dateTime = LocalDateTime.of(date.getYear(),date.getMonth(),date.getDayOfMonth(),startTime.getHour(),startTime.getMinute(),startTime.getSecond());
        Session s = new Session(this, movie, date, startTime, ocupation);
        if (!sessionExist(dateTime)) {
            listSession.add(s);
            return true;
        }
        return false;
    }

    public boolean addSessio(Session s) {
        if ( s.getRoom().equals(this) && !sessionExist(s.getStart()) ) {
            listSession.add(s);
            return true;
        }
        return false;
    }

    public boolean sessionExist(LocalDateTime local) {
        for (Session s : listSession) {
            if (s.getStart().equals(local)) {
                return true;
            }
        }
        return false;
    }

    public Session getSession(LocalDateTime local) {
        if (sessionExist(local)) {
            for (Session s : listSession) {
                if (s.getStart().equals(local)) {
                    return s;
                }
            }
        }
        return null;
    }
    
	@Override
	public String toString() {
		return this.id + "\t," + this.capacity;
	}
}
