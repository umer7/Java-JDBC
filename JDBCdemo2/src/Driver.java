

import java.sql.*;

public class Driver {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		ResultSet myRs1 = null;
		
		try {
			// 1. Get a connection to database
			//myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "student" , "student");
			
			 myConn=DriverManager.getConnection("jdbc:mysql://localhost:3307/demo","root","umer");
			
				// 2. Create a statement
			
			/*myStmt = myConn.createStatement();
			
			// 3. Execute SQL query
			myRs = myStmt.executeQuery("select * from employees");
			
			// 4. Process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
			}
			
            myRs1 = myStmt.executeQuery("select count(id) from employees");
			
			// 4. Process the result set
			while (myRs1.next()) {
				System.out.println(myRs1.getString("count(id)"));
			}
			*/
			 
		/*	myStmt = myConn.createStatement();
			// 3. Execute SQL query
			String sql = "insert into employees " + " (last_name, first_name, email)"
			+ " values ('Brown', 'David', 'david.brown@foo.com')";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");*/
			 
		/*	 myStmt = myConn.createStatement();
			// 3. Execute SQL query
			String sql = "update employees set email='demo@luv2code.com' where id=9";
			int rowsAffected = myStmt.executeUpdate(sql);
			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Update complete.");  */
			 
			 myStmt = myConn.createStatement();
			// 3. Execute SQL query
			String sql = "delete from employees where last_name='Brown'";
			int rowsAffected = myStmt.executeUpdate(sql);
			System.out.println("Rows affected: " + rowsAffected);
			System.out.println("Delete complete.");
			
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}