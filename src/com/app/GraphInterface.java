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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GraphInterface {

	public JFrame frame;
	public JPanel pnRoom;
	private JTextField tbRoom_tfID;
	private JTextField tbRoom_tfPrice;
	public ArrayList<Room> roomList = new ArrayList();
	public ArrayList<Session> sessionList = new ArrayList();
	public ArrayList<Movie> movieList = new ArrayList();
	public ArrayList<Ticket> ticketList = new ArrayList();
	private JTextField textField;
	private JTextField textField_1;
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
		
		JButton btnRoon = new JButton("Add Roon");
		
		JButton btnNewButton_3 = new JButton("New button");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_3, Alignment.TRAILING)
						.addComponent(btnRoon, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRoon)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addContainerGap(198, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		frame.getContentPane().add(panel_4);
		
		JTabbedPane tbPanel = new JTabbedPane(JTabbedPane.TOP);
		
		pnRoom = new JPanel();
		tbPanel.addTab("Room", null, pnRoom, null);
		
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
		
		JPanel pnMovie = new JPanel();
		tbPanel.addTab("New tab", null, pnMovie, null);
		
		JLabel tbMovie_title = new JLabel("New label");
		
		JLabel lblNewLabel = new JLabel("New label");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
		JSpinner spinner = new JSpinner();
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		GroupLayout gl_pnMovie = new GroupLayout(pnMovie);
		gl_pnMovie.setHorizontalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_pnMovie.createSequentialGroup()
							.addComponent(tbMovie_title)
							.addGap(189))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addContainerGap(384, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_pnMovie.createSequentialGroup()
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addGroup(gl_pnMovie.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_1, Alignment.LEADING)
									.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)))
							.addGap(18)
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_3)
								.addComponent(spinner, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_pnMovie.createSequentialGroup()
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_1)))
							.addContainerGap(33, Short.MAX_VALUE))))
		);
		gl_pnMovie.setVerticalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addContainerGap()
					.addComponent(tbMovie_title)
					.addGap(18)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_2)))
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(31))
		);
		pnMovie.setLayout(gl_pnMovie);
		
		JPanel panel_2 = new JPanel();
		tbPanel.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tbPanel.addTab("New tab", null, panel_3, null);
		frame.getContentPane().add(tbPanel);
		
		// events 
		btnRoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(0);
			}
		});
	}
}
