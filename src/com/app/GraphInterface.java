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
import javax.swing.ButtonGroup;
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
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class GraphInterface {

	public JFrame frame;
	public JPanel pnRoom;
	private JTextField tbRoom_tfID;
	public ArrayList<Room> roomList = new ArrayList();
	public ArrayList<Session> sessionList = new ArrayList();
	public ArrayList<Movie> movieList = new ArrayList();
	public ArrayList<Ticket> ticketList = new ArrayList();
	private JTextField textField;
	private ButtonGroup btgType = new ButtonGroup(); 
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
		frame.setBounds(100, 100, 596, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_4 = new JPanel();
		
		JButton btnRoon = new JButton("Add Roon");
		
		JButton btnMovie = new JButton("Add Movie");
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMovie, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
						.addComponent(btnRoon, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRoon)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMovie)
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
		
		JLabel tbRoon_lbDollar = new JLabel("U$");
		
		JCheckBox tbRoon_cbPrice = new JCheckBox("Default");
		
		JSpinner pnRoom_spPrice = new JSpinner();
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
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
										.addComponent(tbRoom_tfID, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
										.addGroup(gl_pnRoom.createSequentialGroup()
											.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
												.addComponent(tbRoom_lbCapacity)
												.addComponent(tbRoon_lbPrice)
												.addComponent(tbRoon_lbDollar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
												.addComponent(pnRoom_spPrice, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
												.addComponent(tbRoon_spCapacity, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
												.addComponent(tbRoon_cbPrice, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
									.addGap(36))
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addComponent(tbRoom_lbID)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tbRoon_lbType)
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addComponent(lbRoom_btnCancel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lbRoom_btnConfirm))
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(43)))
					.addContainerGap(46, Short.MAX_VALUE))
		);
		gl_pnRoom.setVerticalGroup(
			gl_pnRoom.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnRoom.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addComponent(tbRoon_title)
							.addGap(18)
							.addComponent(tbRoon_lbType))
						.addComponent(tbRoom_lbID))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addComponent(tbRoom_tfID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbRoom_lbCapacity)
								.addComponent(tbRoon_spCapacity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6))
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_pnRoom.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbRoon_lbPrice)
								.addComponent(tbRoon_cbPrice))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING)
								.addComponent(tbRoon_lbDollar)
								.addComponent(pnRoom_spPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbRoom_btnCancel)
								.addComponent(lbRoom_btnConfirm))
							.addContainerGap())))
		);
		
		JRadioButton tbRoon_rdTypeNormal = new JRadioButton("Normal");
		tbRoon_rdTypeNormal.setSelected(true);
		
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
		tbPanel.addTab("Movie", null, pnMovie, null);
		
		JLabel pnMovie_title = new JLabel("Make movie");
		
		JLabel pnMovie_lbTitle = new JLabel("Title");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Description");
		
		JLabel lblNewLabel_2 = new JLabel("Category");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel tbMovie_lbCategory = new JLabel("Min. Age");
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JTextArea textArea = new JTextArea();
		
		JComboBox comboBox_1 = new JComboBox();
		GroupLayout gl_pnMovie = new GroupLayout(pnMovie);
		gl_pnMovie.setHorizontalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnMovie.createSequentialGroup()
									.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING, false)
											.addComponent(pnMovie_lbTitle)
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
										.addComponent(tbMovie_lbCategory)
										.addGroup(gl_pnMovie.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBox_1, Alignment.LEADING, 0, 197, Short.MAX_VALUE)))
									.addGap(30)
									.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_pnMovie.createSequentialGroup()
											.addComponent(btnNewButton)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnNewButton_1))
										.addComponent(lblNewLabel_1)
										.addComponent(textArea)))
								.addComponent(lblNewLabel_2)))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGap(191)
							.addComponent(pnMovie_title)))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_pnMovie.setVerticalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addGap(18)
					.addComponent(pnMovie_title)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
						.addComponent(pnMovie_lbTitle)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbMovie_lbCategory)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(lblNewLabel_2))
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(183))
		);
		pnMovie.setLayout(gl_pnMovie);
		
		JPanel pnSession = new JPanel();
		tbPanel.addTab("Sessions", null, pnSession, null);
		
		JPanel panel_3 = new JPanel();
		tbPanel.addTab("New tab", null, panel_3, null);
		frame.getContentPane().add(tbPanel);
		
		// events 
		btnRoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(0);
			}
		});
		btnMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(1);;
			}
		});
		tbRoon_cbPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tbRoon_cbPrice.isSelected()) {
					pnRoom_spPrice.setEnabled(false);
				} else pnRoom_spPrice.setEnabled(true);
			}
		});
		btgType.add(tbRoon_rdTypeNormal);
		btgType.add(tbRoon_rdTypr3d);
	}
}
