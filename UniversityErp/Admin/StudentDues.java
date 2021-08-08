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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class StudentDues extends JFrame {

	private JPanel contentPane;
	private JTextField rollnotext;
	private JTextField prevduestext;
	private JTextField newduestext;
	private JTextField totalduestext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDues frame = new StudentDues();
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
	public StudentDues() {

		UserLogin u = new UserLogin();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 696, 395);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Student Roll No.");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_1.setBounds(77, 73, 137, 37);
		contentPane.add(lblNewLabel_1);

		JLabel lblPreviousDues = new JLabel("Previous Dues");
		lblPreviousDues.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblPreviousDues.setBounds(87, 121, 121, 37);
		contentPane.add(lblPreviousDues);

		rollnotext = new JTextField();
		rollnotext.setBounds(280, 78, 155, 29);
		contentPane.add(rollnotext);
		rollnotext.setColumns(10);

		prevduestext = new JTextField();
		prevduestext.setEditable(false);
		prevduestext.setColumns(10);
		prevduestext.setBounds(280, 126, 155, 29);
		contentPane.add(prevduestext);

		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = u.prevDues(rollnotext.getText());
				prevduestext.setText(s);
			}
		});
		btnNewButton_1.setBounds(312, 166, 85, 29);
		contentPane.add(btnNewButton_1);

		JLabel lblNewDues = new JLabel("New Dues");
		lblNewDues.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewDues.setBounds(94, 201, 92, 37);
		contentPane.add(lblNewDues);

		newduestext = new JTextField();
		newduestext.setColumns(10);
		newduestext.setBounds(280, 206, 155, 29);
		contentPane.add(newduestext);

		JButton btnUpdate = new JButton("CONFIRM");
		btnUpdate.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = u.newDues(rollnotext.getText(), newduestext.getText(), prevduestext.getText());
				totalduestext.setText(s);
			}
		});
		btnUpdate.setBounds(300, 263, 98, 29);
		contentPane.add(btnUpdate);

		JLabel lblTotalDues = new JLabel("Total Dues");
		lblTotalDues.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblTotalDues.setBounds(94, 323, 92, 37);
		contentPane.add(lblTotalDues);

		totalduestext = new JTextField();
		totalduestext.setEditable(false);
		totalduestext.setColumns(10);
		totalduestext.setBounds(280, 328, 155, 29);
		contentPane.add(totalduestext);

		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rollnotext.setText(null);
				prevduestext.setText(null);
				newduestext.setText(null);
				totalduestext.setText(null);
			}
		});
		btnClear.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 11));
		btnClear.setBounds(490, 185, 98, 29);
		contentPane.add(btnClear);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.controlDkShadow);
		panel_1.setBounds(0, 0, 696, 41);
		contentPane.add(panel_1);

		JLabel label = new JLabel("  X");
		label.setForeground(new Color(255, 69, 0));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(650, 11, 33, 22);
		panel_1.add(label);

		JLabel label_1 = new JLabel("  -");
		label_1.setForeground(new Color(135, 206, 250));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(StudentDues.ICONIFIED);
			}
		});
		label_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_1.setBounds(607, 11, 33, 22);
		panel_1.add(label_1);

		JLabel lblNewLabel = new JLabel("DUES UPDATE");
		lblNewLabel.setBounds(251, 6, 213, 31);
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(135, 206, 235));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(StudentDues.class.getResource("/images/r.png")));
		btnNewButton.setBounds(10, 4, 33, 33);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdministratorMainStd().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 14));

		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
	}
}
