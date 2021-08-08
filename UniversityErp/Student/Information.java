package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.UserLogin;
import Login.Home;
import MainPage.StudentMainPage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Information extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information("1815663");
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
	public Information(String rollno) {
		UserLogin u = new UserLogin();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(182, 112, 91, 31);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblNewLabel_1);

		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(182, 196, 146, 31);
		lblFathersName.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblFathersName);

		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setBounds(182, 238, 132, 31);
		lblMothersName.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblMothersName);

		JLabel lblYourContactNo = new JLabel("Your Contact No.");
		lblYourContactNo.setBounds(182, 280, 146, 31);
		lblYourContactNo.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblYourContactNo);

		JLabel lblParentsContactNo = new JLabel("Parents Contact No.");
		lblParentsContactNo.setBounds(182, 322, 166, 31);
		lblParentsContactNo.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblParentsContactNo);

		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(182, 364, 91, 31);
		lblAddress.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblAddress);

		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setBounds(182, 406, 91, 31);
		lblBranch.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblBranch);

		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setBounds(182, 490, 91, 31);
		lblSemester.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblSemester);

		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setBounds(182, 70, 91, 31);
		lblRollNo.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblRollNo);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(182, 154, 120, 31);
		lblDateOfBirth.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblDateOfBirth);

		u.getinfo(rollno, "studentinfo");

		textField = new JTextField();
		textField.setBounds(367, 112, 227, 31);
		textField.setText(u.getName());
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(367, 154, 227, 31);
		textField_1.setEditable(false);
		textField_1.setText(u.getDob());
		textField_1.setColumns(10);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setBounds(367, 196, 227, 31);
		textField_2.setText(u.getFatherName());
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setBounds(367, 238, 227, 31);
		textField_3.setText(u.getMotherName());
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBounds(367, 280, 227, 31);
		textField_4.setText(u.getContact());
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setBounds(367, 322, 227, 31);
		textField_5.setText(u.getParentsContact());
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setBounds(367, 406, 227, 31);
		textField_6.setText(u.getBranch());
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setBounds(367, 490, 227, 31);
		textField_7.setText(u.getSem());
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setBounds(367, 70, 227, 31);
		textField_8.setText(u.getId());
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setBounds(367, 364, 227, 31);
		textField_9.setText(u.getAddress());
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		contentPane.add(textField_9);

		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(182, 448, 91, 31);
		lblCourse.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		contentPane.add(lblCourse);

		textField_10 = new JTextField();
		textField_10.setBounds(367, 448, 227, 31);
		textField_10.setText(u.getCourse());
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		contentPane.add(textField_10);

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
				setState(Information.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(605, 11, 33, 22);
		panel_1.add(label_1);

		JLabel lblStudentinformation = new JLabel("STUDENT-INFORMATION");
		lblStudentinformation.setForeground(new Color(135, 206, 235));
		lblStudentinformation.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblStudentinformation.setBounds(211, 12, 340, 20);
		panel_1.add(lblStudentinformation);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 33, 172, 537);
		contentPane.add(panel);

		JButton button_2 = new JButton("HOME");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new StudentMainPage(rollno).setVisible(true);
				dispose();
			}
		});
		button_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_2.setBounds(22, 83, 128, 35);
		panel.add(button_2);

		JButton btnDues = new JButton("DUES");
		btnDues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Dues(rollno).setVisible(true);
				dispose();
			}
		});
		btnDues.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnDues.setBounds(10, 163, 152, 35);
		panel.add(btnDues);

		JButton button_4 = new JButton("SETTINGS");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Setting(rollno).setVisible(true);
				dispose();
			}
		});
		button_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_4.setBounds(10, 319, 152, 35);
		panel.add(button_4);

		JButton button_5 = new JButton("LOG OUT");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Home().setVisible(true);
				dispose();
			}
		});
		button_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_5.setBounds(10, 402, 152, 35);
		panel.add(button_5);

		JButton button_6 = new JButton("ATTENDENCE");
		button_6.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		button_6.setBounds(10, 239, 152, 35);
		panel.add(button_6);

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
