package dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.PreparedStatement;


import model.*;
import Database.MyConnector;

public class CustomerDAO {
    
    public static boolean CreateRegistrationTable(){
        /*
        * Create a new database creds
        * @return true if created successfully.
        * @return false if unsuccessful with corresponding error message printed
        */
        Connection conn = MyConnector.dbConnect();
        String sqlCommand="create table Creds(e_id int primary key auto_increment, f_name varchar(50), l_name varchar(50), email varchar(70), DOB date, u_name varchar(50), pass varchar(50), securityQ varchar(255), answer varchar(255));";
        
        try{
            Statement stmt=conn.createStatement();
            stmt.execute(sqlCommand);
            return true;
        }
        catch(Exception e){
            System.out.println("Error message in CustomerDAO.CreateRegistrationTable: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error in CustomerDAO.CreateRegistrationTable.finally: "+ e);
            }
        }
        
        return false;
    }
    
    public static boolean InsertRegistrationData(RegistrationModel model) {
        /*
        * Inserts the data from registration page to database.
        * @return true if successful.
        * @return false if unsuccessfull with respective error message printed.
        */
        Connection conn=MyConnector.dbConnect();
        
        try{
            Statement stmt=conn.createStatement();
            //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
            String sqlCommand = "insert into creds(f_name, l_name, email, DOB, u_name, pass, securityQ, answer) values('"+model.getFirstName()+"','"+model.getLastName()+"','"+model.getEmail()+"','"+model.getDateOfBirth()+"','"+model.getUsername()+"','"+model.getPassword()+"','"+model.getSecurity()+"','"+model.getAnswer()+"')";
            stmt.executeUpdate(sqlCommand);
            searchRegistrationData(model);// to assign e_id.
            return true;
        }
        catch(Exception e){
            System.out.println("Error message in InsertRegistrationData: "+e);  
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error in dao.CustomerDAO.InsertRegistrationData().finally: "+e);
            }
        }
        return false;
    }
    
    public static boolean updateRegistrationData(RegistrationModel model){
        /*
        * Updates the conn table.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        
        PreparedStatement preStmt = null;
        Connection conn = MyConnector.dbConnect();
        
        String sqlCommand="UPDATE creds SET e_id=?, f_name=?, l_name=?, email=?, DOB=?, u_name=?, pass=?, securityQ=?, answer=? WHERE u_name=?";
    
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setInt(1,model.getId());
            preStmt.setString(2,model.getFirstName());
            preStmt.setString(3,model.getLastName());
            preStmt.setString(4,model.getEmail());
            preStmt.setString(5,model.getDateOfBirth());
            preStmt.setString(6,model.getUsername());
            preStmt.setString(7,model.getPassword());
            preStmt.setString(8,model.getSecurity());
            preStmt.setString(9,model.getAnswer());
            preStmt.setString(10, model.getUsername());
            
            preStmt.execute();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in CustomerDAO.update: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println(" Error in dao.CustomerDAO.update().finally: "+e);
            }
        }
        return false;
    }   
    public static boolean deleteRegistrationData(RegistrationModel model){
        /*
        * Deletes a row from the creds table according to the username.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt=null;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="DELETE FROM creds WHERE u_name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, model.getUsername());
            preStmt.execute();
            return true;
        }
        catch(Exception e){
            System.out.println("Error in CustomerDAO.delete: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println(" Error at CustomerDAO.delete.finally: "+e);
            }
        }
        return false;
    }
    
    public static boolean searchRegistrationData(RegistrationModel model){
        /*
        * Searches for the full detail of the username and sets the value to the model.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt = null;
        ResultSet rs=null;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="SELECT * FROM creds WHERE u_name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, model.getUsername());
            rs=preStmt.executeQuery();
            if (rs.next()){
                model.setId(Integer.parseInt(rs.getString("e_id")));
                model.setFirstName(rs.getString("f_name"));
                model.setLastName(rs.getString("l_name"));
                model.setEmail(rs.getString("email"));
                model.setDateOfBirth(rs.getString("DOB"));
                model.setUsername(rs.getString("u_name"));
                model.setPassword(rs.getString("pass"));
                model.setSecurityQ(rs.getString("securityQ"));
                model.setAnswer(rs.getString("answer"));
                
                return true;
            }
            else{
                System.out.println("At CustomerDAO.search no username in database found");
            }
          
        }
        catch(Exception e){
            System.out.println("Error in CustomerDAO.search: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CustomerDAO.search.try: "+e);
            }
         
        }
        return false;
    }

    public static void main(String[] args){
        // Testing methods.
        String firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer;
        
        firstName="testFname";
        lastName="testLname";
        email="test@email.com";
        dateOfBirth="2003-12-12";
        username="godf";
        password="test";
        confirmPassword="test";
        security="What is the name of the test?";
        answer="The name is test";
                
        RegistrationModel mod = new RegistrationModel(firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer);
    }
}
