package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Vector;
import java.time.*;

import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
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
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import javafx.util.converter.LocalTimeStringConverter;

import javax.swing.event.ChangeEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;


public class GraphInterface {

	public JFrame frame;
	public JPanel pnRoom;
	public ArrayList<Room> roomList = new ArrayList<Room>();
	public ArrayList<Session> sessionList = new ArrayList<Session>();
	public ArrayList<Movie> movieList = new ArrayList<Movie>();
	public ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	public ArrayList<Integer> ageList = new ArrayList<Integer>();
	public ArrayList<String> categoryList = new ArrayList<String>();
	public ArrayList<JTextField> tbRoom_tf = new ArrayList<JTextField>();
	public ArrayList<JSpinner> tbRoom_sp = new ArrayList<JSpinner>();
	public ArrayList<JButton> btnMenu = new ArrayList<JButton>();
	public ArrayList<Integer> hourList = new ArrayList<Integer>();
	public ArrayList<Integer> minList = new ArrayList<Integer>();
	public ArrayList<Integer> mounthList = new ArrayList<Integer>();
	public ArrayList<Integer> dayList = new ArrayList<Integer>();
	public ArrayList<Integer> yearList = new ArrayList<Integer>();
	private ButtonGroup btgType = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	private Component tbMovie_tfTitle;
	private JTextField textField_2;
	private JTextField tbMovie_tfTitle2;
	private JTextField tbSession_tfId;
	
	public void cbUpdateMovie(ArrayList<Movie> movieList, JComboBox box) {
		box.removeAllItems();
		for (Movie movie : movieList) {			
			box.addItem(movie);
		}
	}
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
		Vector vectorPesawat = new Vector();
		JPanel panel_4 = new JPanel();
		JButton btnRoon = new JButton("Add Roon");
		JButton btnMovie = new JButton("Add Movie");
		JButton btnSession = new JButton("Add Session");
		btnMenu.add(btnRoon);
		btnMenu.add(btnMovie);
		btnMenu.add(btnSession);
		
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMovie, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
						.addComponent(btnRoon, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
						.addComponent(btnSession))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnRoon)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnMovie)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSession)
					.addContainerGap(165, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		frame.getContentPane().add(panel_4);
		
		JTabbedPane tbPanel = new JTabbedPane(JTabbedPane.TOP);
		
		pnRoom = new JPanel();
		tbPanel.addTab("Room", null, pnRoom, null);
		
		JLabel tbRoon_title = new JLabel("Create Room");
		
		JLabel tbRoom_lbID = new JLabel("ID");
		
		JTextField tbRoom_tfID = new JTextField();
		tbRoom_tfID.setColumns(10);
		
		JSpinner tbRoon_spCapacity = new JSpinner();
		
		JLabel tbRoom_lbCapacity = new JLabel("Capacity");
		
		JLabel tbRoon_lbType = new JLabel("Type");
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton tbRoom_btnConfirm = new JButton("Confirm");
		tbRoom_btnConfirm.setEnabled(false);
		
		JButton tbRoom_btnCancel = new JButton("Cancel");
		
		JLabel tbRoon_lbPrice = new JLabel("Price ticket");
		
		JLabel tbRoon_lbDollar = new JLabel("U$");
		
		JCheckBox tbRoon_cbPrice = new JCheckBox("Default");
		
		
		JSpinner tbRoom_spPrice = new JSpinner();
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
												.addComponent(tbRoom_spPrice, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
												.addComponent(tbRoon_spCapacity, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
												.addComponent(tbRoon_cbPrice, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))))
									.addGap(36))
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addComponent(tbRoom_lbID)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tbRoon_lbType)
								.addGroup(gl_pnRoom.createSequentialGroup()
									.addComponent(tbRoom_btnCancel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(tbRoom_btnConfirm))
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
								.addComponent(tbRoom_spPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(gl_pnRoom.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnRoom.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbRoom_btnCancel)
								.addComponent(tbRoom_btnConfirm))
							.addContainerGap())))
		);
		
		JRadioButton tbRoon_rdTypeNormal = new JRadioButton("Normal");
		
		tbRoon_rdTypeNormal.setSelected(true);
		JRadioButton tbRoon_rdTypr3d = new JRadioButton("3D");
		
		btgType.add(tbRoon_rdTypeNormal);
		btgType.add(tbRoon_rdTypr3d);
		
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
		
		JLabel pnMovie_title = new JLabel("Movie");
		
		JLabel tbMovie_lbTitle = new JLabel("New label");
		
		JComboBox tbMovie_cbCategory = new JComboBox();
		
		JLabel pnMovie_lbMinAge = new JLabel("New label");
		
		JComboBox tbMovie_cbMinAge = new JComboBox();
		
		JLabel pnMovie_lbCategory = new JLabel("New label");
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		
		JButton tbMovie_btnCancel = new JButton("New button");
		
		JButton tbMovie_btnConfirm = new JButton("New button");
		
		tbMovie_tfTitle2 = new JTextField();
		tbMovie_tfTitle2.setColumns(10);
		
		JLabel tbMovie_lbDescription = new JLabel("New label");
		
		JTextArea tbMovie_taDescription = new JTextArea();
		
		JLabel lblNewLabel = new JLabel(":");
		
		JComboBox tbMovie_cbTimeHr = new JComboBox();
		
		JComboBox tbMovie_cbTimeMin = new JComboBox();
		GroupLayout gl_pnMovie = new GroupLayout(pnMovie);
		gl_pnMovie.setHorizontalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addComponent(tbMovie_cbCategory, 0, 176, Short.MAX_VALUE)
							.addGap(278))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
								.addComponent(tbMovie_lbTitle)
								.addGroup(gl_pnMovie.createSequentialGroup()
									.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
										.addComponent(tbMovie_cbMinAge, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
										.addComponent(pnMovie_lbMinAge))
									.addGap(18)
									.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnMovie.createSequentialGroup()
											.addGap(81)
											.addComponent(pnMovie_title))
										.addGroup(gl_pnMovie.createSequentialGroup()
											.addComponent(tbMovie_cbTimeHr, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tbMovie_cbTimeMin, 0, 48, Short.MAX_VALUE))
										.addComponent(lblNewLabel_9)))
								.addComponent(tbMovie_tfTitle2, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addComponent(pnMovie_lbCategory))
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_pnMovie.createSequentialGroup()
									.addGap(14)
									.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnMovie.createSequentialGroup()
											.addGap(10)
											.addComponent(tbMovie_lbDescription))
										.addGroup(gl_pnMovie.createSequentialGroup()
											.addComponent(tbMovie_btnCancel)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(tbMovie_btnConfirm))))
								.addGroup(gl_pnMovie.createSequentialGroup()
									.addGap(18)
									.addComponent(tbMovie_taDescription)))
							.addContainerGap())))
		);
		gl_pnMovie.setVerticalGroup(
			gl_pnMovie.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMovie.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addComponent(pnMovie_title)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tbMovie_lbTitle))
						.addComponent(tbMovie_lbDescription))
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGap(4)
							.addComponent(tbMovie_tfTitle2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
								.addComponent(pnMovie_lbMinAge)
								.addComponent(lblNewLabel_9))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbMovie_cbMinAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel)
								.addComponent(tbMovie_cbTimeHr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbMovie_cbTimeMin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbMovie_taDescription, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnMovie.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGap(11)
							.addComponent(pnMovie_lbCategory)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbMovie_cbCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(37, Short.MAX_VALUE))
						.addGroup(gl_pnMovie.createSequentialGroup()
							.addGroup(gl_pnMovie.createParallelGroup(Alignment.BASELINE)
								.addComponent(tbMovie_btnConfirm)
								.addComponent(tbMovie_btnCancel))
							.addContainerGap())))
		);
		pnMovie.setLayout(gl_pnMovie);
		
		
		frame.getContentPane().add(tbPanel);
		
		JPanel pnSession = new JPanel();
		tbPanel.addTab("New tab", null, pnSession, null);
		
		JLabel label = new JLabel("Title");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel label_1 = new JLabel("Min. Age");
		
		JButton button = new JButton("Cancel");
		
		JButton button_1 = new JButton("Confirm");
		
		JLabel label_2 = new JLabel("Description");
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setEditable(false);
		
		JLabel label_3 = new JLabel("Category");
		
		JLabel label_4 = new JLabel("Make movie");
		
		JLabel tbSession_tirile = new JLabel("New label");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		
		JComboBox tbSession_cbRoom = new JComboBox();
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
		JComboBox tbSession_cbMovie = new JComboBox();
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		
		tbSession_tfId = new JTextField();
		tbSession_tfId.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		JSpinner tbSession_spLotation = new JSpinner();
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		
		JComboBox tbSession_cbDay = new JComboBox();
		
		JComboBox tbSession_cbMounth = new JComboBox();
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		
		JComboBox tbSession_cbYear = new JComboBox();
		
		JButton tbSession_btnCancel = new JButton("New button");
		
		JButton tbSession_btnConfirm = new JButton("New button");
		GroupLayout gl_pnSession = new GroupLayout(pnSession);
		gl_pnSession.setHorizontalGroup(
			gl_pnSession.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnSession.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnSession.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnSession.createSequentialGroup()
							.addGroup(gl_pnSession.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(tbSession_cbRoom, GroupLayout.PREFERRED_SIZE, 169, GroupLayout.PREFERRED_SIZE))
							.addGap(29)
							.addGroup(gl_pnSession.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel_7, Alignment.LEADING)
								.addComponent(lblNewLabel_6, Alignment.LEADING)
								.addComponent(lblNewLabel_5, Alignment.LEADING)
								.addComponent(tbSession_tirile, Alignment.LEADING)
								.addComponent(tbSession_spLotation, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
								.addComponent(tbSession_cbDay, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tbSession_cbYear, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addGroup(gl_pnSession.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(tbSession_cbMovie, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tbSession_tfId, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
							.addGap(130)))
					.addGap(18)
					.addComponent(tbSession_cbMounth, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(65, Short.MAX_VALUE))
				.addGroup(gl_pnSession.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(tbSession_btnCancel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(tbSession_btnConfirm)
					.addContainerGap())
		);
		gl_pnSession.setVerticalGroup(
			gl_pnSession.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnSession.createSequentialGroup()
					.addContainerGap()
					.addComponent(tbSession_tirile)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_tfId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbSession_spLotation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_cbMovie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbSession_cbDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbSession_cbMounth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_7))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_cbRoom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbSession_cbYear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_btnConfirm)
						.addComponent(tbSession_btnCancel))
					.addContainerGap())
		);
		pnSession.setLayout(gl_pnSession);
		
		// povoamento
		// TODO criar tipode categoria para ter um label
		ageList.add(0);
		ageList.add(10);
		ageList.add(13);
		ageList.add(16);
		ageList.add(18);
		for (Integer age : ageList) {
			if (!(age.toString().equals("0"))) {				
				tbMovie_cbMinAge.addItem(age.toString() + " Anos");
			} else {				
				tbMovie_cbMinAge.addItem("Livre");
			}
		}
		
		categoryList.add("Drama");
		categoryList.add("Terror");
		categoryList.add("Vimgadores");
		categoryList.add("Filme pirata");
		for (String category : categoryList) {
			tbMovie_cbCategory.addItem(category);
		}
//		
//		for (Room room : roomList) {
//			tbSession_cbRoom.addItem(room);
//		}
//		
//		for (Movie movie : movieList) {
//			tbSession_cbMovie.addItem(movie.getTitle());
//		}
//		//
		for (int i = 0; i <= 59; i++) {
			minList.add(i);
		}
//		
		for (int i = 0; i <= 23; i++) {
			hourList.add(i);
		}
		
		for (int i = 0; i <= 12; i++) {
			mounthList.add(i);
		}
		
		for (int i = 0; i <= 31; i++) {
			dayList.add(i);
		}
		
		for (Integer object : mounthList) {
			tbSession_cbMounth.addItem(object);
		}
		
		for (Integer object : hourList) {
			tbMovie_cbTimeHr.addItem(object);
		}

		for (Integer object : minList) {
			tbMovie_cbTimeMin.addItem(object);
		}
		
//		// array de tfild
//		tbRoom_tf.add(tbRoom_tfID);
//		
		
		
		// events 
		btnSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedComponent(pnSession);
			}
		});
		
		btnRoon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(0);
			}
		});
		btnMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(1);
			}
		});
		
		btnSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPanel.setSelectedIndex(2);
			}
		});
		
		tbRoom_btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (JTextField tf : tbRoom_tf) {
					tf.setText("");
				}
			}
		});
		tbRoon_cbPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = 0;
				if (tbRoon_cbPrice.isSelected()) {
					tbRoom_spPrice.setEnabled(false);
					if (tbRoon_rdTypeNormal.isSelected()) {
						tbRoom_spPrice.setValue(25);
					} else if (tbRoon_rdTypr3d.isSelected()) {
						tbRoom_spPrice.setValue(30);
					}
				} else {
					tbRoom_spPrice.setValue(0);
					tbRoom_spPrice.setEnabled(true);
				}
			}
		});
		
		tbRoon_rdTypeNormal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tbRoon_cbPrice.isSelected()) {
					tbRoom_spPrice.setValue(25);
				}
			}
		});
		
		tbRoon_rdTypr3d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tbRoon_cbPrice.isSelected()) {
					tbRoom_spPrice.setValue(30);
				}
			}
		});
		
		tbMovie_btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String hr = tbMovie_cbTimeHr.getSelectedItem().toString();
				String min = tbMovie_cbTimeMin.getSelectedItem().toString();
				if (hr.length() < 2) {					
					hr = "0"+hr;
				}
				if (min.length() < 2) {					
					min = "0"+min;
				}
				String time = hr+":"+min;
//				Movie mv = new Movie(LocalTime.parse(time), tbMovie_tfTitle2.getText() , tbMovie_taDescription.getText());
//				movieList.add(mv);
				
//				for (Movie obj : movieList) {
//					tbSession_cbMovie.addItem(obj);
//				}
			}
		});

		
	}	
}
