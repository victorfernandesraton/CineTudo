package com.app;

import java.time.*;
/**
 * @author Victor
 * @version 2
 */

public class Ticket {
    private double price;
    private User user;
    private Room room;
    private Movie movie;
    private LocalDateTime start, end;
    /**
     * This is a tiCket constructor
     * @param price
     * @param user
     * @param room
     * @param movie
     * @param start
     * @param end
     */
    public Ticket(double price, User user, Room room, Movie movie, LocalDateTime start, LocalDateTime end) {
    	if (user.isStudy()) {
    		this.price = room.getPrice()/2;
    	} else this.price = room.getPrice();
		this.user = user;
		this.room = room;
		this.movie = movie;
		this.start = start;
		this.end = end;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Ticket [price=" + price + ", user=" + user + ", room=" + room + ", movie=" + movie + ", start=" + start
				+ ", end=" + end + "]";
	}



	public void setPrice(double price) {
		this.price = price;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}
}
