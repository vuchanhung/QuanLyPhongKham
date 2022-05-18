/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
public class ConnectDB {
    private Connection conn;
    
    ConnectDB() {};

    public Connection createConn(){
    try{
    //Đăng ký Driver
    Class.forName("com.mysql.jdbc.Driver");
    // Connection URL
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlkb?useSSL=false&useUnicode=true&characterEndcoding=UTF-8","root","Rancon2001");

    if (conn == null)
                    System.out.println("Kết nối không thành công");
                else
                    System.out.println("Kết nối thành công");
            } catch(Exception e){
                e.printStackTrace();
            }
            return conn;
    }

}
