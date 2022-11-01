package com.jap;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class DeleteUpdateStudentData
{

    public Connection getConnection() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection=null;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
        return connection;

    }

    public void deleteStudentData() throws SQLException,ClassNotFoundException {
      // call getConnection() method
        Statement st = getConnection().createStatement();

       
        //execute delete query
    String query = "delete from student where rollno=14";
    st.executeUpdate(query);
    }

    public void updateStudentData() throws SQLException,ClassNotFoundException{
        // call getConnection() method
        Statement st = getConnection().createStatement();

        //execute update query
        String query = "update student set age=20 where age=15";
        st.executeUpdate(query);
    }

    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        DeleteUpdateStudentData salesDataDemo = new DeleteUpdateStudentData();
        salesDataDemo.deleteStudentData();
        salesDataDemo.updateStudentData();
    }
}
