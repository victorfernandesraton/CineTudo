package com.app;

import java.time.*;
/**
 * @author Victor
 * @version 2
 */
public class Session implements BuyPass {
    private Room room;
    private Movie movie;
    private LocalDateTime start, end;
    private LocalDate date;
    private LocalTime startTime;
    private int capacity, ocupation;
    
    /**
     * This is a constructor of Session
     * @param room
     * @param movie
     * @param date
     * @param startTime
     * @param ocupation
     */
    public Session(Room room, Movie movie, LocalDate date, LocalTime startTime, int ocupation) {
        this.room = room;
        this.movie = movie;
        this.capacity = room.getCapacity();
        this.date = date;
        this.startTime = startTime;
        this.ocupation = ocupation;
        this.start = LocalDateTime.of(this.date.getYear(),this.date.getMonth(),this.date.getDayOfMonth(),this.startTime.getHour(),this.startTime.getMinute(),this.startTime.getSecond());
        this.end = this.start.plusHours(this.movie.getHour()).plusMinutes(this.movie.getMinute()).plusSeconds(this.movie.getSecond());
    }
    
    /**
     * This is a supercharge of constructor
     * @param room
     * @param movie
     * @param date
     * @param startTime
     */

    public Session(Room room, Movie movie, LocalDate date, LocalTime startTime) {

        this(room,movie,date,startTime,0);
    }

    /**
     * Add person on a room if not is foo
     * @param add
     * @return is posssible add
     */
    public boolean addOcupation(int add ) {
        if (isFoo() || ocupation+add > capacity) {
            return false;
        } else {
            this.ocupation += add;
            return  true;
        }
    }

    public boolean addOcupation() {
        return  addOcupation(1);
    }

    /**
     * This is a method verfy of room is foo
     * @return boolean
     */
    public boolean isFoo() {
        if (ocupation == capacity) {
            return true;
        } else return false;
    }

    public LocalDateTime getInit() {
        return start;
    }

    public void setInit(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public LocalDate getDay() {
        return date;
    }

    public void setDay(LocalDate date) {
        this.date = date;
    }

    public LocalTime getInitTime() {
        return startTime;
    }

    public void setInitTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public int getcapacity() {
        return capacity;
    }

    public void setcapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOcupation() {
        return ocupation;
    }

    public void setOcupation(int ocupation) {
        this.ocupation = ocupation;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
   public double price() {
	   return room.getPrice();
   }

   public LocalDateTime getStart() {
       return this.start;
   }
		
	@Override
	public Ticket buyTickets(User user) { 
		if (addOcupation()) {			
			double coast = coast(user);
			return new Ticket(coast,user,room,movie,start,end);
		}
		return null;
	}
	
	@Override
	public double coast(User user) {
		if (user.isStudy()) {
			return room.getPrice()/2;
		} else return room.getPrice();
	}

	@Override
	public String toString() {
		return this.room.getId()+" ,"+this.start.toString() +", " + this.movie.getTitle()+", "+this.ocupation;
	}
}