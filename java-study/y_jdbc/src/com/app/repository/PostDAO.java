package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.PostVO;
import com.app.dto.MemberPostCountDTO;
import com.app.dto.PostDTO;
import com.app.enumeration.Status;

public class PostDAO {
   
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   
//   추가
   public void save(PostVO postVO) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("insert into tbl_post ");
      stringBuilder.append("(post_title, post_content, member_id) ");
      stringBuilder.append("values(?, ?, ?)");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getMemberId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("save(PostVO) SQL 오류");
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
   public void setPost(PostVO postVO) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("update tbl_post ");
      stringBuilder.append("set post_title = ?, post_content = ?");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("setPost(PostVO) SQL 오류");
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
   public void setPostStatus(Long id) {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("update tbl_post ");
      stringBuilder.append("set post_status = ?");
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
         System.out.println("setPostStatus(Long) SQL 오류");
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
   public Optional<PostDTO> findById(Long id){
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      PostDTO post = null;
      
      stringBuilder.append("update tbl_post ");
      stringBuilder.append("set post_read_count = post_read_count + 1 ");
      stringBuilder.append("where id = ? and post_status = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.setString(2, Status.ENABLE.getValue());
         preparedStatement.executeUpdate();
         
         stringBuilder = new StringBuilder();
         
         stringBuilder.append("select p.id, p.post_title, p.post_content, p.post_read_count, ");
         stringBuilder.append("p.post_status, p.created_datetime, p.updated_datetime, m.member_name ");
         stringBuilder.append("from tbl_member m join tbl_post p ");
         stringBuilder.append("on m.id = p.member_id ");
         stringBuilder.append("where p.id = ? and p.post_status = ?");
         
         query = stringBuilder.toString();
         
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.setString(2, Status.ENABLE.getValue());
         resultSet = preparedStatement.executeQuery();
         if(resultSet.next()) {
            post = new PostDTO();
            
            post.setId(resultSet.getLong("id"));
            post.setPostTitle(resultSet.getString("post_title"));
            post.setPostContent(resultSet.getString("post_content"));
            post.setPostReadCount(resultSet.getInt("post_read_count"));
            post.setPostStatus(resultSet.getString("post_status"));
            post.setCreatedDatetime(resultSet.getString("created_datetime"));
            post.setUpdatedDatetime(resultSet.getString("updated_datetime"));
            post.setMemberName(resultSet.getString("member_name"));
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findById(Long) SQL 오류");
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return Optional.ofNullable(post);
   }
   
   
//   목록
   public ArrayList<PostDTO> findAll(){
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      PostDTO post = null;
      ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
      
      stringBuilder.append("select p.id, p.post_title, p.post_content, p.post_read_count, ");
      stringBuilder.append("p.post_status, p.created_datetime, p.updated_datetime, m.member_name ");
      stringBuilder.append("from tbl_member m join tbl_post p ");
      stringBuilder.append("on m.id = p.member_id ");
      stringBuilder.append("where p.post_status = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, Status.ENABLE.getValue());
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            post = new PostDTO();
            
            post.setId(resultSet.getLong("id"));
            post.setPostTitle(resultSet.getString("post_title"));
            post.setPostContent(resultSet.getString("post_content"));
            post.setPostReadCount(resultSet.getInt("post_read_count"));
            post.setPostStatus(resultSet.getString("post_status"));
            post.setCreatedDatetime(resultSet.getString("created_datetime"));
            post.setUpdatedDatetime(resultSet.getString("updated_datetime"));
            post.setMemberName(resultSet.getString("member_name"));
            
            posts.add(post);
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("findAll() SQL 오류");
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return posts;
   }
   
//   총 게시글 개수
   public int getCount() {
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("select count(*) from tbl_post ");
      stringBuilder.append("where post_status = ?");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, Status.ENABLE.getValue());
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         return resultSet.getInt(1);
         
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("getCount() SQL 오류");
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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
      
      return 0;
   }
   
//   회원별 게시글 작성 수, 회원은 무조건 다 나와야함
   public List<MemberPostCountDTO> getMembersWithPostCount(){
      ArrayList<MemberPostCountDTO> members = new ArrayList<MemberPostCountDTO>();
      
      MemberPostCountDTO memberPostCountDTO = null;
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
      
      stringBuilder.append("select m1.id, m1.member_name, m2.post_count from tbl_member m1 ");
      stringBuilder.append("join ");
      stringBuilder.append("(");
      stringBuilder.append("select m.id, count(p.id) post_count from tbl_member m left outer join tbl_post p ");
      stringBuilder.append("on m.id = p.member_id and p.post_status = ? ");
      stringBuilder.append("group by m.id");
      stringBuilder.append(") m2 ");
      stringBuilder.append("on m1.id = m2.id");
      
      query = stringBuilder.toString();
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, Status.ENABLE.getValue());
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            memberPostCountDTO = new MemberPostCountDTO();
            
            memberPostCountDTO.setId(resultSet.getLong(1));
            memberPostCountDTO.setMemberName(resultSet.getString(2));
            memberPostCountDTO.setPostCount(resultSet.getInt(3));
            
            members.add(memberPostCountDTO);
         }
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("getMembersWithPostCount() SQL 오류");
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
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