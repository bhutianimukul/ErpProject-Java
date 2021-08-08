package Faculty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Database.UserLogin;
import Login.TeacherLogin;
import MainPage.TeacherMainPage1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Attendence extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField rolltext;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Attendence frame = new Attendence();
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
	public Attendence() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 0, 712, 628);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 222, 690, 395);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setBackground(new Color(240, 248, 255));
		model = new DefaultTableModel();
		Object[] column = { "Date", "Roll no", "Status" };
		Object[] row = new Object[3];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(48, 80, 624, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setBounds(10, 10, 71, 21);
		lblRollNo.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		panel_1.add(lblRollNo);

		rolltext = new JTextField();
		rolltext.setBounds(110, 11, 143, 21);
		panel_1.add(rolltext);
		rolltext.setColumns(10);
		java.util.Date date = java.util.Calendar.getInstance().getTime();
		String s = date.toString();
		s = s.substring(4, 10) + s.substring(23, 28);

		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblDate.setBounds(342, 11, 71, 21);
		panel_1.add(lblDate);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblStatus.setBounds(10, 55, 71, 21);
		panel_1.add(lblStatus);

		JCheckBox presentbox = new JCheckBox("Present");
		presentbox.setBackground(new Color(135, 206, 250));
		buttonGroup.add(presentbox);
		presentbox.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		presentbox.setBounds(106, 55, 99, 23);
		panel_1.add(presentbox);

		JCheckBox Absentbox = new JCheckBox("Absent");
		Absentbox.setBackground(new Color(135, 206, 250));
		buttonGroup.add(Absentbox);
		Absentbox.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 13));
		Absentbox.setBounds(223, 55, 99, 23);
		panel_1.add(Absentbox);

		JDateChooser datetext = new JDateChooser();
		datetext.setBounds(443, 11, 156, 20);
		panel_1.add(datetext);

		UserLogin u = new UserLogin();
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String dob = datetext.getDate().toString();
				dob = dob.substring(4, 10) + ", " + dob.substring(24, 28);

				row[0] = dob;
				row[1] = rolltext.getText();

				if (presentbox.isSelected()) {
					row[2] = "Present";
				} else if (Absentbox.isSelected()) {
					row[2] = "Absent";
				}

				if (u.addAttendence(rolltext.getText(), (String) row[2], (String) row[0]))
					model.addRow(row);
				else {
					buttonGroup.clearSelection();
				}

			}
		});
		btnConfirm.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		btnConfirm.setBounds(281, 81, 118, 31);
		panel_1.add(btnConfirm);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.controlDkShadow);
		panel_2.setBounds(0, 0, 716, 37);
		contentPane.add(panel_2);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 99, 71));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(662, 11, 33, 22);
		panel_2.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(Attendence.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(619, 11, 33, 22);
		panel_2.add(label_1);

		JLabel lblTeacherattendence = new JLabel("TEACHER-ATTENDENCE");
		lblTeacherattendence.setForeground(new Color(135, 206, 235));
		lblTeacherattendence.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));
		lblTeacherattendence.setBounds(181, 6, 359, 31);
		panel_2.add(lblTeacherattendence);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Attendence.class.getResource("/images/r.png")));
		btnNewButton.setBounds(10, 4, 33, 33);
		panel_2.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherMainPage1().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));

		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TeacherLogin().setVisible(true);
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Sitka Subheading", Font.BOLD | Font.ITALIC, 15));
		btnLogOut.setBounds(618, 40, 82, 29);
		contentPane.add(btnLogOut);

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
