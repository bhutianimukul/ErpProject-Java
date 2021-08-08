package Login;

import Database.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.JPasswordField;

import javax.swing.JButton;
import javax.swing.JCheckBox;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JPasswordField passwordField;
	public static String otp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					// frame.setUndecorated(true);
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
	public Home() {
		UserLogin u = new UserLogin();
		setTitle("Student Login");
		setBackground(Color.WHITE);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 42, 360, 487);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblT = new JLabel("STUDENT LOGIN");
		lblT.setForeground(new Color(144, 238, 144));
		lblT.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 25));
		lblT.setBounds(72, 31, 223, 45);
		lblT.setBackground(Color.CYAN);
		panel.add(lblT);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/images/student1.jpg")));
		lblNewLabel.setBounds(10, 97, 340, 212);
		panel.add(lblNewLabel);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(189, 163, 49, 14);
		panel.add(label_2);

		JLabel lblAcceptFailureAs = new JLabel("There is no elevator to success.");
		lblAcceptFailureAs.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblAcceptFailureAs.setBounds(54, 342, 255, 33);
		panel.add(lblAcceptFailureAs);

		JLabel lblYouHaveTo = new JLabel("You have to take the stairs.");
		lblYouHaveTo.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblYouHaveTo.setBounds(72, 386, 223, 33);
		panel.add(lblYouHaveTo);

		JLabel lblzigZiglar = new JLabel(" \u2014Zig Ziglar");
		lblzigZiglar.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblzigZiglar.setBounds(241, 432, 109, 33);
		panel.add(lblzigZiglar);

		Button button = new Button("Login");
		button.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0, 102, 255));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				otp = SendEmail.generateOtp();
				u.getinfo(usertext.getText(), "studentinfo");
				String gmail = u.getGmailId();
				new SendEmail().sendOtp(gmail, otp);

				if (u.check(usertext, passwordField, "studentlogin")) {
					new Otp(usertext.getText()).setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Either the userid or the password is incorrect");

				}
			}
		});
		button.setBounds(464, 445, 166, 48);
		contentPane.add(button);

		usertext = new JTextField();
		usertext.setBounds(405, 261, 288, 33);
		contentPane.add(usertext);
		usertext.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(764, 211, -325, 2);
		contentPane.add(separator);

		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		lblUserName.setBounds(370, 224, 139, 33);
		contentPane.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		lblPassword.setBounds(370, 305, 139, 33);
		contentPane.add(lblPassword);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Home.class.getResource("/images/college1.jpg")));
		lblNewLabel_1.setBounds(358, 37, 367, 130);
		contentPane.add(lblNewLabel_1);

		passwordField = new JPasswordField();
		passwordField.setBounds(405, 349, 288, 33);
		contentPane.add(passwordField);

		JCheckBox showchkbox = new JCheckBox("show Pass");
		showchkbox.setBounds(510, 389, 82, 23);
		contentPane.add(showchkbox);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 727, 41);
		contentPane.add(panel_1);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 0, 0));
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setBounds(678, 11, 33, 22);
		panel_1.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(635, 11, 33, 22);
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Main.ICONIFIED);
			}
		});
		panel_1.add(label_1);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Home.class.getResource("/images/r.png")));
		btnNewButton.setBounds(10, 5, 33, 33);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		showchkbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (showchkbox.isSelected()) {
					passwordField.setEchoChar((char) 0);
				} else
					passwordField.setEchoChar('*');
			}
		});

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
