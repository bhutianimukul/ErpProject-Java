package Login;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("MAIN PAGE");
		setUndecorated(true);
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 563);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnS = new JButton("");
		btnS.setVerticalAlignment(SwingConstants.TOP);
		btnS.setIcon(new ImageIcon(Main.class.getResource("/images/Student.jpg")));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Home().setVisible(true);
				dispose();
			}
		});
		btnS.setBounds(373, 234, 125, 132);
		contentPane.add(btnS);
		
		JButton btnX = new JButton("");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeacherLogin().setVisible(true);
				dispose();
			}
		});
		btnX.setIcon(new ImageIcon(Main.class.getResource("/images/faculty.jpg")));
		btnX.setBounds(636, 241, 125, 125);
		contentPane.add(btnX);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/college.jpg")));
		lblNewLabel.setBounds(351, 42, 458, 150);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(2, 42, 347, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUniversity = new JLabel("UNIVERSITY");
		lblUniversity.setForeground(new Color(0, 128, 0));
		lblUniversity.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblUniversity.setBounds(79, 79, 182, 54);
		panel.add(lblUniversity);
		
		JLabel lblErp = new JLabel("ERP");
		lblErp.setForeground(new Color(0, 128, 0));
		lblErp.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 26));
		lblErp.setBounds(128, 144, 76, 54);
		panel.add(lblErp);
		
		JLabel lblNewLabel_4 = new JLabel("Education is the passport to the");
		lblNewLabel_4.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setBounds(43, 291, 265, 33);
		panel.add(lblNewLabel_4);
		
		JLabel lblFutureForTomorrow = new JLabel("future, for tomorrow belongs to those");
		lblFutureForTomorrow.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblFutureForTomorrow.setBounds(10, 335, 327, 33);
		panel.add(lblFutureForTomorrow);
		
		JLabel lblWhoPrepareFor = new JLabel("who prepare for it today.");
		lblWhoPrepareFor.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblWhoPrepareFor.setBounds(57, 379, 215, 33);
		panel.add(lblWhoPrepareFor);
		
		JLabel lblmalcolmX = new JLabel(" \u2014Malcolm X");
		lblmalcolmX.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblmalcolmX.setBounds(204, 431, 117, 33);
		panel.add(lblmalcolmX);
		
		JLabel lblNewLabel_1 = new JLabel("Student");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(395, 377, 78, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Teacher");
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_2.setBounds(665, 377, 78, 22);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Main.class.getResource("/images/Admin.jpg")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AdminLogin().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(509, 377, 125, 132);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Administrator");
		lblNewLabel_3.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_3.setBounds(509, 514, 138, 24);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(105, 105, 105));
		panel_1.setBounds(2, 0, 807, 41);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("  X");
		lblNewLabel_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(766, 8, 33, 22);
		panel_1.add(lblNewLabel_5);
		
		JLabel label = new JLabel("  -");
		label.setForeground(new Color(135, 206, 250));
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(Main.ICONIFIED);
			}
		});
		label.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label.setBounds(723, 8, 33, 22);
		panel_1.add(label);
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2); 
	}
}
