//package Package;
//
//import java.util.Scanner;
//import java.sql.Connection;
//import java.sql.Statement;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//
//public class Selector {
//	boolean rerunClass=true;
//    public static void main(String[] args) {
//    	 
//          
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Select an option:"); 
//        System.out.println("1 for Admin");
//        System.out.println("2 for Faculty");  
//        System.out.println("3 for Student");
//        System.out.print("Enter your choice: ");
//        
//        int option = scanner.nextInt();
//        String Url =
//    			"jdbc:mysql://localhost:3306/attendance_management_system"; 
//    			String username = "root";
//    			String pass = "suni"; // enter actual password
//    			try {
//    			// Establish a connection
//    			Connection connection = DriverManager.getConnection(Url,username, pass);
//    			Statement statement = connection.createStatement();
//        switch(option) {
//            case 1: 
//                // Code for Option 1
//            	while(true) {
//            	String Username= "admin";
//            	String password = "root";
//            	Scanner sc = new Scanner(System.in);
//            	System.out.println("Enter Username: ");
//            	String entered_username = sc.nextLine();
//            	System.out.println("Enter Password: ");
//            	String entered_password = sc.nextLine();
//            	if(Username.equals(entered_username) && password.equals(entered_password))
//            	{
//            		System.out.println("Login Successful !!");
//            		System.out.println("Select your choice : ");
//            		System.out.println("1 - View Student's Feed");
//            		System.out.println("2 - View Faculty's Feed");
//            		System.out.println("3 - Register new Student"); 
//            		System.out.println("4 - Register new staff ");
//            		System.out.println("5 - Terminate Student");
//            		System.out.println("6 - Terminate Faculty"); 
//                      int choice = sc.nextInt();
//            		switch(choice) {
//            		case 1:
//                    	Selector obj1 = new Selector();
//                    	obj1.StudentLogs(statement); 
//                    	break; 
//            		case 2:
//            			Selector obj2 = new Selector();
//            			obj2.FacultyLogs(statement); 
//            			break; 
//            		case 3:
//            			Selector obj3 = new Selector();
//            			obj3.addStudent(statement);
//            			break;
//            		case 4:
//            			Selector obj4 = new Selector();
//            			obj4.addFaculty(statement);
//            			break;
//            		}
//                } 
//            	else { 
//            		System.out.println("Login unsuccessful !! Recheck your username and password.");
//            	}
//            	break; 
//            } 
//            	break;  
//		case 2: 
//                // Code for Option 2
//			/*while(true) {
//            	String Username= "admin";
//            	String password = "root";
//            	Scanner sc = new Scanner(System.in);
//            	System.out.println("Enter Username: ");
//            	String entered_username = sc.nextLine();
//            	System.out.println("Enter Password: ");
//            	String entered_password = sc.nextLine();
//            	if(Username.equals(entered_username) && password.equals(entered_password))
//            	{
//            		System.out.println("Login Successful !!");
//            		break;
//            	} 
//            	else {
//            		System.out.println("Login unsuccessful !! Recheck your username and password.");
//            	}
//			}
//                break;*/ 
//            case 3:
//                // Code for Option 3
//                System.out.println("Executing Option 3 code...");
//                break;
//            default:
//                System.out.println("Invalid option selected.");
//        }
//        scanner.close();
//        } catch (SQLException e) { 
//            System.out.println("Error: " + e.getMessage());
//        }
//    }
//   
//    public void StudentLogs(Statement statement) throws SQLException  { 
//          ResultSet resultSet = statement.executeQuery("SELECT * FROM student_table_all");
//		
//
//        // Printing table headers 
//        int columnCount = resultSet.getMetaData().getColumnCount();
//        for (int i = 1; i <= columnCount; i++) {
//            System.out.print(resultSet.getMetaData().getColumnName(i) + "\t");
//        }
//        System.out.println();
//        System.out.println();
//        while (resultSet.next()) {
//            for (int i = 1; i <= columnCount; i++) {
//                System.out.print(resultSet.getString(i) + "\t");
//            }
//            System.out.println();
//        }
//        Scanner scann = new Scanner(System.in);
//        while(true) {
//        	
//        System.out.println("Enter your choice :  ");
//        int choice_1 = scann.nextInt();
//        if(choice_1 == 1) {
//         Selector obj5 = new Selector();
//         obj5.FacultyLogs(statement);
//        } else if(choice_1 == 2) {
//        	Selector obj6 = new Selector();
//            obj6.addStudent(statement);	
//        	}
//        else if(choice_1 == 3) { 
//        	Selector obj7 = new Selector();
//            obj7.addFaculty(statement); 
//        }
//        else { 
//        	System.out.println("Returning to home menu");
////        	rerunClass = false;
//        }
//        } 
//             }  		
//	
//
//	public void addStudent(Statement statement) throws SQLException {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Student Id : "); 
//		String Id = scan.nextLine();
//		System.out.println("Enter Student name : ");
//		String name = scan.nextLine();
//		System.out.println("Enter student address : ");
//		String address = scan.nextLine();
//		System.out.println("Enter phone number : ");
//		String phno = scan.nextLine(); 
//		System.out.println("Enter Date of joining : ");
//		String date_of_join = scan.nextLine();
//		System.out.println("Enter Student class : ");
//		String clas = scan.nextLine(); 
//
//		String query = "INSERT INTO student_table_all(Student_id,Student_name,Student_address,Student_phno,Date_of_join,Student_class) VALUES('" + Id + "','" + name + "','" + address + "','" + phno + "','" + date_of_join + "','" + clas + "')"; 
//		int rowsAffected = statement.executeUpdate(query); 
//		System.out.println("Student added Successfully with the details : "+ rowsAffected);
//    } 
//		
//    public void FacultyLogs(Statement statement)throws SQLException{
//    	  ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty_table_all"); 
//  	
//
//          // Printing table headers 
//          int columnCount = resultSet.getMetaData().getColumnCount(); 
//          for (int i = 1; i <= columnCount; i++) {
//              System.out.print(resultSet.getMetaData().getColumnName(i) + "\t");
//          }
//          System.out.println(); 
//          System.out.println();
//          while (resultSet.next()) {
//              for (int i = 1; i <= columnCount; i++) {
//                  System.out.print(resultSet.getString(i) + "\t");
//              }
//              System.out.println();
//          }
//       }  
//    public void addFaculty(Statement statement) throws SQLException {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Faculty Id : ");
//		String Id = scan.nextLine();
//		System.out.println("Enter Faculty name : "); 
//		String name = scan.nextLine();
//		System.out.println("Enter Faculty address : ");
//		String address = scan.nextLine();
//		System.out.println("Enter Faculty Department : ");
//		String department = scan.nextLine();
//		System.out.println("Enter phone number : "); 
//		String phno = scan.nextLine();
//
//		String query = "INSERT INTO faculty_table_all(Faculty_Id,Faculty_name,Faculty_address,Department,phone_no) VALUES('" + Id + "','" + name + "','" + address + "','" + department + "','" +phno+ "')";
//		int rowsAffected = statement.executeUpdate(query);
//		System.out.println("Student added Successfully with the details : "+ rowsAffected);
//    } 
//   
//    }
//
///* Methods for admin:                                                  Features for admin: 
//
// 1. addStudent,removeStudent                                             1. 
// 2. addFaculty,removeFaculty
// 3. Attendance_status(STUDENT and FACULTY)
// 4. StudentLogs 
// 5.FacultyLogs
// 
// Methods for student:
// 1. view_student;
// 2. Provide_Feedback;
// 
// Methods for faculty:
// 1. view_faculty 
// 2.view_students; 
// 
// 
// 
// */

package Package;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Selector {
    boolean rerunClass = true;

    public static void main(String[] args) {
        Selector obj = new Selector();
        obj.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (rerunClass) {
            System.out.println("-^-^-^-^-SELECT A MODULE-^-^-^-^-"); 
            System.out.println("1 for Admin");
            System.out.println("2 for Faculty");
            System.out.println("3 for Student");
            System.out.print("Enter your choice: ");

            int option = scanner.nextInt();
            String Url = "jdbc:mysql://localhost:3306/attendance_management_system";
            String username = "root";
            String pass = "suni"; // enter actual password

            try {
                // Establish a connection
                Connection connection = DriverManager.getConnection(Url, username, pass);
                Statement statement = connection.createStatement();

                switch (option) {
                    case 1:
                        // Code for Option 1
                        while (true) {
                        	System.out.println("~~~~~~~WELCOME TO ADMIN MODULE~~~~~~~");
                            String Username = "admin";
                            String password = "root";
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter Username: ");
                            String entered_username = sc.nextLine();
                            System.out.println("Enter Password: ");
                            String entered_password = sc.nextLine();
                            if (Username.equals(entered_username) && password.equals(entered_password)) {
                                System.out.println("Login Successful !!");
                                System.out.println("Select your choice : ");
                                System.out.println("1 - View Student's Feed");
                                System.out.println("2 - View Faculty's Feed");
                                System.out.println("3 - Register new Student");
                                System.out.println("4 - Register new staff ");
                                System.out.println("5 - Terminate Student");
                                System.out.println("6 - Terminate Faculty");
                                System.out.println("7 - View Student's Attendance ");
                                System.out.println("8 - View Faculty's Attendance"+ "\n Enter any key for home menu...");
                                 
                                int choice = sc.nextInt();
                                switch (choice) {
                                    case 1:
                                        Selector obj1 = new Selector();
                                        obj1.StudentLogs(statement);
                                        break;
                                    case 2:
                                        Selector obj2 = new Selector();
                                        obj2.FacultyLogs(statement);
                                        break;
                                    case 3:
                                        Selector obj3 = new Selector();
                                        obj3.addStudent(statement);
                                        break;
                                    case 4: 
                                        Selector obj4 = new Selector();
                                        obj4.addFaculty(statement);
                                        break;
                                    case 5:
                                    	Selector obj5 = new Selector();
                                        obj5.TerminateStudent(statement);
                                        break;
                                    case 6:
                                    	Selector obj6 = new Selector();
                                        obj6.TerminateFaculty(statement);
                                        break;
                                    case 7:
                                    	Selector obj7 = new Selector();
                                        obj7.StudentAttendanceLogs(statement);
                                        break;
                                    case 8:
                                    	Selector obj8 = new Selector();
                                        obj8.FacultyAttendanceLogs(statement);
                                        break;
                                    default:
                                    	  System.out.println("Returning to home menu");
                                          rerunClass = true;
                                          break;
                                	
                               }
                            } else {
                                System.out.println("Login unsuccessful !! Recheck your username and password.");
                                
                            }
                            break;
                        }
                        break;
                    case 2:
                        while(true) {
                      		System.out.println("~~~~~~~WELCOME TO FACULTY MODULE~~~~~~~");
                            String Username= "admin";
                            String password = "root";
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter Username: ");
                            String entered_username = sc.nextLine();
                            System.out.println("Enter Password: ");
                            String entered_password = sc.nextLine();
                            if(Username.equals(entered_username) && password.equals(entered_password))
                            {
                                System.out.println("Login Successful !!");
                                break;
                            } 
                            else {
                                System.out.println("Login unsuccessful !! Recheck your username and password.");
                            }
                            }
                       Scanner sc = new Scanner(System.in);
                       System.out.println("Enter Faculty ID : ");
                       String FacultyId = sc.nextLine();
           // Execute the SQL query to select all columns from the faculty_attendance_logs table where the Faculty_Id matches the provided FacultyId
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty_attendance_logs WHERE Faculty_Id='" + FacultyId + "'");
              // Printing table headers
                     // Retrieve the number of columns in the result set     
                        int columnCount = resultSet.getMetaData().getColumnCount();
                     // Loop through each column and print its name with a fixed width of 16 characters
                        for (int i = 1; i <= columnCount; i++) {
                            System.out.format("|%16s", resultSet.getMetaData().getColumnName(i));
                        }
                     // Print a separator line for each column
                        System.out.println("|");
                        System.out.println("+--------------------------------------------------------------------+\n");

     
                     // Iterate over each row in the result set
                        while (resultSet.next()) {
                            // Loop through each column in the current row
                            for (int i = 1; i <= columnCount; i++) {
                                String value = resultSet.getString(i);
                             // Print the value with a fixed width of 16 characters
                                System.out.format("|%16s", value);
                            }
                         // Move to the next line after printing all column values for the current row
                            System.out.println("|");
               }
                        
                        break;
                    case 3:
                    	 Scanner s = new Scanner(System.in);
                   		System.out.println("~~~~~~~WELCOME TO STUDENT MODULE~~~~~~~");
                         System.out.println("Enter Student ID : ");
                         String StudentId = s.nextLine();
                          ResultSet resultSet1 = statement.executeQuery("SELECT * FROM student_attendance_logs WHERE Student_Id='" + StudentId + "'");

                          // Printing table headers 
                          int columnCount1 = resultSet1.getMetaData().getColumnCount();
                          for (int i = 1; i <= columnCount1; i++) {
                              System.out.format("|%16s", resultSet1.getMetaData().getColumnName(i));
                          }
                          
                          System.out.println("|");
                          System.out.println("+--------------------------------------------------------------------+\n");

                          // Printing rows
                          while (resultSet1.next()) {
                              for (int i = 1; i <= columnCount1; i++) {
                                  String value = resultSet1.getString(i);
                                  System.out.format("|%16s", value);
                              }
                              System.out.println("|");
                 }
                          System.out.println("=======================================");
                          System.out.println("THANK YOU FOR USING STUDENT MODULE !!!");
                          System.out.println("=======================================");
                        break;
                    default:
                        System.out.println("Invalid option selected.");
                        System.out.println("Returning to home menu...........");
                        run(); // Restart the execution of the class
                        break;
                }
               
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        // Close the scanner after the loop terminates
        scanner.close();
    }

  
	private void StudentAttendanceLogs(Statement statement) throws SQLException {
  		System.out.println("^^^^^^^STUDENT ATTENDANCE LOGS^^^^^^^");
	    ResultSet resultSet = statement.executeQuery("SELECT * FROM student_attendance_logs");

        // Printing table headers 
        int columnCount = resultSet.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.format("|%16s", resultSet.getMetaData().getColumnName(i));
        }
        
        System.out.println("|");
        System.out.println("+--------------------------------------------------------------------+\n");

        // Printing rows
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                String value = resultSet.getString(i);
                System.out.format("|%16s", value);
            }
            System.out.println("|");
           
        }
		 Scanner scann = new Scanner(System.in);
         while(true) {
             
         System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
         		+ "2 - View Faculty's Feed\r\n"
         		+ "3 - Register new Student \r\n"
         		+ "4 - Register new staff\r\n" 
         		+ "5 - Terminate Student\r\n" 
         	    + "6 - Terminate Faculty\r\n"
         	    + "7 - View Student's Attendance\r\n"
         	    + "8 - View Faculty's Attendance\r\n"
         		+ "\n Enter any key for home menu..."); 
         int choice_1 = scann.nextInt();
         if(choice_1 == 1) {
          Selector obj1 = new Selector();
          obj1.StudentLogs(statement);
         } 
         else if(choice_1 == 2) {
             Selector obj2 = new Selector();
             obj2.FacultyLogs(statement);    
         }else if(choice_1 == 3) {
             Selector obj3 = new Selector();
             obj3.addStudent(statement);    
         }
         else if(choice_1 == 4) { 
             Selector obj4 = new Selector();
             obj4.addFaculty(statement); 
         }
         else if(choice_1 == 5) { 
             Selector obj5 = new Selector();
             obj5.TerminateStudent(statement); 
         }
         else if(choice_1 == 6) { 
             Selector obj6 = new Selector();
             obj6.TerminateFaculty(statement); 
         }
         else if(choice_1 == 7) { 
             Selector obj7 = new Selector();
             obj7.StudentAttendanceLogs(statement); 
         }
         else if(choice_1 == 8) { 
             Selector obj8 = new Selector();
             obj8.FacultyAttendanceLogs(statement); 
         }
         else { 
           System.out.println("Returning to home menu...........");
           rerunClass = false;
           break; 
              }   
         }
}

	private void FacultyAttendanceLogs(Statement statement) throws SQLException {
  		System.out.println("^^^^^^^FACULTY ATTENDANCE LOGS^^^^^^^");
		 ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty_attendance_logs");

	        // Printing table headers 
	        int columnCount = resultSet.getMetaData().getColumnCount();
	        for (int i = 1; i <= columnCount; i++) {
	            System.out.format("|%16s", resultSet.getMetaData().getColumnName(i));
	        }
	        
	        System.out.println("|");
	        System.out.println("+--------------------------------------------------------------------+\n");
	        while (resultSet.next()) {
	            for (int i = 1; i <= columnCount; i++) {
	                String value = resultSet.getString(i);
	                System.out.format("|%16s", value);
	            }
	            System.out.println("|");
	           
	        }
	        // Printing rows
	        Scanner scann = new Scanner(System.in);
	          while(true) {
	              
	          System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
	          		+ "2 - View Faculty's Feed\r\n"
	          		+ "3 - Register new Student \r\n"
	          		+ "4 - Register new staff\r\n" 
	          		+ "5 - Terminate Student\r\n"
	          	    + "6 - Terminate Faculty\r\n"
	          	    + "7 - View Student's Attendance\r\n"
	         	    + "8 - View Faculty's Attendance\r\n"
	          		+ "\n Enter any key for home menu..."); 
	         
	         
	          int choice_1 = scann.nextInt();
	          if(choice_1 == 1) {
	               Selector obj1 = new Selector();
	               obj1.StudentLogs(statement);
	              } 
	              else if(choice_1 == 2) {
	                  Selector obj2 = new Selector();
	                  obj2.FacultyLogs(statement);    
	              }else if(choice_1 == 3) {
	                  Selector obj3 = new Selector();
	                  obj3.addStudent(statement);    
	              }
	              else if(choice_1 == 4) { 
	                  Selector obj4 = new Selector();
	                  obj4.addFaculty(statement); 
	              }
	              else if(choice_1 == 5) { 
	                  Selector obj5 = new Selector();
	                  obj5.TerminateStudent(statement); 
	              }
	              else if(choice_1 == 6) { 
	                  Selector obj6 = new Selector();
	                  obj6.TerminateFaculty(statement); 
	              }
	              else if(choice_1 == 7) { 
	                  Selector obj7 = new Selector();
	                  obj7.StudentAttendanceLogs(statement); 
	              }
	              else if(choice_1 == 8) { 
	                  Selector obj8 = new Selector();
	                  obj8.FacultyAttendanceLogs(statement); 
	              }
	          
	          else { 
	            System.out.println("Returning to home menu.............");
	            rerunClass = true;  
	            break; 
	          } 
	 }      
}

	public void StudentLogs(Statement statement) throws SQLException {
  		System.out.println("^^^^^^^STUDENT'S FEED^^^^^^^");
		ResultSet resultSet = statement.executeQuery("SELECT * FROM student_table_all");

        // Printing table headers 
        int columnCount = resultSet.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.format("|%16s", resultSet.getMetaData().getColumnName(i));
        }
        
        System.out.println("|");
        System.out.println("+-----------------------------------------------------------------------------------------------------+\n");
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                String value = resultSet.getString(i);
                System.out.format("|%16s", value);
            }
            System.out.println("|");
           
        }
          Scanner scann = new Scanner(System.in);
          while(true) {
              
          System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
          		+ "2 - View Faculty's Feed\r\n"
          		+ "3 - Register new Student \r\n"
          		+ "4 - Register new staff\r\n" 
          		+ "5 - Terminate Student\r\n"
          	    + "6 - Terminate Faculty\r\n"
          	    + "7 - View Student's Attendance\r\n"
       	        + "8 - View Faculty's Attendance\r\n"
          		+ "\n Enter any key for home menu..."); 
         
         
          int choice_1 = scann.nextInt();
          if(choice_1 == 1) {
              Selector obj1 = new Selector();
              obj1.StudentLogs(statement);
             } 
             else if(choice_1 == 2) {
                 Selector obj2 = new Selector();
                 obj2.FacultyLogs(statement);    
             }else if(choice_1 == 3) {
                 Selector obj3 = new Selector();
                 obj3.addStudent(statement);    
             }
             else if(choice_1 == 4) { 
                 Selector obj4 = new Selector();
                 obj4.addFaculty(statement); 
             }
             else if(choice_1 == 5) { 
                 Selector obj5 = new Selector();
                 obj5.TerminateStudent(statement); 
             }
             else if(choice_1 == 6) { 
                 Selector obj6 = new Selector();
                 obj6.TerminateFaculty(statement); 
             }
             else if(choice_1 == 7) { 
                 Selector obj7 = new Selector();
                 obj7.StudentAttendanceLogs(statement); 
             }
             else if(choice_1 == 8) { 
                 Selector obj8 = new Selector();
                 obj8.FacultyAttendanceLogs(statement); 
             }
          
          else { 
            System.out.println("Returning to home menu............");
            rerunClass = false;
            break; 
          } 
          
          }
          
    }

    public void addStudent(Statement statement) throws SQLException {
        Scanner scan = new Scanner(System.in);
  		System.out.println("^^^^^^^ADD STUDENT^^^^^^^");
        System.out.println("Enter Student Id : "); 
        String Id = scan.nextLine();
        System.out.println("Enter Student name : ");
        String name = scan.nextLine();
        System.out.println("Enter student address : ");
        String address = scan.nextLine();
        System.out.println("Enter phone number : ");
        String phno = scan.nextLine(); 
        System.out.println("Enter Date of joining : ");
        String date_of_join = scan.nextLine();
        System.out.println("Enter Student class : ");
        String clas = scan.nextLine(); 

        String query = "INSERT INTO student_table_all(Student_id,Student_name,Student_address,Student_phno,Date_of_join,Student_class) VALUES('" + Id + "','" + name + "','" + address + "','" + phno + "','" + date_of_join + "','" + clas + "')"; 
        int rowsAffected = statement.executeUpdate(query); 
        System.out.println("Student added Successfully with the details !! "+" Rows affected : "+ rowsAffected);
        Scanner scann = new Scanner(System.in);
        while(true) {
            
        System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
        		+ "2 - View Faculty's Feed\r\n"
        		+ "3 - Register new Student \r\n"
        		+ "4 - Register new staff\r\n" 
        		+ "5 - Terminate Student\r\n"
        	    + "6 - Terminate Faculty\r\n"
        	    + "7 - View Student's Attendance\r\n"
         	    + "8 - View Faculty's Attendance\r\n"
        	    + "\n Enter any key for home menu..."); 
       
       
        int choice_1 = scann.nextInt();
        if(choice_1 == 1) {
            Selector obj1 = new Selector();
            obj1.StudentLogs(statement);
           } 
           else if(choice_1 == 2) {
               Selector obj2 = new Selector();
               obj2.FacultyLogs(statement);    
           }else if(choice_1 == 3) {
               Selector obj3 = new Selector();
               obj3.addStudent(statement);    
           }
           else if(choice_1 == 4) { 
               Selector obj4 = new Selector();
               obj4.addFaculty(statement); 
           }
           else if(choice_1 == 5) { 
               Selector obj5 = new Selector();
               obj5.TerminateStudent(statement); 
           }
           else if(choice_1 == 6) { 
               Selector obj6 = new Selector();
               obj6.TerminateFaculty(statement); 
           }
           else if(choice_1 == 7) { 
               Selector obj7 = new Selector();
               obj7.StudentAttendanceLogs(statement); 
           }
           else if(choice_1 == 8) { 
               Selector obj8 = new Selector();
               obj8.FacultyAttendanceLogs(statement); 
           }
        
        else { 
          System.out.println("Returning to home menu............");
          rerunClass = false;
          break; 
        } 
        
        }
}

    public void FacultyLogs(Statement statement) throws SQLException {
  		System.out.println("^^^^^^^FACULTY'S FEED^^^^^^^");
    	ResultSet resultSet = statement.executeQuery("SELECT * FROM faculty_table_all");

        // Printing table headers 
        int columnCount = resultSet.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.format("|%16s", resultSet.getMetaData().getColumnName(i));
        }
        
        System.out.println("|");
        System.out.println("+-----------------------------------------------------------------------------------------------------+\n");
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                String value = resultSet.getString(i);
                System.out.format("|%16s", value);
            }
            System.out.println("|");
           
        }
           Scanner scann = new Scanner(System.in);
           while(true) {
               
           System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
           		+ "2 - View Faculty's Feed\r\n"
           		+ "3 - Register new Student \r\n"
           		+ "4 - Register new staff\r\n" 
           		+ "5 - Terminate Student\r\n"
           	    + "6 - Terminate Faculty\r\n"
           	    + "7 - View Student's Attendance\r\n"
      	        + "8 - View Faculty's Attendance\r\n"
           		+ "\n Enter any key for home menu..."); 
          
          
           int choice_1 = scann.nextInt();
           if(choice_1 == 1) {
               Selector obj1 = new Selector();
               obj1.StudentLogs(statement);
              } 
              else if(choice_1 == 2) {
                  Selector obj2 = new Selector();
                  obj2.FacultyLogs(statement);    
              }else if(choice_1 == 3) {
                  Selector obj3 = new Selector();
                  obj3.addStudent(statement);    
              }
              else if(choice_1 == 4) { 
                  Selector obj4 = new Selector();
                  obj4.addFaculty(statement); 
              }
              else if(choice_1 == 5) { 
                  Selector obj5 = new Selector();
                  obj5.TerminateStudent(statement); 
              }
              else if(choice_1 == 6) { 
                  Selector obj6 = new Selector();
                  obj6.TerminateFaculty(statement); 
              }
              else if(choice_1 == 7) { 
                  Selector obj7 = new Selector();
                  obj7.StudentAttendanceLogs(statement); 
              }
              else if(choice_1 == 8) { 
                  Selector obj8 = new Selector();
                  obj8.FacultyAttendanceLogs(statement); 
              }
           
           else { 
             System.out.println("Returning to home menu...........");
             rerunClass = false;
             break; 
           } 
           
           }
    }

    public void addFaculty(Statement statement) throws SQLException {
        Scanner scan = new Scanner(System.in);
  		System.out.println("^^^^^^^ADD FACULTY^^^^^^^");
        System.out.println("Enter Faculty Id : ");
        String Id = scan.nextLine();
        System.out.println("Enter Faculty name : "); 
        String name = scan.nextLine();
        System.out.println("Enter Faculty address : ");
        String address = scan.nextLine();
        System.out.println("Enter Faculty Department : ");
        String department = scan.nextLine();
        System.out.println("Enter phone number : "); 
        String phno = scan.nextLine();

        String query = "INSERT INTO faculty_table_all(Faculty_Id,Faculty_name,Faculty_address,Department,phone_no) VALUES('" + Id + "','" + name + "','" + address + "','" + department + "','" +phno+ "')";
        int rowsAffected = statement.executeUpdate(query);
        System.out.println("Student added Successfully with the details : "+ rowsAffected);
        
        Scanner scann = new Scanner(System.in);
        while(true) {
            
        System.out.println("\n\n Enter your choice :  \n1 - View Student's Feed\r\n"
        		+ "2 - View Faculty's Feed\r\n"
        		+ "3 - Register new Student \r\n"
        		+ "4 - Register new staff\r\n" 
        		+ "5 - Terminate Student\r\n"
        	    + "6 - Terminate Faculty\r\n"
        	    + "7 - View Student's Attendance\r\n"
         	    + "8 - View Faculty's Attendance\r\n"
        		+ "\n Enter any key for home menu..."); 
       
       
        int choice_1 = scann.nextInt();
        if(choice_1 == 1) {
         Selector obj1 = new Selector();
         obj1.StudentLogs(statement);
        } 
        else if(choice_1 == 2) {
            Selector obj2 = new Selector();
            obj2.FacultyLogs(statement);    
        }else if(choice_1 == 3) {
            Selector obj3 = new Selector();
            obj3.addStudent(statement);    
        }
        else if(choice_1 == 4) { 
            Selector obj4 = new Selector();
            obj4.addFaculty(statement); 
        }
        else if(choice_1 == 5) { 
            Selector obj5 = new Selector();
            obj5.TerminateStudent(statement); 
        }
        else if(choice_1 == 6) { 
            Selector obj6 = new Selector();
            obj6.TerminateFaculty(statement); 
        }
        else if(choice_1 == 7) { 
            Selector obj7 = new Selector();
            obj7.StudentAttendanceLogs(statement); 
        }
        else if(choice_1 == 8) { 
            Selector obj8 = new Selector();
            obj8.FacultyAttendanceLogs(statement); 
        }
        else { 
          System.out.println("Returning to home menu...........");
          rerunClass = false;
          break; 
        } 
        
        }
    }
    public void TerminateStudent(Statement statement) throws SQLException {
  		Scanner scanner1 = new Scanner(System.in);
  		System.out.println("^^^^^^^TERMINATE STUDENT^^^^^^^");
  		System.out.println("Enter the student Id :");
  		String ID =  scanner1.nextLine();
  		System.out.println("Are you sure ?");
  		String conform = scanner1.nextLine();
  		if(conform.equalsIgnoreCase("yes")) {
  			String query = "DELETE FROM student_table_all WHERE Student_id='" + ID + "' ";
  			int rowsAffected = statement.executeUpdate(query);
           System.out.println("Student dropped successfully!!"+ "Rows Affected : "+ rowsAffected);
           System.out.println("Select your choice : ");
           System.out.println("1 - View Student's Feed");
           System.out.println("2 - View Faculty's Feed");
           System.out.println("3 - Register new Student");
           System.out.println("4 - Register new staff ");
           System.out.println("5 - Terminate Student");
           System.out.println("6 - Terminate Faculty\n"+ "7 - View Student's Attendance\r\n"
            	    + "8 - View Faculty's Attendance\r\n"+ "\n Enter any key for home menu...");
           Scanner sc = new Scanner(System.in);
           int choice = sc.nextInt();
           switch (choice) {
               case 1:
                   Selector obj1 = new Selector(); 
                   obj1.StudentLogs(statement);
                   break;
               case 2:
                   Selector obj2 = new Selector();
                   obj2.FacultyLogs(statement);
                   break;
               case 3:
                   Selector obj3 = new Selector();
                   obj3.addStudent(statement);
                   break;
               case 4: 
                   Selector obj4 = new Selector();
                   obj4.addFaculty(statement);
                   break;
               case 5:
               	Selector obj5 = new Selector();
                   obj5.TerminateStudent(statement);
                   break;
               case 6:
               	Selector obj6 = new Selector();
                   obj6.TerminateFaculty(statement);
                   break;
               case 7:
                 	Selector obj7 = new Selector();
                     obj7.StudentAttendanceLogs(statement);
                     break;
              case 8:
                 	Selector obj8 = new Selector();
                     obj8.FacultyAttendanceLogs(statement);
                     break;
               default:
               	  System.out.println("Returning to home menu...........");
                     rerunClass = true;
                     break;
           	
          }
  			
  		} 
  	} 

  	private void TerminateFaculty(Statement statement)throws SQLException {
  		Scanner scanner1 = new Scanner(System.in);
  		System.out.println("^^^^^^^TERMINATE FACULTY^^^^^^^");
  		System.out.println("Enter the faculty Id :");
  		String ID =  scanner1.nextLine();
  		System.out.println("Are you sure ?!");
  		String conform = scanner1.nextLine();
  		if(conform.equalsIgnoreCase("yes")) {
  			String query = "DELETE FROM faculty_table_all WHERE Faculty_Id='" + ID + "' ";
  			int rowsAffected = statement.executeUpdate(query);
           System.out.println("Faculty dropped successfully!!"+ "Rows Affected : "+ rowsAffected);
           System.out.println("Select your choice : ");
           System.out.println("1 - View Student's Feed");
           System.out.println("2 - View Faculty's Feed");
           System.out.println("3 - Register new Student");
           System.out.println("4 - Register new staff ");
           System.out.println("5 - Terminate Student");
           System.out.println("6 - Terminate Faculty\n"+ "7 - View Student's Attendance\r\n"
            	    + "8 - View Faculty's Attendance\r\n"+ "\n Enter any key for home menu...");
           Scanner sc = new Scanner(System.in);
           int choice = sc.nextInt();
           switch (choice) {
               case 1:
                   Selector obj1 = new Selector();
                   obj1.StudentLogs(statement);
                   break;
               case 2:
                   Selector obj2 = new Selector();
                   obj2.FacultyLogs(statement);
                   break;
               case 3:
                   Selector obj3 = new Selector();
                   obj3.addStudent(statement);
                   break;
               case 4: 
                   Selector obj4 = new Selector();
                   obj4.addFaculty(statement);
                   break;
               case 5:
               	Selector obj5 = new Selector();
                   obj5.TerminateStudent(statement);
                   break;
               case 6:
               	Selector obj6 = new Selector();
                   obj6.TerminateFaculty(statement);
                   break;
               case 7:
                  	Selector obj7 = new Selector();
                      obj7.StudentAttendanceLogs(statement);
                      break;
               case 8:
                  	Selector obj8 = new Selector();
                      obj8.FacultyAttendanceLogs(statement);
                      break;
               default:
               	  System.out.println("Returning to home menu...........");
                     rerunClass = true;
                     break;
           	
          }
  		
  	}

  	}
}

