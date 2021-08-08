package Database;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class UserLogin {
	Connection con;
	private  String userid;
	private String password;
	private Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	 String name="s";
	 
	 
	 public UserLogin() {
		// TODO Auto-generated constructor stub
		try {
	Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/erpproject","root","1205");
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
	 
	 public boolean studentExist(String rollno)
	 {
		 boolean flag=true;
		 try {
			 pstmt=con.prepareStatement("select exists(select * from attendence where rollno=?)");
				pstmt.setString(1, rollno);
				
			    rs=pstmt.executeQuery();
			    rs.next();
			    if(rs.getInt(1)==0)
			    	flag=false;
			    	
		 }
		 catch(SQLException e)
		 {
			 return false;
		 }
		 return flag;
	 }
	 
	 
	public  void setText(JTextField t)
	{
		userid= (t.getText());
	}
	public void setPassword(JPasswordField t)
	{
		password= t.getText();
	}
	
	public   boolean  check(JTextField t,JPasswordField p,String s)
	{  try {
		
		 setText(t);
	     setPassword(p);
	     String querry="select * from "+s+" where userid="+userid+" and pass=\""+password+"\"";  
	     stmt=con.createStatement();
	     rs=stmt.executeQuery(querry);
	     if(rs.next())
		{
			return true;
		}
	     
	 	stmt.close();
	 	rs.close();
			}
	catch(Exception e){
		e.printStackTrace();
	}

	
	return false;
	}
	
	
	public void getinfo(String idno,String table)
	{    
		String querry="select * from "+table+" where rollno=?";
		
		
		try {
			pstmt=con.prepareStatement(querry);
			//pstmt.setString(1, table); 
     	//	pstmt.setString(1, id);
			pstmt.setString(1, idno);
			rs=pstmt.executeQuery();
			rs.next();
		      
		 }  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		
	}
	
	
	
	
	public String getName()
	{   try {
		return rs.getString("name");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getId()
	{   try {
		return rs.getString("rollno");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
	  JOptionPane.showMessageDialog(null, "Roll no not found");
	}
		 
	   return "not found";
	}
	public String getFatherName()
	{   try {
		return rs.getString("fathername");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getMotherName()
	{   try {
		return rs.getString("mothername");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getBranch()
	{   try {
		return rs.getString("branch");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getCourse()
	{   try {
		return rs.getString("Course");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getSem()
	{   try {
		return rs.getString("sem");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getContact()
	{   try {
		return rs.getString("urcontact");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getParentsContact()
	{   try {
		return rs.getString("parentscontact");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getAddress()
	{   try {
		return rs.getString("address");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getDob()
	{   try {
		return rs.getString("dateofbirth");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getGmailId()
	{   try {
		return rs.getString("gmail");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public String getGender()
	{   try {
		return rs.getString("gender");
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		 
	   return "not filled";
	}
	public boolean addStudent(String name,String rollno,String dateofbirth,String fathername,String mothername,String parentscontact,String urcontact,String gender,String branch,String course,String sem,String address)
	{    String querry="insert into studentinfo(name,rollno,dateofbirth,fathername,mothername,parentscontact,urcontact,gender,branch,course,sem,address) value(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1, name);
			pstmt.setString(2, rollno);
			pstmt.setString(3, dateofbirth);
			pstmt.setString(4, fathername);
			pstmt.setString(5, mothername);
			pstmt.setString(6, parentscontact);
			pstmt.setString(7, urcontact);
			pstmt.setString(8,gender);
			pstmt.setString(9, branch);
			pstmt.setString(10, course);
			pstmt.setString(11, sem);
			pstmt.setString(12, address);
			boolean b=pstmt.execute();
			if(b)
				 JOptionPane.showMessageDialog(null,"Success");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Rollno Already Exist");
			return false;
		}
		try {
			pstmt=con.prepareStatement("insert into studentlogin(userid) value(?)");
			pstmt.setString(1, rollno);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	public void updateStudent(String name,String rollno,String dateofbirth,String fathername,String mothername,String parentscontact,String urcontact,String gender,String branch,String course,String sem,String address,String gmail)
	{  
	    String querry="update studentinfo set name=?,dateofbirth=?,fathername=?,mothername=?,parentscontact=?,urcontact=?,gender=?,branch=?,course=?,sem=?,address=?,gmail=? where rollno=?";
			try {
				pstmt=con.prepareStatement(querry);
				
				pstmt.setString(1, name);
				pstmt.setString(13, rollno);
				pstmt.setString(2, dateofbirth);
				pstmt.setString(3, fathername);
				pstmt.setString(4, mothername);
				pstmt.setString(5, parentscontact);
				pstmt.setString(6, urcontact);
				pstmt.setString(7,gender);
				pstmt.setString(8, branch);
				pstmt.setString(9, course);
				pstmt.setString(10, sem);
				pstmt.setString(11, address);
				pstmt.setString(12, gmail);
			      boolean b=pstmt.execute();
				if(b)
					 JOptionPane.showMessageDialog(null,"un-Success");
				else
					 JOptionPane.showMessageDialog(null,"Success");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	public String[] search(String rollno)
	{
		String s[]=new String[13];
		String querry="Select* from studentinfo where rollno=?";
		try {
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1, rollno);
			rs=pstmt.executeQuery();
			rs.next();
			s[0]=getId();
			s[1]=getName();
			s[2]=getDob();
			s[3]=getFatherName();
			s[4]=getMotherName();
			s[5]=getGmailId();
			s[6]=getParentsContact();
			s[7]=getContact();
			s[8]=getGender();
			s[9]=getBranch();
			s[10]=getCourse();
			s[11]=getSem();
			s[12]=getAddress();
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(new JFrame(),"Roll no. not found");
		}
		
		return s;
	}
	public void deleteStudent(String rollno)
	{
		String querry="delete from studentinfo where rollno=?";
		try {
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1, rollno);
			if(pstmt.execute())
				 JOptionPane.showMessageDialog(null,"Success");
			else
				 JOptionPane.showMessageDialog(null,"Un-Success");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt=con.prepareStatement("delete from studentlogin where userid=?");
			pstmt.setString(1, rollno);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String prevDues(String rollno)
	{
		 double dues=0;
		try {
			pstmt=con.prepareStatement("Select dues from studentinfo where rollno=?");
			pstmt.setString(1, rollno);
			rs=pstmt.executeQuery();
			rs.next();
		   dues=	rs.getDouble("dues");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 JOptionPane.showMessageDialog(null,"Rollno Not Found");
			
		}
		
		return Double.toString(dues);
		
	}
	public String newDues(String rollno, String newdue,String prevdue)
	{
		double nd=Double.parseDouble(newdue);
		Double pd=Double.parseDouble(prevdue);
		nd+=pd;
		
		try {
		pstmt=con.prepareStatement("update studentinfo set dues=? where rollno=?");
		pstmt.setDouble(1, nd);
		pstmt.setString(2, rollno);
		pstmt.execute();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return Double.toString(nd);
	}
	
	public boolean checkPassword(String rollno,String pass,String table)
	{
		try {
			pstmt=con.prepareStatement("select * from "+table+" where userid=? and pass=?");
		//	pstmt.setString(1, table);
			pstmt.setString(1, rollno);
			pstmt.setString(2, pass);
			if(pstmt.execute())
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		e.printStackTrace();
			
		}
		
		return false;
	}
	public void updatePassword(String rollno,String pass,String table )
	{
		try {
			pstmt=con.prepareStatement("update "+table+" set pass=? where userid=?");
	//		pstmt.setString(1, table);
			pstmt.setString(2, rollno);
			pstmt.setString(1, pass);
		pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"error");
		}
	}
	public boolean updateEmail(String rollno,String prevemail,String newemail,String table)
	{
		try {
			pstmt=con.prepareStatement("update "+table+" set gmail=? where rollno=? and gmail=?");
			pstmt.setString(1, newemail);
			pstmt.setString(2, rollno);
			pstmt.setString(3, prevemail);
			
		    boolean b=pstmt.execute();
		    if(b==false)
		    	throw new SQLException();
		    else
		    	return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"prev email or password is incorrect");
			return false;
		}	
	}
	
	public boolean addFaculty(String id,String name,String dateofbirth,String fathername,String mothername,String parentscontact,String urcontact,String gender,String address,String gmail)
	{
		
		String query="insert into facultyinfo(id,name,dateofbirth,gender,fathername,mothername,urcontact,parentscontact,address,gmail) value(?,?,?,?,?,?,?,?,?,?)";
	    try {
	    	pstmt=con.prepareStatement(query);
	    	pstmt.setString(1, id);
	    	pstmt.setString(2, name);
	    	pstmt.setString(3, dateofbirth);
	    	pstmt.setString(4, gender);
	    	pstmt.setString(5, fathername);
	    	pstmt.setString(6, mothername);
	    	pstmt.setString(7, urcontact);
	    	
	    	pstmt.setString(8, parentscontact);
	    	
	    	pstmt.setString(9, address);
	    	
	    	pstmt.setString(10, gmail);
	    	if(!pstmt.execute())
	    	{   
	    		JOptionPane.showMessageDialog(null,"Successfully added");
	    		
	    		
	    	}
	    	else
	    	{  
	    		JOptionPane.showMessageDialog(null,"Un-Successful");
	    		return false;
	    	}
	    }
	    catch(SQLException e)
	    {
	    	JOptionPane.showMessageDialog(null,"Un-Successful");
	    	e.printStackTrace();
	    	
	    }
	    
	    try {
			pstmt=con.prepareStatement("insert into facultylogin(userid) value(?)");
			pstmt.setString(1,id);
			pstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    return true;
	}
	public void updateFaculty(String id,String name,String dateofbirth,String fathername,String mothername,String parentscontact,String urcontact,String gender,String address,String gmail)
	{  
	    String querry="update facultyinfo set name=?,dateofbirth=?,fathername=?,mothername=?,parentscontact=?,urcontact=?,gender=?,address=?,gmail=? where id=?";
			try {
				pstmt=con.prepareStatement(querry);
				
				pstmt.setString(1, name);
				
				pstmt.setString(2, dateofbirth);
				pstmt.setString(3, fathername);
				pstmt.setString(4, mothername);
				pstmt.setString(5, parentscontact);
				pstmt.setString(6, urcontact);
				pstmt.setString(7,gender);
				
				pstmt.setString(8, address);
				pstmt.setString(9, gmail);
				pstmt.setString(10, id);
			      boolean b=pstmt.execute();
				if(b)
					 JOptionPane.showMessageDialog(null,"un-Success");
				else
					 JOptionPane.showMessageDialog(null,"Success");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public String[] searchFaculty(String id)
	{
		String s[]=new String[13];
		String querry="Select * from facultyinfo where id=?";
		try {
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			rs.next();
			s[0]=rs.getString("id");
			s[1]=getName();
			s[2]=getDob();
			s[3]=getFatherName();
			s[4]=getMotherName();
			s[5]=getGmailId();
			s[6]=getParentsContact();
			s[7]=getContact();
			s[8]=getGender();
			
			s[9]=getAddress();
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Employee id not found");
			//e.printStackTrace();
		}
		
		return s;
	}
	public void removeFaculty(String id)
	{

		String querry="delete from facultyinfo where id=?";
		try {
			pstmt=con.prepareStatement(querry);
			pstmt.setString(1, id);
			if(pstmt.execute())
				 JOptionPane.showMessageDialog(null,"Success");
			else
				 JOptionPane.showMessageDialog(null,"Un-Success");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt=con.prepareStatement("delete from facultylogin where userid=?");
			pstmt.setString(1, id);
			pstmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public boolean addAttendence(String rollno,String status,String date)
	{  boolean flag=true;
		try {
			
			pstmt=con.prepareStatement("Select * from studentlogin where userid=?");
					pstmt.setString(1, rollno);
			rs=pstmt.executeQuery();
			rs.next();
			if(rs.getString("userid").equals(rollno))
				JOptionPane.showMessageDialog(null, "Rollno  found");
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Rollno not found");
			flag=false;
		}
		if(flag) {
		try {
			pstmt=con.prepareStatement("select exists(select * from attendence where rollno=? and date=?)");
			pstmt.setString(1, rollno);
			pstmt.setString(2, date);
		    rs=pstmt.executeQuery();
		    rs.next();
		if(rs.getInt(1)==1)
		{
			pstmt=con.prepareStatement("update attendence set status=? where rollno=?");
			pstmt.setString(1,status);
			pstmt.setString(2, rollno);
			pstmt.execute();
		}
		else
		{
			pstmt=con.prepareStatement("insert into attendence(status,rollno,date) values(?,?,?) ");
			pstmt.setString(1,status);
			pstmt.setString(2, rollno);
			pstmt.setString(3, date);
			pstmt.execute();
			
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}}
		
		return flag;
	}
	
	
	public ArrayList<ArrayList<String>> getAttendence(String rollno,String startdate,String enddate)
	{
		ArrayList<ArrayList<String>> l=new ArrayList<ArrayList<String>>();
		try {
			pstmt=con.prepareStatement("select * from attendence where rollno=? and date>=? and date <=?");
			pstmt.setString(1, rollno);
			pstmt.setString(2, startdate);
			pstmt.setString(3, enddate);
			rs=pstmt.executeQuery();
			ArrayList<String> present =new ArrayList<String>();
			ArrayList<String> absent =new ArrayList<String>();
			while(rs.next())
			{
				if(rs.getString("status").equalsIgnoreCase("present"))
				{
					present.add(rs.getString("date"));
				}
				else
				{
					absent.add(rs.getString("date"));
				}
			}
			l.add(present);
			l.add(absent);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return l;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	protected void finalize()  {
		// TODO Auto-generated method stub
			try{con.close();
			rs.close();}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
 
}
