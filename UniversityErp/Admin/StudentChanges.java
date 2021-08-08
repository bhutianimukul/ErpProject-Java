package Admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.UserLogin;
import MainPage.AdministratorMainStd;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class StudentChanges extends JFrame {

	private JPanel contentPane;
	private JTextField parentcontacttext;
	private JTextField gmailtext;
	private JTextField mnametext;
	private JTextField fnametext;
	private JTextField rollnotext;
	private JTextField urcontacttext;
	private JTextField nametext;
	private JTextField branchtext;
	private JTextField coursetext;
	private JTextField semtext;
	private JTextField addresstext;
	private JTextField searchtext;
	private JTextArea sinfo;
	private ButtonGroup bgroup;
	private String gender = "";
	private JDateChooser dobtext;
	private String dob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentChanges frame = new StudentChanges();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clear() {
		parentcontacttext.setText(null);
		gmailtext.setText(null);
		mnametext.setText(null);
		fnametext.setText(null);
		rollnotext.setText(null);
		urcontacttext.setText(null);
		nametext.setText(null);
		branchtext.setText(null);
		coursetext.setText(null);
		semtext.setText(null);
		addresstext.setText(null);
		searchtext.setText(null);
		dobtext.setDate(null);
		;
		bgroup.clearSelection();
	}

	public void showInfo() {
		sinfo.setText("Rollno:-  " + rollnotext.getText() + "\nName:-    " + nametext.getText() + "\nDate of Birth:-"
				+ dob + "\nFather Name:-  " + fnametext.getText() + "\nMother Name:-  " + mnametext.getText()
				+ "\nGmail Id:- " + gmailtext.getText() + "\nParent's Contact:-" + parentcontacttext.getText()
				+ "\nYour's Contact:-  " + urcontacttext.getText() + "\nGender:-  " + gender + "\nBranch:-  "
				+ branchtext.getText() + "\nCourse:-  " + coursetext.getText() + "\nSemester:-" + semtext.getText()
				+ "\nAddress:- " + addresstext.getText()

		);
	}

	/**
	 * Create the frame.
	 */
	public StudentChanges() {

		UserLogin u = new UserLogin();
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 726, 587);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(10, 52, 390, 530);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel label = new JLabel("Name");
		label.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label.setBounds(10, 52, 57, 31);
		panel_1.add(label);

		JLabel lblDateOfBirthdaymonthyear = new JLabel("Date of birth");
		lblDateOfBirthdaymonthyear.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblDateOfBirthdaymonthyear.setBounds(10, 94, 115, 31);
		panel_1.add(lblDateOfBirthdaymonthyear);

		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblFathersName.setBounds(10, 140, 126, 25);
		panel_1.add(lblFathersName);

		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblMothersName.setBounds(10, 176, 126, 25);
		panel_1.add(lblMothersName);

		JLabel lblGmailId = new JLabel("Gmail Id");
		lblGmailId.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblGmailId.setBounds(10, 212, 146, 23);
		panel_1.add(lblGmailId);

		JLabel label_2 = new JLabel("Parents Contact No.");
		label_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_2.setBounds(10, 246, 166, 23);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("Branch");
		label_3.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_3.setBounds(10, 353, 91, 20);
		panel_1.add(label_3);

		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblDepartment.setBounds(10, 384, 115, 31);
		panel_1.add(lblDepartment);

		JLabel label_4 = new JLabel("Semester");
		label_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_4.setBounds(10, 426, 91, 31);
		panel_1.add(label_4);

		JLabel label_6 = new JLabel("Address");
		label_6.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_6.setBounds(10, 468, 91, 31);
		panel_1.add(label_6);

		JLabel lblYourContactNo = new JLabel("Your Contact No.");
		lblYourContactNo.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblYourContactNo.setBounds(10, 280, 146, 20);
		panel_1.add(lblYourContactNo);

		parentcontacttext = new JTextField();
		parentcontacttext.setBounds(186, 247, 194, 20);
		panel_1.add(parentcontacttext);
		parentcontacttext.setColumns(10);

		gmailtext = new JTextField();
		gmailtext.setColumns(10);
		gmailtext.setBounds(186, 213, 194, 20);
		panel_1.add(gmailtext);

		mnametext = new JTextField();
		mnametext.setColumns(10);
		mnametext.setBounds(186, 178, 194, 20);
		panel_1.add(mnametext);

		fnametext = new JTextField();
		fnametext.setColumns(10);
		fnametext.setBounds(186, 142, 194, 20);
		panel_1.add(fnametext);

		rollnotext = new JTextField();
		rollnotext.setFont(new Font("Sylfaen", Font.BOLD, 12));
		rollnotext.setColumns(10);
		rollnotext.setBounds(186, 16, 194, 20);
		panel_1.add(rollnotext);

		urcontacttext = new JTextField();
		urcontacttext.setColumns(10);
		urcontacttext.setBounds(186, 280, 194, 20);
		panel_1.add(urcontacttext);

		branchtext = new JTextField();
		branchtext.setColumns(10);
		branchtext.setBounds(186, 353, 194, 20);
		panel_1.add(branchtext);

		coursetext = new JTextField();
		coursetext.setColumns(10);
		coursetext.setBounds(186, 389, 194, 20);
		panel_1.add(coursetext);

		semtext = new JTextField();
		semtext.setColumns(10);
		semtext.setBounds(186, 431, 194, 20);
		panel_1.add(semtext);

		addresstext = new JTextField();
		addresstext.setColumns(10);
		addresstext.setBounds(186, 473, 194, 20);
		panel_1.add(addresstext);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblGender.setBounds(10, 311, 91, 31);
		panel_1.add(lblGender);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBackground(new Color(135, 206, 250));
		rdbtnMale.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		rdbtnMale.setBounds(186, 315, 74, 23);
		panel_1.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBackground(new Color(135, 206, 250));
		rdbtnFemale.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		rdbtnFemale.setBounds(282, 315, 74, 23);
		panel_1.add(rdbtnFemale);

		bgroup = new ButtonGroup();
		bgroup.add(rdbtnFemale);
		bgroup.add(rdbtnMale);

		JLabel label_5 = new JLabel("Roll No.");
		label_5.setBounds(10, 15, 91, 20);
		panel_1.add(label_5);
		label_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));

		nametext = new JTextField();
		nametext.setBounds(186, 57, 194, 20);
		panel_1.add(nametext);
		nametext.setColumns(10);

		dobtext = new JDateChooser();
		dobtext.setBounds(186, 94, 194, 20);
		panel_1.add(dobtext);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(417, 52, 299, 530);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton = new JButton("ADD STD.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno = rollnotext.getText();
				if (rno.equals("") || rno.length() == 7) {
					JOptionPane.showMessageDialog(null, "Enter the Rollno. Correcty");
				} else {
					String gender = "";
					if (rdbtnMale.isSelected()) {
						gender = "Male";
					} else
						gender = "Female";
					boolean b = u.addStudent(nametext.getText(), rollnotext.getText(), dobtext.getDate().toString(),
							fnametext.getText(), mnametext.getText(), parentcontacttext.getText(),
							urcontacttext.getText(), gender, branchtext.getText(), coursetext.getText(),
							semtext.getText(), addresstext.getText());

					if (b) {
						showInfo();
						clear();
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setBounds(30, 436, 90, 36);
		panel_2.add(btnNewButton);

		JButton btnDelete = new JButton("REMOVE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				u.deleteStudent(rollnotext.getText());
				clear();

			}
		});
		btnDelete.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnDelete.setBounds(181, 436, 90, 36);
		panel_2.add(btnDelete);

		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (rdbtnMale.isSelected()) {
					gender = "Male";
				} else
					gender = "Female";
				dob = dobtext.getDate().toString();
				dob = dob.substring(4, 10) + ", " + dob.substring(24, 28);
				u.updateStudent(nametext.getText(), rollnotext.getText(), dob, fnametext.getText(), mnametext.getText(),
						parentcontacttext.getText(), urcontacttext.getText(), gender, branchtext.getText(),
						coursetext.getText(), semtext.getText(), addresstext.getText(), gmailtext.getText());

				showInfo();
				clear();
			}
		});
		btnUpdate.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnUpdate.setBounds(181, 483, 90, 36);
		panel_2.add(btnUpdate);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				clear();
			}
		});
		btnClear.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnClear.setBounds(30, 483, 90, 36);
		panel_2.add(btnClear);

		JLabel lblSearch = new JLabel("Search(Roll No.)");
		lblSearch.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblSearch.setBounds(10, 11, 141, 31);
		panel_2.add(lblSearch);

		searchtext = new JTextField();
		searchtext.setFont(new Font("Sylfaen", Font.BOLD, 15));
		searchtext.setColumns(10);
		searchtext.setBounds(30, 39, 174, 31);
		panel_2.add(searchtext);

		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!u.studentExist(searchtext.getText()))
					JOptionPane.showMessageDialog(null, "Rollno not found");
				else {
					String s[] = null;
					try {
						s = u.search(searchtext.getText());
						if (s.equals(null))
							throw new NullPointerException();
					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Roll no. not found");
					}
					rollnotext.setText(s[0]);
					nametext.setText(s[1]);
					SimpleDateFormat formatter4 = new SimpleDateFormat("MMM dd, yyyy");
					Date date4 = null;
					try {
						date4 = formatter4.parse(s[2]);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					dobtext.setDate(date4);
					;
					fnametext.setText(s[3]);
					mnametext.setText(s[4]);
					gmailtext.setText(s[5]);
					parentcontacttext.setText(s[6]);
					urcontacttext.setText(s[7]);
					if ("Male".equals(s[8]))
						rdbtnMale.setSelected(true);
					else
						rdbtnFemale.setSelected(true);
					branchtext.setText(s[9]);
					coursetext.setText(s[10]);
					semtext.setText(s[11]);
					addresstext.setText(s[12]);

				}
			}
		});
		btnSearch.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnSearch.setBounds(214, 42, 81, 26);
		panel_2.add(btnSearch);

		sinfo = new JTextArea();
		sinfo.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		sinfo.setEditable(false);
		sinfo.setBounds(10, 113, 279, 312);
		panel_2.add(sinfo);

		JLabel lblStudentInformaition = new JLabel("Student Informaition");
		lblStudentInformaition.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblStudentInformaition.setBounds(10, 92, 194, 20);
		panel_2.add(lblStudentInformaition);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(SystemColor.controlDkShadow);
		panel_3.setBounds(0, 0, 726, 41);
		contentPane.add(panel_3);

		JLabel label_1 = new JLabel("  X");
		label_1.setForeground(new Color(255, 69, 0));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(683, 8, 33, 22);
		panel_3.add(label_1);

		JLabel label_7 = new JLabel("  -");
		label_7.setForeground(new Color(135, 206, 250));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(StudentChanges.ICONIFIED);
			}
		});
		label_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_7.setBounds(640, 8, 33, 22);
		panel_3.add(label_7);

		JLabel lblNewLabel = new JLabel("STUDENT");
		lblNewLabel.setBounds(273, 8, 134, 27);
		panel_3.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 250, 154));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));

		JButton btnHome = new JButton("");
		btnHome.setIcon(new ImageIcon(StudentChanges.class.getResource("/images/r.png")));
		btnHome.setBounds(10, 4, 33, 33);
		panel_3.add(btnHome);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdministratorMainStd().setVisible(true);
				dispose();
			}
		});
		btnHome.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));

		Toolkit t = getToolkit();
		Dimension size = t.getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
