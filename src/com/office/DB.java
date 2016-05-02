/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.office;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author APCL
 */
public class DB {
    Connection con=null;
   public Connection getConnect() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/office", "root", "farid");          
       } catch (ClassNotFoundException ex) {
           con=null;
       } catch (SQLException ex) {
          con=null;
       }
        return con;
    }
    
}
