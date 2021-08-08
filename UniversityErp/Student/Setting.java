package Student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import Database.UserLogin;
import Faculty.Attendence;
import Login.Home;
import MainPage.StudentMainPage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Setting extends JFrame {

	private JPanel contentPane;
	private JTextField prevtext;
	private JTextField newtext;
	private JTextField otptext;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField prevemailtext;
	private JTextField newemailtext;
	private JPasswordField passwordField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame = new Setting("1815663");
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
	public Setting(String rollno) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 683, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 38, 172, 426);
		panel.setLayout(null);
		panel.setBackground(new Color(224, 255, 255));
		contentPane.add(panel);
		
		JButton button = new JButton("HOME");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentMainPage(rollno).setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button.setBounds(23, 63, 128, 35);
		panel.add(button);
		
		JButton btnAttendence = new JButton("ATTENDENCE");
		btnAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentAttendence(rollno).setVisible(true);
				dispose();
			}
		});
		btnAttendence.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnAttendence.setBounds(10, 142, 152, 35);
		panel.add(btnAttendence);
		
		JButton btnSettings = new JButton("DUES");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Dues(rollno).setVisible(true);
				dispose();
			}
		});
		btnSettings.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnSettings.setBounds(10, 265, 152, 35);
		panel.add(btnSettings);
		
		JButton button_5 = new JButton("LOG OUT");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home().setVisible(true);
				   dispose();
			}
		});
		button_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_5.setBounds(10, 328, 152, 35);
		panel.add(button_5);
		
		JButton btnInformation = new JButton("INFORMATION");
		btnInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Information(rollno).setVisible(true);
				dispose();
			}
		});
		btnInformation.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnInformation.setBounds(10, 203, 152, 35);
		panel.add(btnInformation);
	
		JInternalFrame internalFrame = new JInternalFrame("") {
	           @Override
	           public void setUI(InternalFrameUI ui) {
	               super.setUI(ui); // this gets called internally when updating the ui and makes the northPane reappear
	               BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI(); // so...
	               if (frameUI != null) frameUI.setNorthPane(null); // lets get rid of it
	           }
	        };
		internalFrame.setBounds(182, 94, 481, 350);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Previous Email");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_2.setBounds(27, 60, 120, 30);
		
		
		JLabel lblNewEmail = new JLabel("New Email");
		lblNewEmail.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblNewEmail.setBounds(27, 117, 120, 30);
		
		
		JLabel lblEnterYourPassword = new JLabel("Enter Your Password");
		lblEnterYourPassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblEnterYourPassword.setBounds(27, 177, 155, 30);
		
		
		prevemailtext = new JTextField();
		prevemailtext.setBounds(211, 62, 202, 24);
		
		prevemailtext.setColumns(10);
		
		newemailtext = new JTextField();
		newemailtext.setColumns(10);
		newemailtext.setBounds(211, 121, 202, 24);
		
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(211, 177, 202, 24);
		
		
		JButton btnConfirm_1 = new JButton("CONFIRM");
		btnConfirm_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnConfirm_1.setBounds(163, 253, 120, 35);
		btnConfirm_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				UserLogin u=new UserLogin();
				
				
				if(u.checkPassword(rollno,passwordField_3.getText(),"studentlogin"))
				{
					if(u.updateEmail(rollno,prevemailtext.getText(),newemailtext.getText(),"studentinfo"))					
					JOptionPane.showMessageDialog(null, "Email Updated");
				}
				else
					JOptionPane.showMessageDialog(null, "Wrong password");
				
				passwordField_3.setText(null);
				prevemailtext.setText(null);
				newemailtext.setText(null);
			}
		});
	   
		JInternalFrame internalFrame_1 = new JInternalFrame("")
				  {
	           @Override
	           public void setUI(InternalFrameUI ui) {
	               super.setUI(ui); // this gets called internally when updating the ui and makes the northPane reappear
	               BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI(); // so...
	               if (frameUI != null) frameUI.setNorthPane(null); // lets get rid of it
	           }
	        };
		internalFrame_1.setBounds(182, 94, 481, 350);
		contentPane.add(internalFrame_1);
		internalFrame_1.getContentPane().setLayout(null);
		

		JLabel lblNewLabel = new JLabel("Previous Password");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(22, 52, 123, 35);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(213, 52, 158, 26);
		
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblNewPassword.setBounds(22, 112, 123, 35);
		
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(213, 115, 158, 26);
		
		
		JLabel lblConfirmNewPassword = new JLabel("Confirm New Password");
		lblConfirmNewPassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		lblConfirmNewPassword.setBounds(22, 182, 158, 26);
		
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(213, 181, 158, 26);
		
		
		JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnConfirm.setBounds(172, 249, 123, 35);
		btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UserLogin u=new UserLogin();
				if(u.checkPassword(rollno,passwordField.getText(),"studentlogin"))
				{
				 	if(passwordField_1.getText().equals(passwordField_2.getText()))
				 	{
				 		u.updatePassword(rollno,passwordField_1.getText(),"studentlogin");
				 	   JOptionPane.showMessageDialog(null, "Password updated");
				 	}
				 	else
				 		JOptionPane.showMessageDialog(null, "New Password didnt match");
				 	
				}
				else
					JOptionPane.showMessageDialog(null, "Previous password is incorrect");
				
				
				passwordField.setText(null);
				passwordField_1.setText(null);
				passwordField_2.setText(null);
			}
		});
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(22, 112, 49, 14);
		
		
		JButton btnChangeEmailId = new JButton("CHANGE EMAIL ID");
		btnChangeEmailId.setBounds(359, 48, 167, 35);
		btnChangeEmailId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				internalFrame_1.dispose();
				internalFrame.setTitle("Change Email Id");
                
				internalFrame.getContentPane().add(lblNewLabel_2);
				internalFrame.getContentPane().add(lblNewEmail);
				internalFrame.getContentPane().add(lblEnterYourPassword);
				internalFrame.getContentPane().add(prevemailtext);
				internalFrame.getContentPane().add(newemailtext);
				
				internalFrame.getContentPane().add(passwordField_3);
				internalFrame.getContentPane().add(btnConfirm_1);
				internalFrame.setVisible(true);
			}
		});
		btnChangeEmailId.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(btnChangeEmailId);
		
		
		
		
		JButton btnChangePassword = new JButton("CHANGE PASSWORD");
		btnChangePassword.setBounds(182, 48, 167, 35);
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				internalFrame.dispose();
				internalFrame_1.getContentPane().add(lblNewLabel);
				internalFrame_1.getContentPane().add(passwordField);
				internalFrame_1.getContentPane().add(lblNewPassword);
				internalFrame_1.getContentPane().add(passwordField_1);
				internalFrame_1.getContentPane().add(lblConfirmNewPassword);
				internalFrame_1.getContentPane().add(passwordField_2);
				internalFrame_1.getContentPane().add(btnConfirm);
				internalFrame_1.setTitle("Change Password");
				internalFrame_1.setVisible(true);
							}
		});
		btnChangePassword.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		contentPane.add(btnChangePassword);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 836, 37);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("  X");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(647, 11, 33, 22);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("  -");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			setState(Setting.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(605, 11, 33, 22);
		panel_1.add(label_1);
		
		JLabel lblStudentsettings = new JLabel("STUDENT-SETTINGS");
		lblStudentsettings.setForeground(new Color(135, 206, 235));
		lblStudentsettings.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblStudentsettings.setBounds(245, 12, 239, 20);
		panel_1.add(lblStudentsettings);
		
		
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
