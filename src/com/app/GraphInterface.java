package com.app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Vector;

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
	public ArrayList<Room> roomList = new ArrayList();
	public ArrayList<Session> sessionList = new ArrayList();
	public ArrayList<Movie> movieList = new ArrayList();
	public ArrayList<Ticket> ticketList = new ArrayList();
	public ArrayList<Integer> ageList = new ArrayList();
	public ArrayList<String> categoryList = new ArrayList();
	public ArrayList<JTextField> tbRoom_tf = new ArrayList();
	public ArrayList<JSpinner> tbRoom_sp = new ArrayList();
	public ArrayList<JButton> btnMenu = new ArrayList();
	private ButtonGroup btgType = new ButtonGroup();
	private JComboBox tbSession_cbMovie;
	/**
	 * Launch the application.
	 */
	private Component tbMovie_tfTitle;
	private JTextField textField;
	private JTextField textField_1;
	
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
		
		btnSession.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JPanel tbMovie_title = new JPanel();
		tbPanel.addTab("Movie", null, tbMovie_title, null);
		
		JLabel pnMovie_title = new JLabel("Make movie");
		
		JLabel tbMovie_lbTitle = new JLabel("Title");
		
		JTextField tbMovie_tfTitle = new JTextField();
		tbMovie_tfTitle.setColumns(10);
		
		JLabel tbMovie_lbDescription = new JLabel("Description");
		
		JLabel tbMovie_lbCategory = new JLabel("Category");
		
		JComboBox tbMovie_cbCategory = new JComboBox();
		tbMovie_cbCategory.setModel(new DefaultComboBoxModel(vectorPesawat));
		tbMovie_cbCategory.setSelectedIndex(-1);
		tbMovie_cbCategory.setEditable(true);
		JTextField text = (JTextField)tbMovie_cbCategory.getEditor().getEditorComponent();
		text.setFocusable(true);
		text.setText("");
		text.addKeyListener(new ComboListener(tbMovie_cbCategory,vectorPesawat));
		tbMovie_cbCategory.setBounds(144, 56, 165, 24);
		pnRoom.add(tbMovie_cbCategory);
		
		JLabel tbMovie_lbMinAge = new JLabel("Min. Age");
		
		JButton tbMovie_btnCancel = new JButton("Cancel");
		
		JButton tbMovie_btnConfirm = new JButton("Confirm");
		
		
		JTextArea tbMovie_taDescription = new JTextArea();
		
		JComboBox tbMovie_cbMinAg = new JComboBox();
		Vector vectorPesawattbMovie_cbMinAg = new Vector();
        tbMovie_cbMinAg = new JComboBox();
		tbMovie_cbMinAg.setModel(new DefaultComboBoxModel(vectorPesawattbMovie_cbMinAg));
		tbMovie_cbMinAg.setSelectedIndex(-1);
		tbMovie_cbMinAg.setEditable(true);
		JTextField texttbMovie_cbMinAg = (JTextField)tbMovie_cbMinAg.getEditor().getEditorComponent();
		texttbMovie_cbMinAg.setFocusable(true);
		texttbMovie_cbMinAg.setText("");
		texttbMovie_cbMinAg.addKeyListener(new ComboListener(tbMovie_cbMinAg,vectorPesawattbMovie_cbMinAg));
		tbMovie_cbMinAg.setBounds(144, 56, 165, 24);
		pnRoom.add(tbMovie_cbMinAg);

		
		GroupLayout gl_tbMovie_title = new GroupLayout(tbMovie_title);
		gl_tbMovie_title.setHorizontalGroup(
			gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tbMovie_title.createSequentialGroup()
					.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tbMovie_title.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_tbMovie_title.createSequentialGroup()
									.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING, false)
											.addComponent(tbMovie_lbTitle)
											.addComponent(tbMovie_tfTitle, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
										.addComponent(tbMovie_lbMinAge)
										.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(tbMovie_cbCategory, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(tbMovie_cbMinAg, Alignment.LEADING, 0, 197, Short.MAX_VALUE)))
									.addGap(30)
									.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_tbMovie_title.createSequentialGroup()
											.addComponent(tbMovie_btnCancel)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(tbMovie_btnConfirm))
										.addComponent(tbMovie_lbDescription)
										.addComponent(tbMovie_taDescription, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
								.addComponent(tbMovie_lbCategory)))
						.addGroup(gl_tbMovie_title.createSequentialGroup()
							.addGap(191)
							.addComponent(pnMovie_title)))
					.addContainerGap())
		);
		gl_tbMovie_title.setVerticalGroup(
			gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tbMovie_title.createSequentialGroup()
					.addGap(18)
					.addComponent(pnMovie_title)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbMovie_lbTitle)
						.addComponent(tbMovie_lbDescription))
					.addGap(18)
					.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tbMovie_title.createSequentialGroup()
							.addComponent(tbMovie_tfTitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbMovie_lbMinAge)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbMovie_cbMinAg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(tbMovie_lbCategory))
						.addComponent(tbMovie_taDescription, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_tbMovie_title.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbMovie_cbCategory, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tbMovie_btnCancel)
						.addComponent(tbMovie_btnConfirm))
					.addGap(183))
		);
		tbMovie_title.setLayout(gl_tbMovie_title);
		
		JPanel pnSession = new JPanel();
		tbPanel.addTab("Sessions", null, pnSession, null);
		
		JLabel tbSession_title = new JLabel("New label");
		
		JLabel tbSession_lbMovie = new JLabel("New label");
		
		tbSession_cbMovie = new JComboBox();
		tbSession_cbMovie.setAutoscrolls(true);
		Vector vectorPesawattbSession_cbMovie = new Vector();
        tbSession_cbMovie = new JComboBox();
		tbSession_cbMovie.setModel(new DefaultComboBoxModel(vectorPesawattbSession_cbMovie));
		tbSession_cbMovie.setSelectedIndex(-1);
		tbSession_cbMovie.setEditable(true);
		JTextField texttbSession_cbMovie = (JTextField)tbSession_cbMovie.getEditor().getEditorComponent();
		texttbSession_cbMovie.setFocusable(true);
		texttbSession_cbMovie.setText("");
		texttbSession_cbMovie.addKeyListener(new ComboListener(tbSession_cbMovie,vectorPesawattbSession_cbMovie));
		tbSession_cbMovie.setBounds(144, 56, 165, 24);
		pnRoom.add(tbSession_cbMovie);

		
		JLabel lblNewLabel_2 = new JLabel("New label");
		
		JComboBox tbSession_cbRoom = new JComboBox();
		Vector vectorPesawattbSession_cbRoom = new Vector();
        tbSession_cbRoom = new JComboBox();
		tbSession_cbRoom.setModel(new DefaultComboBoxModel(vectorPesawattbSession_cbRoom));
		tbSession_cbRoom.setSelectedIndex(-1);
		tbSession_cbRoom.setEditable(true);
		JTextField texttbSession_cbRoom = (JTextField)tbSession_cbRoom.getEditor().getEditorComponent();
		texttbSession_cbRoom.setFocusable(true);
		texttbSession_cbRoom.setText("");
		texttbSession_cbRoom.addKeyListener(new ComboListener(tbSession_cbRoom,vectorPesawattbSession_cbRoom));
		tbSession_cbRoom.setBounds(144, 56, 165, 24);
		pnRoom.add(tbSession_cbRoom);

		
		JLabel lblNewLabel_3 = new JLabel("New label");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		
		JSpinner spinner = new JSpinner();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		
		JButton btnNewButton_1 = new JButton("New button");
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		GroupLayout gl_pnSession = new GroupLayout(pnSession);
		gl_pnSession.setHorizontalGroup(
			gl_pnSession.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnSession.createSequentialGroup()
					.addGroup(gl_pnSession.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnSession.createSequentialGroup()
							.addGap(196)
							.addComponent(tbSession_title))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addContainerGap()
							.addComponent(tbSession_lbMovie))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnSession.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(tbSession_cbRoom, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tbSession_cbMovie, Alignment.LEADING, 0, 201, Short.MAX_VALUE)))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_pnSession.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_3)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnSession.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4))))
					.addGroup(gl_pnSession.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnSession.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton))
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5)
						.addComponent(chckbxNewCheckBox))
					.addGap(26))
		);
		gl_pnSession.setVerticalGroup(
			gl_pnSession.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnSession.createSequentialGroup()
					.addContainerGap()
					.addComponent(tbSession_title)
					.addGap(18)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_lbMovie)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(tbSession_cbMovie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(chckbxNewCheckBox))
					.addGroup(gl_pnSession.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnSession.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tbSession_cbRoom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_6))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(34, Short.MAX_VALUE))
						.addGroup(gl_pnSession.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnSession.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton)
								.addComponent(btnNewButton_1))
							.addContainerGap())))
		);
		pnSession.setLayout(gl_pnSession);
		
		JPanel panel_3 = new JPanel();
		tbPanel.addTab("New tab", null, panel_3, null);
		frame.getContentPane().add(tbPanel);
		
		// povoamento
		// TODO criar tipode categoria para ter um label
		ageList.add(0);
		ageList.add(10);
		ageList.add(13);
		ageList.add(16);
		ageList.add(18);
		for (Integer age : ageList) {
			if (!(age.toString().equals("0"))) {				
				tbMovie_cbMinAg.addItem(age.toString() + " Anos");
			} else {				
				tbMovie_cbMinAg.addItem("Livre");
			}
		}
		
		categoryList.add("Drama");
		categoryList.add("Terror");
		categoryList.add("Vimgadores");
		categoryList.add("Filme pirata");
		for (String category : categoryList) {
			tbMovie_cbCategory.addItem(category);
		}
		
		for (Room room : roomList) {
			tbSession_cbRoom.addItem(room);
		}
		
		for (Movie movie : movieList) {
			tbSession_cbMovie.addItem(movie.getTitle());
		}
		
		
		// array de tfild
		tbRoom_tf.add(tbRoom_tfID);
		
		// events 
		
		pnSession.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				for (Movie movie : movieList) {
					tbSession_cbMovie.addItem(movie.getTitle());
				}
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
			public void actionPerformed(ActionEvent e) {
				Movie mv = new Movie(LocalTime.parse("02:30"), tbMovie_tfTitle.getText(), tbMovie_taDescription.getText());
				movieList.add(mv);
				System.out.println(mv.toString());
				cbUpdateMovie(movieList,tbSession_cbMovie);
			}
		});
		
	}	
	
}
