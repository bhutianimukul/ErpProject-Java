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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class TeacherChanges extends JFrame {

	private JPanel contentPane;
	private JTextField parentscontacttext;
	private JTextField gmailtext;
	private JTextField mothernametext;
	private JTextField fathernametext;
	private JTextField idtext;
	private JTextField urcontacttext;
	private JTextField addresstext;
	private JTextField dobtext;
	private JTextField nametext;
	private JTextField searchtext;
	 private ButtonGroup bgroup;
	 private JTextArea finfo;
	    private String gender="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherChanges frame = new TeacherChanges();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clear()
	{
		parentscontacttext.setText(null);
		gmailtext.setText(null);
		mothernametext.setText(null);
		fathernametext.setText(null);
		idtext.setText(null);
		urcontacttext.setText(null);
		nametext.setText(null);
				addresstext.setText(null);
		searchtext.setText(null);
		dobtext.setText(null);
		bgroup.clearSelection();
		
	}
	public void showInfo()
	{
	  finfo.setText("Employee id :-  "+idtext.getText()+
			      "\nName:-    "+nametext.getText()+
			      "\nDate of Birth:-"+dobtext.getText()+
			      "\nFather Name:-  "+fathernametext.getText()+
			      "\nMother Name:-  "+mothernametext.getText()+
			      "\nParent's Contact:-"+parentscontacttext.getText()+
			      "\nYour's Contact:-  "+urcontacttext.getText()+
			      "\nGender:-  "+gender+
			      "\nGmail Id:- "+gmailtext.getText()+
			      "\nAddress:- "+addresstext.getText()
	  					
			        
			                
			  );
	}
	
	/**
	 * Create the frame.
	 */
	public TeacherChanges() {
		UserLogin u=new UserLogin();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(0, 0, 714, 624);
		contentPane.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(135, 206, 250));
		panel_2.setBounds(10, 52, 390, 519);
		panel.add(panel_2);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_1.setBounds(10, 52, 57, 31);
		panel_2.add(label_1);
		
		JLabel label_2 = new JLabel("Date of birth");
		label_2.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_2.setBounds(10, 94, 115, 31);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("Father's Name");
		label_3.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_3.setBounds(10, 140, 126, 25);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("Mother's Name");
		label_4.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_4.setBounds(10, 176, 126, 25);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("Gmail Id");
		label_5.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_5.setBounds(10, 212, 146, 23);
		panel_2.add(label_5);
		
		JLabel label_6 = new JLabel("Parents Contact No.");
		label_6.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_6.setBounds(10, 246, 166, 23);
		panel_2.add(label_6);
		
		JLabel label_10 = new JLabel("Address");
		label_10.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_10.setBounds(10, 353, 91, 31);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("Your Contact No.");
		label_11.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_11.setBounds(10, 280, 146, 20);
		panel_2.add(label_11);
		
		parentscontacttext = new JTextField();
		parentscontacttext.setColumns(10);
		parentscontacttext.setBounds(186, 247, 194, 20);
		panel_2.add(parentscontacttext);
		
		gmailtext = new JTextField();
		gmailtext.setColumns(10);
		gmailtext.setBounds(186, 213, 194, 20);
		panel_2.add(gmailtext);
		
		mothernametext = new JTextField();
		mothernametext.setColumns(10);
		mothernametext.setBounds(186, 178, 194, 20);
		panel_2.add(mothernametext);
		
		fathernametext = new JTextField();
		fathernametext.setColumns(10);
		fathernametext.setBounds(186, 142, 194, 20);
		panel_2.add(fathernametext);
		
		idtext = new JTextField();
		idtext.setFont(new Font("Sylfaen", Font.BOLD, 12));
		idtext.setColumns(10);
		idtext.setBounds(186, 16, 194, 20);
		panel_2.add(idtext);
		
		urcontacttext = new JTextField();
		urcontacttext.setColumns(10);
		urcontacttext.setBounds(186, 280, 194, 20);
		panel_2.add(urcontacttext);
		
		addresstext = new JTextField();
		addresstext.setColumns(10);
		addresstext.setBounds(186, 358, 194, 20);
		panel_2.add(addresstext);
		
		JLabel label_12 = new JLabel("Gender");
		label_12.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		label_12.setBounds(10, 311, 91, 31);
		panel_2.add(label_12);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		rdbtnMale.setBackground(new Color(135, 206, 250));
		rdbtnMale.setBounds(186, 315, 74, 23);
		panel_2.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 14));
		rdbtnFemale.setBackground(new Color(135, 206, 250));
		rdbtnFemale.setBounds(282, 315, 74, 23);
		panel_2.add(rdbtnFemale);
		
		bgroup=new ButtonGroup();
		bgroup.add(rdbtnFemale);
		bgroup.add(rdbtnMale);
		
		dobtext = new JTextField();
		dobtext.setColumns(10);
		dobtext.setBounds(186, 99, 194, 20);
		panel_2.add(dobtext);
		
		JLabel lblUniversityId = new JLabel("Employee Id no");
		lblUniversityId.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblUniversityId.setBounds(10, 15, 146, 20);
		panel_2.add(lblUniversityId);
		
		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(186, 57, 194, 20);
		panel_2.add(nametext);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(135, 206, 250));
		panel_3.setBounds(405, 52, 299, 519);
		panel.add(panel_3);
		
		JButton btnAddFac = new JButton("ADD FAC.");
		btnAddFac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String gender="";
				  if(rdbtnMale.isSelected())
				  {
					  gender="Male";
				  }
				  else
					  gender="Female";
				
			boolean b=	u.addFaculty(idtext.getText(), nametext.getText(), dobtext.getText(), fathernametext.getText(), mothernametext.getText(), parentscontacttext.getText(), urcontacttext.getText(), gender, addresstext.getText(), gmailtext.getText());
			if(b) { 
				 showInfo();
				 clear();
				 }
			}
		});
		btnAddFac.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		btnAddFac.setBounds(30, 424, 90, 36);
		panel_3.add(btnAddFac);
		
		JButton button_2 = new JButton("REMOVE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				u.removeFaculty(idtext.getText());
				clear();
			}
		});
		button_2.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		button_2.setBounds(181, 424, 90, 36);
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("UPDATE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  if(rdbtnMale.isSelected())
				  {
					  gender="Male";
				  }
				  else
					  gender="Female";
				u.updateFaculty(idtext.getText(),nametext.getText(),dobtext.getText(),fathernametext.getText(),mothernametext.getText(),parentscontacttext.getText(),urcontacttext.getText(),gender,addresstext.getText(),gmailtext.getText());
				 
				  showInfo();
				  clear();
			}
		});
		button_3.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		button_3.setBounds(181, 471, 90, 36);
		panel_3.add(button_3);
		
		JButton button_4 = new JButton("CLEAR");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
				finfo.setText(null);
			}
		});
		button_4.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		button_4.setBounds(30, 471, 90, 36);
		panel_3.add(button_4);
		
		JLabel lblSearchemployeeId = new JLabel("Search(Employee id)");
		lblSearchemployeeId.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblSearchemployeeId.setBounds(10, 11, 182, 31);
		panel_3.add(lblSearchemployeeId);
		
		searchtext = new JTextField();
		searchtext.setFont(new Font("Sylfaen", Font.BOLD, 15));
		searchtext.setColumns(10);
		searchtext.setBounds(30, 39, 174, 31);
		panel_3.add(searchtext);
		
		JButton button_5 = new JButton("SEARCH");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s[]=u.searchFaculty(searchtext.getText());
				idtext.setText(s[0]);
				nametext.setText(s[1]);
				dobtext.setText(s[2]);
				fathernametext.setText(s[3]);
				mothernametext.setText(s[4]);
				gmailtext.setText(s[5]);
				parentscontacttext.setText(s[6]);
				urcontacttext.setText(s[7]);
				if("Male".equals(s[8]))
					rdbtnMale.setSelected(true);
				else
					rdbtnFemale.setSelected(true);
			
				addresstext.setText(s[9]);
				
			}
		});
		button_5.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 10));
		button_5.setBounds(214, 42, 81, 26);
		panel_3.add(button_5);
		
		 finfo = new JTextArea();
		finfo.setFont(new Font("Sylfaen", Font.PLAIN, 13));
		finfo.setEditable(false);
		finfo.setBounds(10, 101, 279, 312);
		panel_3.add(finfo);
		
		JLabel lblFacultyInformaition = new JLabel("Faculty Informaition");
		lblFacultyInformaition.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 17));
		lblFacultyInformaition.setBounds(10, 81, 194, 20);
		panel_3.add(lblFacultyInformaition);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(SystemColor.controlDkShadow);
		panel_4.setBounds(0, 0, 724, 41);
		panel.add(panel_4);
		
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
		panel_4.add(label);
		
		JLabel label_7 = new JLabel("  -");
		label_7.setForeground(new Color(135, 206, 250));
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(TeacherChanges.ICONIFIED);
			}
		});
		label_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label_7.setBounds(607, 11, 33, 22);
		panel_4.add(label_7);
		
		JLabel lblFaculty_1 = new JLabel("FACULTY");
		lblFaculty_1.setForeground(new Color(135, 206, 235));
		lblFaculty_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 26));
		lblFaculty_1.setBounds(296, 6, 138, 31);
		panel_4.add(lblFaculty_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdministratorMainStd().setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(TeacherChanges.class.getResource("/images/r.png")));
		button.setBounds(10, 4, 33, 33);
		panel_4.add(button);
		button.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 16));
		
		
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	    setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
	}
}
