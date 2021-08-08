package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Database.UserLogin;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import MainPage.*;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TeacherLogin extends JFrame {

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
					TeacherLogin frame = new TeacherLogin();
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
	public TeacherLogin() {
		UserLogin u = new UserLogin();

		setTitle("Teacher Login");
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 502);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 37, 353, 465);
		panel.setBackground(new Color(224, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("TEACHER LOGIN");
		lblNewLabel.setForeground(new Color(152, 251, 152));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(74, 29, 220, 65);
		panel.add(lblNewLabel);

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(TeacherLogin.class.getResource("/images/teacher.png")));
		label_3.setBounds(55, 105, 225, 224);
		panel.add(label_3);

		JLabel lblEvertExpertWas = new JLabel("Evert expert was once a beginner.");
		lblEvertExpertWas.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblEvertExpertWas.setBounds(27, 349, 291, 33);
		panel.add(lblEvertExpertWas);

		JLabel lblhelenHayes = new JLabel("\u2014Helen Hayes");
		lblhelenHayes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblhelenHayes.setBounds(220, 385, 126, 33);
		panel.add(lblhelenHayes);

		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(363, 220, 88, 28);
		contentPane.add(lblNewLabel_2);

		usertext = new JTextField();
		usertext.setBounds(406, 259, 277, 36);
		contentPane.add(usertext);
		usertext.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(557, 290, 1, 2);
		contentPane.add(separator);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(363, 306, 88, 22);
		contentPane.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(406, 339, 277, 36);
		contentPane.add(passwordField);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(594, 401, 1, 2);
		contentPane.add(separator_1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (new UserLogin().check(usertext, passwordField, "FacultyLogin")) {
					new TeacherMainPage1().setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "incorrect");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setBounds(470, 414, 136, 36);
		contentPane.add(btnNewButton);

		JCheckBox showchkbox = new JCheckBox("Show Password");
		showchkbox.setBackground(Color.CYAN);
		showchkbox.setBounds(480, 382, 149, 23);
		contentPane.add(showchkbox);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 758, 37);
		contentPane.add(panel_1);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 69, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(669, 11, 33, 22);
		panel_1.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(TeacherLogin.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(626, 11, 33, 22);
		panel_1.add(label_1);

		JLabel lblTeacherlogin = new JLabel("TEACHER-LOGIN");
		lblTeacherlogin.setForeground(new Color(135, 206, 235));
		lblTeacherlogin.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));
		lblTeacherlogin.setBounds(239, 6, 243, 25);
		panel_1.add(lblTeacherlogin);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(TeacherLogin.class.getResource("/images/r.png")));
		btnNewButton_1.setBounds(10, 2, 33, 33);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(TeacherLogin.class.getResource("/images/college1.jpg")));
		label_2.setBounds(351, 37, 367, 131);
		contentPane.add(label_2);
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