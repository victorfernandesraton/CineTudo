package com.app;
/**
 * 
 * @author Victor
 * @version 2
 */

public interface BuyPass {
	/**
	 * This is a buy and make ticket if is possible 
	 * @param user
	 * @return Ticket
	 */
	Ticket buyTickets(User user);
	/**
	 * This is a custer calculator
	 * @param user
	 * @return double
	 */
	double coast(User user);
}
