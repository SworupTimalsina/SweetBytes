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
    
    public static boolean InsertRegistrationData(RegistrationModel rmodel) {
        /*
        * Inserts the data from registration page to database.
        * @return true if successful.
        * @return false if unsuccessfull with respective error message printed.
        */
        Connection conn=MyConnector.dbConnect();
        
        try{
            Statement stmt=conn.createStatement();
            //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
            String sqlCommand = "insert into creds(f_name, l_name, email, DOB, u_name, pass, securityQ, answer) values('"+rmodel.getFirstName()+"','"+rmodel.getLastName()+"','"+rmodel.getEmail()+"','"+rmodel.getDateOfBirth()+"','"+rmodel.getUsername()+"','"+rmodel.getPassword()+"','"+rmodel.getSecurity()+"','"+rmodel.getAnswer()+"')";
            stmt.executeUpdate(sqlCommand);
            searchRegistrationData(rmodel);// to assign e_id.
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
    
    public static boolean updateRegistrationData(RegistrationModel rmodel){
        /*
        * Updates the conn table.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        
        PreparedStatement preStmt;
        Connection conn = MyConnector.dbConnect();
        
        String sqlCommand="UPDATE creds SET e_id=?, f_name=?, l_name=?, email=?, DOB=?, u_name=?, pass=?, securityQ=?, answer=? WHERE u_name=?";
    
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setInt(1,rmodel.getId());
            preStmt.setString(2,rmodel.getFirstName());
            preStmt.setString(3,rmodel.getLastName());
            preStmt.setString(4,rmodel.getEmail());
            preStmt.setString(5,rmodel.getDateOfBirth());
            preStmt.setString(6,rmodel.getUsername());
            preStmt.setString(7,rmodel.getPassword());
            preStmt.setString(8,rmodel.getSecurity());
            preStmt.setString(9,rmodel.getAnswer());
            preStmt.setString(10, rmodel.getUsername());
            
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
    
    public static boolean deleteRegistrationData(RegistrationModel rmodel){
        /*
        * Deletes a row from the creds table according to the username.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="DELETE FROM creds WHERE u_name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, rmodel.getUsername());
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
    
    public static boolean searchRegistrationData(RegistrationModel rmodel){
        /*
        * Searches for the full detail of the username and sets the value to the rmodel.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="SELECT * FROM creds WHERE u_name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, rmodel.getUsername());
            rs=preStmt.executeQuery();
            if (rs.next()){
                rmodel.setId(Integer.parseInt(rs.getString("e_id")));
                rmodel.setFirstName(rs.getString("f_name"));
                rmodel.setLastName(rs.getString("l_name"));
                rmodel.setEmail(rs.getString("email"));
                rmodel.setDateOfBirth(rs.getString("DOB"));
                rmodel.setUsername(rs.getString("u_name"));
                rmodel.setPassword(rs.getString("pass"));
                rmodel.setSecurityQ(rs.getString("securityQ"));
                rmodel.setAnswer(rs.getString("answer"));
                
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

    public static int find_e_id(RegistrationModel rmodel) throws Exception{
        /*
        * Searches for the e_id  of the username.
        * @return the e_id.
        
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="SELECT * FROM creds WHERE u_name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, rmodel.getUsername());
            rs=preStmt.executeQuery();
            if (rs.next()){
                return Integer.parseInt(rs.getString("e_id"));
            }
            else{
                System.out.println("At CustomerDAO.find_e_id no username in database found");
            }
          
        }
        catch(Exception e){
            System.out.println("Error in CustomerDAO.find_e_id: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CustomerDAO.find_e_id.try: "+e);
            }
         
        }
        throw new Exception("Error at CustomerDAO.find_e_id");
        
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
                
        RegistrationModel rmodel = new RegistrationModel(firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer);
    }
}
