package MainPage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Faculty.Attendence;
import Faculty.Debard;
import Login.TeacherLogin;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class TeacherMainPage1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherMainPage1 frame = new TeacherMainPage1();
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
	public TeacherMainPage1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 438);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnAttendence = new JButton("");
		btnAttendence.setIcon(new ImageIcon(TeacherMainPage1.class.getResource("/images/attendence1.png")));
		btnAttendence.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new Attendence().setVisible(true);
			dispose();
			}
		});
		btnAttendence.setBounds(114, 108, 72, 72);
		panel.add(btnAttendence);
		
		JButton btnSettings = new JButton("");
		btnSettings.setIcon(new ImageIcon(TeacherMainPage1.class.getResource("/images/setting.png")));
		btnSettings.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSettings.setBounds(347, 108, 72, 72);
		panel.add(btnSettings);
		
		JLabel label_1 = new JLabel("Attendence");
		label_1.setBounds(114, 191, 93, 26);
		label_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		panel.add(label_1);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setBounds(347, 191, 72, 26);
		lblSettings.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		panel.add(lblSettings);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 644, 37);
		panel.add(panel_1);
		
		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 0, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(522, 11, 33, 22);
		panel_1.add(label);
		
		JLabel label_2 = new JLabel("  -");
		label_2.setForeground(new Color(135, 206, 250));
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(TeacherMainPage1.ICONIFIED);
			}
		});
		label_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_2.setBounds(479, 11, 33, 22);
		panel_1.add(label_2);
		
		JLabel lblDashboardteacher = new JLabel("DASHBOARD-TEACHER");
		lblDashboardteacher.setForeground(new Color(135, 206, 235));
		lblDashboardteacher.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblDashboardteacher.setBounds(146, 12, 271, 20);
		panel_1.add(lblDashboardteacher);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Debard().setVisible(true);
				dispose();
			}
		});
		button_4.setIcon(new ImageIcon(TeacherMainPage1.class.getResource("/images/Attendence.png")));
		button_4.setBounds(114, 244, 72, 72);
		panel.add(button_4);
		
		JLabel lblDebardStudent = new JLabel("Debard Student");
		lblDebardStudent.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblDebardStudent.setBounds(96, 327, 132, 26);
		panel.add(lblDebardStudent);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(TeacherMainPage1.class.getResource("/images/logout.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TeacherLogin().setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		button.setBounds(347, 245, 72, 72);
		panel.add(button);
		
		JLabel lblLogOut = new JLabel("Log out");
		lblLogOut.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblLogOut.setBounds(347, 327, 72, 26);
		panel.add(lblLogOut);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
