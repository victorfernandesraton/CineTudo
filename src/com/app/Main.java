package com.app;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
/**
 * @author Victor
 * @version 3
 * */

public class Main {

	public static void main(String[] args) {
		// TODO need make interface for integrator GUI for obj
		
		
		// set LookAndFeel
		try {
			for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
				}
			}
		} catch (Throwable e) {
		}
		// teste classe
		Room room = new Room3d("1212",2);
		Movie movie =  new Movie(LocalTime.parse("02:30"),"Avangers: Ultimato","Thanos is die and batmam kill all heroes of planet because her is unique hero ever exist");
		Session session = new Session(room,movie,LocalDate.parse("2019-04-12"),LocalTime.parse("14:30:00"));
		User user = new User("teste","1212", LocalDate.parse("2012-04-16"));
		System.out.print(session.buyTickets(user).toString());
		System.out.print(session.buyTickets(user).toString());
		System.out.println(session.toString());
		

		EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				GraphInterface window = new GraphInterface();
				window.frame.setVisible(true);
				window.frame.setResizable(false);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});

	}
}

