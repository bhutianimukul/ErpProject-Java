package Student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import Database.UserLogin;
import Login.Home;
import Login.Main;
import MainPage.StudentMainPage;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTable;
import java.awt.ScrollPane;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentAttendence extends JFrame {

	private JPanel contentPane;
	private JTextField totaldaystext;
	private JTextField presentdaystext;
	private JTable presenttable;
	private JTable absenttable;
	DefaultTableModel model;
	DefaultTableModel model1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentAttendence frame = new StudentAttendence("1815663");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentAttendence(String rollno) {
		UserLogin u=new UserLogin();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 474);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setBounds(0, 0, 788, 42);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("  X");
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setBounds(729, 15, 33, 22);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("  -");
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(657, 15, 33, 22);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Main.ICONIFIED);
			}
		});
		panel_2.add(label_1);
		
		JLabel lblStudentattendece = new JLabel("STUDENT-ATTENDECE");
		lblStudentattendece.setForeground(new Color(135, 206, 235));
		lblStudentattendece.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblStudentattendece.setBounds(256, 11, 239, 20);
		panel_2.add(lblStudentattendece);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 42, 172, 432);
		contentPane.add(panel_1);
		
		JButton button = new JButton("HOME");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentMainPage(rollno).setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button.setBounds(23, 58, 128, 35);
		panel_1.add(button);
		
		JButton button_2 = new JButton("INFORMATION");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Information(rollno).setVisible(true);
				dispose();
			}
		});
		button_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_2.setBounds(10, 132, 152, 35);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("DUES");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Dues(rollno).setVisible(true);
				dispose();
			}
		});
		button_3.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_3.setBounds(10, 276, 152, 35);
		panel_1.add(button_3);
		
		JButton button_5 = new JButton("LOG OUT");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home().setVisible(true);
				   dispose();
			}
		});
		button_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_5.setBounds(10, 343, 152, 35);
		panel_1.add(button_5);
		
		JButton btnAttendence = new JButton("SETTINGS");
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Setting(rollno).setVisible(true);
				dispose();
			}
		});
		btnAttendence.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnAttendence.setBounds(10, 205, 152, 35);
		panel_1.add(btnAttendence);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblStartDate.setBounds(198, 78, 89, 21);
		contentPane.add(lblStartDate);
		
		JLabel lblTotalPresentDays = new JLabel("Total Present days");
		lblTotalPresentDays.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblTotalPresentDays.setBounds(469, 148, 159, 21);
		contentPane.add(lblTotalPresentDays);
		
		JLabel lblTotalDays = new JLabel("Total Days");
		lblTotalDays.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblTotalDays.setBounds(182, 148, 108, 21);
		contentPane.add(lblTotalDays);
		
		
		
		totaldaystext = new JTextField();
		totaldaystext.setEditable(false);
		totaldaystext.setColumns(10);
		totaldaystext.setBounds(300, 149, 133, 21);
		
		
		
		
		contentPane.add(totaldaystext);
		
		presentdaystext = new JTextField();
		presentdaystext.setEditable(false);
		presentdaystext.setColumns(10);
		presentdaystext.setBounds(638, 149, 108, 21);
		 
		contentPane.add(presentdaystext);
		
		JDateChooser startdatetext = new JDateChooser();
		
		startdatetext.setBounds(297, 79, 133, 20);
		contentPane.add(startdatetext);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblEndDate.setBounds(469, 78, 89, 21);
		contentPane.add(lblEndDate);
		
		JDateChooser enddatetext = new JDateChooser();
		enddatetext.setBounds(568, 79, 133, 20);
		contentPane.add(enddatetext);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 207, 205, 239);
		contentPane.add(scrollPane);
		
		presenttable = new JTable();
		model=new DefaultTableModel();
		Object[] column = {"Present Days"};
		model.setColumnIdentifiers(column);
		presenttable.setModel(model);
		
		scrollPane.setViewportView(presenttable);
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(481, 207, 220, 239);
		contentPane.add(scrollPane_1);
		
		absenttable = new JTable();
		
		Object[] column1 = {"Absent Days"};
		
		model1=new DefaultTableModel();
		model1.setColumnIdentifiers(column1);
		absenttable.setModel(model1);
		scrollPane_1.setViewportView(absenttable);
		
		

		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 String  dob= startdatetext.getDate().toString();
				 String  dob1= enddatetext.getDate().toString();
				 if(dob==null||dob1==null)
					 JOptionPane.showMessageDialog(null,"Select date first");
				 	 
				 
					dob=dob.substring(4,10)+", "+dob.substring(24, 28);
					dob1=dob1.substring(4,10)+", "+dob1.substring(24, 28);
					ArrayList<ArrayList<String>> l=u.getAttendence(rollno, dob, dob1);
					ArrayList<String> present=l.get(0);
					ArrayList<String> absent=l.get(1);
					
					totaldaystext.setText(Integer.toString(present.size()+absent.size()));
					presentdaystext.setText(Integer.toString(present.size()));
					
					for(String i:present)
					{   Object[] row=new Object[1];
					row[0]=i;
						model.addRow(row);
					}
					for(String i:absent)
					{
						Object[] row=new Object[1];
						row[0]=i;
						model1.addRow(row);
					}
					
				
			}
		});
		btnConfirm.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnConfirm.setBounds(397, 114, 97, 23);
		contentPane.add(btnConfirm);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
