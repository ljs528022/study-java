package com.app.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
   public static Connection getConnection() {
      Connection connection = null;
      
      String username = "test";
      String password = "1234";
      String url = "jdbc:mysql://localhost:3306/jdbc?useSSL=false&serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true";
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(url, username, password);
         System.out.println("연결 성공");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("드라이버 로딩 실패");
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 정보 오류");
      }
      
      return connection;
   }
}









