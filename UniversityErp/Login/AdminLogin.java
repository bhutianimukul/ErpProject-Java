package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.SendEmail;
import Database.UserLogin;
import MainPage.AdministratorMainStd;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 712, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 717, 518);
		contentPane.add(panel);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(AdminLogin.class.getResource("/images/college1.jpg")));
		label_1.setBounds(340, 37, 367, 137);
		panel.add(label_1);

		JLabel label_2 = new JLabel("User Name");
		label_2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		label_2.setBounds(355, 209, 88, 28);
		panel.add(label_2);

		usertext = new JTextField();
		usertext.setColumns(10);
		usertext.setBounds(382, 243, 276, 36);
		panel.add(usertext);

		JSeparator separator = new JSeparator();
		separator.setBounds(557, 290, 1, 2);
		panel.add(separator);

		JLabel label_3 = new JLabel("Password");
		label_3.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		label_3.setBounds(355, 295, 88, 22);
		panel.add(label_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(382, 328, 276, 36);
		panel.add(passwordField);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(594, 401, 1, 2);
		panel.add(separator_1);

		JButton button = new JButton("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (new UserLogin().check(usertext, passwordField, "adminlogin")) {
					JOptionPane.showMessageDialog(null, "Login Successfull");
					new AdministratorMainStd().setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Either the userid or the password is incorrect");

				}

				otp = SendEmail.generateOtp();

			}
		});
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(459, 433, 136, 36);
		panel.add(button);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(0, 37, 341, 481);
		panel.add(panel_1);

		JLabel lblAdministratorLogin = new JLabel("ADMINISTRATOR LOGIN");
		lblAdministratorLogin.setForeground(new Color(152, 251, 152));
		lblAdministratorLogin.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 25));
		lblAdministratorLogin.setBounds(23, 11, 293, 65);
		panel_1.add(lblAdministratorLogin);

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(AdminLogin.class.getResource("/images/admin.png")));
		label_6.setBounds(49, 87, 225, 225);
		panel_1.add(label_6);

		JLabel lblBeSoGood = new JLabel("Be so good they can't ignore you.");
		lblBeSoGood.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblBeSoGood.setBounds(34, 359, 282, 33);
		panel_1.add(lblBeSoGood);

		JLabel lblsteveMartin = new JLabel("\u2014Steve Martin");
		lblsteveMartin.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblsteveMartin.setBounds(215, 400, 126, 33);
		panel_1.add(lblsteveMartin);

		JCheckBox showchkbox = new JCheckBox("Show Password");
		showchkbox.setBackground(Color.CYAN);
		showchkbox.setBounds(471, 382, 124, 21);
		panel.add(showchkbox);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setBounds(0, 0, 777, 37);
		panel.add(panel_2);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 0, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(668, 11, 33, 22);
		panel_2.add(label);

		JLabel label_4 = new JLabel("  -");
		label_4.setForeground(new Color(135, 206, 250));
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(AdminLogin.ICONIFIED);
			}
		});
		label_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_4.setBounds(625, 11, 33, 22);
		panel_2.add(label_4);

		JLabel label_5 = new JLabel("TEACHER-ATTENDENCE");
		label_5.setForeground(new Color(135, 206, 235));
		label_5.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));
		label_5.setBounds(181, 6, 359, 31);
		panel_2.add(label_5);

		JButton btnBack = new JButton("");
		btnBack.setIcon(new ImageIcon(AdminLogin.class.getResource("/images/r.png")));
		btnBack.setBounds(10, 2, 33, 33);
		panel_2.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main().setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 0, 0));
		btnBack.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
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
