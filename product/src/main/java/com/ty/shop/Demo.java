package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:postgresql://localhost:5432/shop";
		String user = "postgres" ;
		String password = "root" ;
		
		//step 1
		try {
			Class.forName("org.postgresql.Driver");
			
			//step 2
			Connection con =DriverManager.getConnection(url,user,password);
			System.out.println(con);
			
			String sql = "INSERT INTO product VALUES (1,'lg-31tv0091' ,23500,4)";
			//step 3
			Statement stm =con.createStatement();
			
			//step 4
			stm.execute(sql);
			
			//step 5
			con.close();
			System.out.println("data inserted");
			
		} 
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
