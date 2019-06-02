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
			//
		}
		// teste classe
		Room room = new Room3d("1212",2);
		Movie movie =  new Movie(LocalTime.parse("02:30"),"Avangers: Ultimato","Tarantino","terror","Thanos is die and batmam kill all heroes of planet because her is unique hero ever exist");
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

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        // set LookAndFeel
		try {
			for(LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
				}
			}
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _Graph().setVisible(true);
            }
        });
    }
}

