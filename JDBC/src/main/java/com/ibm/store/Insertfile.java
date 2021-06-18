package com.ibm.store;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.Clob;

public class Insertfile {

	public static void main(String[] args) {
			
		try
		{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/jdbcexample";
			String username="root";
			String password="1234";
			
			
			Class.forName(driver);
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement("insert into filed values(?,?");
	File f=
			
			ps.setInt(1,105);
	
	ps.setCharacterStream(2,fr,(int))
	
	
	
	
	PreparedStatement ps=con.prepareStatement("select * from  filedb");
	ResultSet rs=ps.executeQuery();
	rs.next();
	Clob c=rs.getClob(2);
	Reader r=c.getCharacterStream()
			FileWriter fw=new FileWriter
			int i;
	while(i=r.read()!=-1)
		fw.write((char)i));
		fw.close();
		System.out.println("success");
		con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();}
		}
	
	
	
	
	
	
	
	
	

}
