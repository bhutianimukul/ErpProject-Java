package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.UserLogin;
import Login.Home;
import MainPage.StudentMainPage;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Dues extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dues frame = new Dues("1815663");
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
	public Dues(String rollno) {
		UserLogin u = new UserLogin();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 556, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 38, 172, 371);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentMainPage(rollno).setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(22, 31, 128, 35);
		panel_1.add(btnNewButton_1);

		JButton btnInformatio = new JButton("INFORMATION");
		btnInformatio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Information(rollno).setVisible(true);
				dispose();
			}
		});
		btnInformatio.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnInformatio.setBounds(10, 95, 152, 35);
		panel_1.add(btnInformatio);

		JButton btnChangePassword = new JButton("SETTINGS");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Setting(rollno).setVisible(true);
				dispose();
			}
		});
		btnChangePassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnChangePassword.setBounds(10, 218, 152, 35);
		panel_1.add(btnChangePassword);

		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home().setVisible(true);
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnLogOut.setBounds(10, 277, 152, 35);
		panel_1.add(btnLogOut);

		JButton btnAttendence = new JButton("ATTENDENCE");
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentAttendence(rollno).setVisible(true);
				dispose();
			}
		});
		btnAttendence.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnAttendence.setBounds(10, 159, 152, 35);
		panel_1.add(btnAttendence);

		JLabel lblYourDues = new JLabel("Your Dues");
		lblYourDues.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblYourDues.setBounds(210, 108, 99, 31);
		contentPane.add(lblYourDues);

		textField = new JTextField();
		textField.setText(u.prevDues(rollno));
		textField.setEditable(false);
		textField.setBounds(280, 149, 151, 25);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(u.prevDues(rollno));
			}
		});
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_2.setBounds(299, 207, 105, 31);
		contentPane.add(btnNewButton_2);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setBounds(0, 0, 556, 37);
		contentPane.add(panel);

		JLabel label = new JLabel("  X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(522, 11, 33, 22);
		panel.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Dues.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(479, 11, 33, 22);
		panel.add(label_1);

		JLabel lblDues = new JLabel("DUES");
		lblDues.setForeground(new Color(135, 206, 235));
		lblDues.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblDues.setBounds(255, 12, 73, 20);
		panel.add(lblDues);

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
