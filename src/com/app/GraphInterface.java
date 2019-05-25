package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class GraphInterface {

	public JFrame frame;
	public JPanel pnRoom;
	private JTextField tbRoom_tfID;
	private JTextField tbRoom_tfPrice;
	public ArrayList<Room> roomList = new ArrayList();
	public ArrayList<Session> sessionList = new ArrayList();
	public ArrayList<Movie> movieList = new ArrayList();
	public ArrayList<Ticket> ticketList = new ArrayList();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public GraphInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_4 = new JPanel();
		
		JButton btnNewButton_2 = new JButton("New button");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(11, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(151, Short.MAX_VALUE)
					.addComponent(btnNewButton_2)
					.addGap(87))
		);
		panel_4.setLayout(gl_panel_4);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		frame.getContentPane().add(panel_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		pnRoom = new JPanel();
		tabbedPane.addTab("Room", null, pnRoom, null);
		
		JLabel tbRoon_title = new JLabel("Create Room");
		
		JLabel tbRoom_lbID = new JLabel("ID");
		
		tbRoom_tfID = new JTextField();
		tbRoom_tfID.setColumns(10);
		
		JSpinner tbRoon_spCapacity = new JSpinner();
		
		JLabel tbRoom_lbCapacity = new JLabel("Capacity");
		
		JLabel tbRoon_lbType = new JLabel("Type");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton lbRoom_btnConfirm = new JButton("Confirm");
		lbRoom_btnConfirm.setEnabled(false);
		
		JButton lbRoom_btnCancel = new JButton("Cancel");
		
		JLabel tbRoon_lbPrice = new JLabel("Price ticket");
		
		tbRoom_tfPrice = new JTextField();
		tbRoom_tfPrice.setColumns(10);
		
		JLabel tbRoon_lbDollar = new JLabel("U$");
		
		JCheckBox tbRoon_cbPrice = new JCheckBox("Default");
		GroupLayout gl_pnRoom = new GroupLayout(pnRoom);
		gl_pnRoom.setHorizontalGroup(
			gl_pnRoom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnRoom.createSequentialGroup()
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addGap(167)
							.addComponent(tbRoon_title, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.TRAILING)
								.addComponent(tbRoom_lbID, Alignment.LEADING)
								.addGroup(Alignment.LEADING, gl_pnRoom.createSequentialGroup()
									.addComponent(tbRoom_lbCapacity)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tbRoon_spCapacity))
								.addComponent(tbRoom_tfID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_pnRoom.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, gl_pnRoom.createSequentialGroup()
										.addComponent(tbRoon_lbDollar)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(tbRoom_tfPrice))
									.addGroup(Alignment.LEADING, gl_pnRoom.createSequentialGroup()
										.addComponent(tbRoon_lbPrice)
										.addGap(18)
										.addComponent(tbRoon_cbPrice, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
							.addGap(81)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
								.addComponent(tbRoon_lbType)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addComponent(lbRoom_btnCancel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbRoom_btnConfirm)))
							.addGap(47)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_pnRoom.setVerticalGroup(
			gl_pnRoom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnRoom.createSequentialGroup()
					.addContainerGap()
					.addComponent(tbRoon_title)
					.addGap(18)
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbRoom_lbID)
						.addComponent(tbRoon_lbType))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addComponent(tbRoom_tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
								.addComponent(tbRoom_lbCapacity)
								.addComponent(tbRoon_spCapacity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbRoon_lbPrice)
						.addComponent(tbRoon_cbPrice))
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbRoom_btnCancel)
								.addComponent(lbRoom_btnConfirm)))
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbRoom_tfPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbRoon_lbDollar))))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		
		JRadioButton tbRoon_rdTypeNormal = new JRadioButton("Normal");
		
		JRadioButton tbRoon_rdTypr3d = new JRadioButton("3D");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(tbRoon_rdTypeNormal)
						.addComponent(tbRoon_rdTypr3d))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(tbRoon_rdTypeNormal)
					.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
					.addComponent(tbRoon_rdTypr3d))
		);
		panel.setLayout(gl_panel);
		pnRoom.setLayout(gl_pnRoom);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		frame.getContentPane().add(tabbedPane);
	}
}
