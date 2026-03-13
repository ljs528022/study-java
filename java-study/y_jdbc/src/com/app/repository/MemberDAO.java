package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.enumeration.Status;

public class MemberDAO {
//   내가 설정한 RDB 연결 객체
   private Connection connection;
//   내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
   private PreparedStatement preparedStatement;
//   조회 결과를 담아줄 객체
   private ResultSet resultSet;
   
//   추가
   public void save(MemberVO memberVO) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("insert into tbl_member ");
      stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender) ");
      stringBuilder.append("values(?, ?, ?, ?, ?)");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setInt(4, memberVO.getMemberAge());
         preparedStatement.setString(5, memberVO.getMemberGender().getValue());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("save(MemberVO) SQL문 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
   }
   
//   수정
   public void setMember(MemberVO memberVO) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("update tbl_member ");
      stringBuilder.append("set member_email = ?, member_name = ?, member_age = ?, member_gender = ? ");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberName());
         preparedStatement.setInt(3, memberVO.getMemberAge());
         preparedStatement.setString(4, memberVO.getMemberGender().getValue());
         preparedStatement.setLong(5, memberVO.getId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("setMember(MemberVO) SQL문 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      
   }
   
//   삭제
//   soft delete
   public void setStatus(Long id) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("update tbl_member ");
      stringBuilder.append("set member_status = ? ");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, Status.DISABLE.getValue());
         preparedStatement.setLong(2, id);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("setStatus(Long) SQL 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
   }
   
   
//   hard delete
   public void delete(Long id) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("delete from tbl_member ");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      
      try {
         connection.setAutoCommit(false);
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("delete(Long) SQL 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
   }
   
//   조회
   public Optional<MemberVO> findById(Long id){
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      MemberVO member = null;
      
      stringBuilder.append("select id, member_email, member_password, member_name, member_age, member_gender, member_status, created_datetime, updated_datetime ");
      stringBuilder.append("from tbl_member ");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
            member = new MemberVO();
            
            member.setId(resultSet.getLong("id"));
            member.setMemberEmail(resultSet.getString("member_email"));
            member.setMemberPassword(resultSet.getString("member_password"));
            member.setMemberName(resultSet.getString("member_name"));
            member.setMemberAge(resultSet.getInt("member_age"));
            member.setMemberGender(resultSet.getString("member_gender"));
            member.setMemberStatus(resultSet.getString("member_status"));
            member.setCreatedDatetime(resultSet.getString("created_datetime"));
            member.setUpdatedDatetime(resultSet.getString("updated_datetime"));
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findById(Long) SQL 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return Optional.ofNullable(member);
   }
   
//   목록
   public List<MemberVO> findAll(){
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      MemberVO member = null;
      List<MemberVO> members = new ArrayList<MemberVO>();
      
      stringBuilder.append("select id, member_email, member_password, member_name, member_age, member_gender, member_status, created_datetime, updated_datetime ");
      stringBuilder.append("from tbl_member");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            member = new MemberVO();
            
            member.setId(resultSet.getLong("id"));
            member.setMemberEmail(resultSet.getString("member_email"));
            member.setMemberPassword(resultSet.getString("member_password"));
            member.setMemberName(resultSet.getString("member_name"));
            member.setMemberAge(resultSet.getInt("member_age"));
            member.setMemberGender(resultSet.getString("member_gender"));
            member.setMemberStatus(resultSet.getString("member_status"));
            member.setCreatedDatetime(resultSet.getString("created_datetime"));
            member.setUpdatedDatetime(resultSet.getString("updated_datetime"));
            
            members.add(member);
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findAll() SQL 오류");
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException();
         }
      }
      
      return members;
   }
}