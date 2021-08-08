package MainPage;
import Admin.*;
import Login.AdminLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class AdministratorMainStd extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministratorMainStd frame = new AdministratorMainStd();
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
	public AdministratorMainStd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 644, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 240));
		panel_1.setBounds(0, 36, 166, 431);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(AdministratorMainStd.class.getResource("/images/logout.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminLogin().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBounds(44, 220, 72, 72);
		panel_1.add(btnNewButton_1);
		
		JButton btnSettings = new JButton("");
		btnSettings.setIcon(new ImageIcon(AdministratorMainStd.class.getResource("/images/setting.png")));
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSettings.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		btnSettings.setBounds(44, 73, 72, 72);
		panel_1.add(btnSettings);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		lblSettings.setBounds(54, 156, 58, 25);
		panel_1.add(lblSettings);
		
		JLabel lblLogOut = new JLabel("Log out");
		lblLogOut.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		lblLogOut.setBounds(54, 292, 58, 25);
		panel_1.add(lblLogOut);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(AdministratorMainStd.class.getResource("/images/update.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new StudentChanges().setVisible(true);
			dispose();
			}
			
		});
		button.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		button.setBounds(247, 109, 72, 72);
		contentPane.add(button);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(AdministratorMainStd.class.getResource("/images/dues.png")));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentDues().setVisible(true);
				dispose();
			}
		});
		button_2.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		button_2.setBounds(460, 109, 72, 72);
		contentPane.add(button_2);
		
		JLabel lblNewLabel_1 = new JLabel("Update Student Information");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(196, 186, 214, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRemoveStudent = new JLabel("Dues Update");
		lblRemoveStudent.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		lblRemoveStudent.setBounds(460, 186, 94, 25);
		contentPane.add(lblRemoveStudent);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(AdministratorMainStd.class.getResource("/images/update.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TeacherChanges().setVisible(true);
				dispose();
			}
		});
		button_1.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 18));
		button_1.setBounds(339, 243, 72, 72);
		contentPane.add(button_1);
		
		JLabel lblUpdateFacultyInformation = new JLabel("Update Faculty Information");
		lblUpdateFacultyInformation.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		lblUpdateFacultyInformation.setBounds(291, 320, 214, 25);
		contentPane.add(lblUpdateFacultyInformation);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setBounds(0, 0, 644, 37);
		contentPane.add(panel_2);
		
		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 0, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(601, 11, 33, 22);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(AdministratorMainStd.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(553, 11, 33, 22);
		panel_2.add(label_1);
		
		JLabel lblAdministrator = new JLabel("ADMINISTRATOR");
		lblAdministrator.setForeground(new Color(135, 206, 235));
		lblAdministrator.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));
		lblAdministrator.setBounds(202, 6, 257, 31);
		panel_2.add(lblAdministrator);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
