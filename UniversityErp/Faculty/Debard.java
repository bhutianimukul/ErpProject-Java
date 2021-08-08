package Faculty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;

import Database.SendEmail;
import Database.UserLogin;
import MainPage.TeacherMainPage1;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Debard extends JFrame {

	private JPanel contentPane;
	private JTextField rollnotext;
	private JTextField attendencetext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Debard frame = new Debard();

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
	public Debard() {
		// Toolkit toolkit=getToolkit();

		setResizable(false);
		UserLogin u = new UserLogin();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 604, 409);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(SystemColor.controlDkShadow);
		panel.setBounds(0, 0, 836, 37);
		contentPane.add(panel);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 69, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}

		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(557, 11, 33, 22);
		panel.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setState(Debard.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(514, 11, 33, 22);
		panel.add(label_1);

		JLabel lblDebardMail = new JLabel("DEBARD MAIL");
		lblDebardMail.setForeground(new Color(135, 206, 235));
		lblDebardMail.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 21));
		lblDebardMail.setBounds(220, 12, 168, 20);
		panel.add(lblDebardMail);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherMainPage1().setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Debard.class.getResource("/images/r.png")));
		button.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		button.setBounds(7, 3, 33, 33);
		panel.add(button);

		rollnotext = new JTextField();
		rollnotext.setBounds(279, 72, 142, 21);
		contentPane.add(rollnotext);
		rollnotext.setColumns(10);

		JLabel label_2 = new JLabel("Roll no");
		label_2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		label_2.setBounds(198, 71, 71, 21);
		contentPane.add(label_2);

		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblStartDate.setBounds(44, 128, 93, 21);
		contentPane.add(lblStartDate);

		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblEndDate.setBounds(339, 128, 78, 21);
		contentPane.add(lblEndDate);

		JDateChooser startdatetext = new JDateChooser();
		startdatetext.setBounds(147, 128, 142, 20);
		contentPane.add(startdatetext);

		JDateChooser enddatetext = new JDateChooser();
		enddatetext.setBounds(427, 129, 142, 20);
		contentPane.add(enddatetext);

		JButton btnCheckAttendence = new JButton("Check Attendence");

		btnCheckAttendence.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		btnCheckAttendence.setBounds(231, 173, 153, 27);
		contentPane.add(btnCheckAttendence);

		Panel panel_1 = new Panel();
		panel_1.setBounds(10, 206, 584, 194);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblAttendence = new JLabel("Attendence");
		lblAttendence.setBounds(144, 23, 86, 21);
		panel_1.add(lblAttendence);
		lblAttendence.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));

		attendencetext = new JTextField();
		attendencetext.setEditable(false);
		attendencetext.setBounds(294, 24, 122, 20);
		panel_1.add(attendencetext);
		attendencetext.setColumns(10);

		JButton btnSendMail = new JButton("Send Mail");
		btnSendMail.setBounds(230, 133, 108, 27);
		panel_1.add(btnSendMail);

		btnSendMail.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));

		Checkbox notdebardbox = new Checkbox("Not-Debarded");
		notdebardbox.setBounds(326, 74, 113, 23);
		panel_1.add(notdebardbox);
		notdebardbox.setBackground(new Color(135, 206, 250));
		notdebardbox.setEnabled(false);
		notdebardbox.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 12));

		Checkbox debardbox = new Checkbox("Debarded");
		debardbox.setBounds(169, 74, 99, 23);
		panel_1.add(debardbox);
		debardbox.setBackground(new Color(135, 206, 250));
		debardbox.setEnabled(false);
		debardbox.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 12));

		btnCheckAttendence.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!u.studentExist(rollnotext.getText())) {
					JOptionPane.showMessageDialog(null, "Rollno not found");
				} else {

					String dob = "", dob1 = "";
					try {

						dob = startdatetext.getDate().toString();
						dob1 = enddatetext.getDate().toString();

					} catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Select date first");
					}
					dob = dob.substring(4, 10) + ", " + dob.substring(24, 28);
					dob1 = dob1.substring(4, 10) + ", " + dob1.substring(24, 28);
					ArrayList<ArrayList<String>> l = u.getAttendence(rollnotext.getText(), dob, dob1);
					ArrayList<String> present = l.get(0);
					ArrayList<String> absent = l.get(1);

					attendencetext
							.setText(Double.toString(present.size() * 100.0 / (present.size() + absent.size())) + "%");
					Double per = present.size() * 100.0 / (present.size() + absent.size());
					if (per >= 75.0) {
						debardbox.setState(false);
						notdebardbox.setState(true);
					} else {
						notdebardbox.setState(false);
						debardbox.setState(true);
					}

				}

			}
		});
		SendEmail e = new SendEmail();
		btnSendMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				u.getinfo(rollnotext.getText(), "studentinfo");
				String gmail = u.getGmailId();
				String dob = "", dob1 = "";

				dob = startdatetext.getDate().toString();
				dob1 = enddatetext.getDate().toString();

				dob = dob.substring(4, 10) + ", " + dob.substring(24, 28);
				dob1 = dob1.substring(4, 10) + ", " + dob1.substring(24, 28);

				if (debardbox.getState()) {

					if (new SendEmail().sendDebardEmail(gmail, attendencetext.getText(), dob, dob1)) {
						JOptionPane.showMessageDialog(null, "Email Sent");
					} else {
						JOptionPane.showMessageDialog(null, "Email Connot be  Sent");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Student is not debarded");
				}
			}
		});

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
