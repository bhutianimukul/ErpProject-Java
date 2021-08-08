package MainPage;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Login.Home;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Student.*;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
public class StudentMainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMainPage frame = new StudentMainPage("1815663");
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
	public StudentMainPage(String rollno) {
		
		setUndecorated(true);
		setTitle("Student");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 445);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(64, 224, 208));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(StudentMainPage.class.getResource("/images/ic_launcher.png")));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Information(rollno).setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(175, 119, 72, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(StudentMainPage.class.getResource("/images/Attendence.png")));
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentAttendence(rollno).setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(363, 119, 72, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(StudentMainPage.class.getResource("/images/dues.png")));
		btnNewButton_3.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Dues(rollno).setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(282, 264, 72, 72);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(StudentMainPage.class.getResource("/images/setting.png")));
		btnNewButton_5.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Setting(rollno).setVisible(true);
				dispose();
			}
		});
		btnNewButton_5.setBounds(117, 264, 72, 72);
		contentPane.add(btnNewButton_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 600, 37);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 0, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(554, 11, 33, 22);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(StudentMainPage.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(511, 11, 33, 22);
		panel_1.add(label_1);
		
		JLabel lblDashboardstudent = new JLabel("DASHBOARD-STUDENT");
		lblDashboardstudent.setForeground(new Color(135, 206, 235));
		lblDashboardstudent.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblDashboardstudent.setBounds(177, 11, 271, 20);
		panel_1.add(lblDashboardstudent);
		
		JButton btnLogOut = new JButton("");
		btnLogOut.setIcon(new ImageIcon(StudentMainPage.class.getResource("/images/logout.png")));
		btnLogOut.setBounds(439, 264, 72, 72);
		contentPane.add(btnLogOut);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new Home().setVisible(true);
				dispose();
				
			}
		});
		btnLogOut.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblInformation = new JLabel("Information");
		lblInformation.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblInformation.setBounds(162, 202, 109, 27);
		contentPane.add(lblInformation);
		
		JLabel lblAttendence = new JLabel("Attendence");
		lblAttendence.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblAttendence.setBounds(348, 202, 109, 27);
		contentPane.add(lblAttendence);
		
		JLabel lblDues = new JLabel("Dues");
		lblDues.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblDues.setBounds(292, 347, 53, 27);
		contentPane.add(lblDues);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblSettings.setBounds(117, 347, 72, 27);
		contentPane.add(lblSettings);
		
		JLabel lblLogOut = new JLabel("Log out");
		lblLogOut.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblLogOut.setBounds(439, 347, 72, 27);
		contentPane.add(lblLogOut);
		
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
