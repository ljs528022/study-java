package com.app.templates;

import com.app.domain.PostVO;
import com.app.dto.PostDTO;
import com.app.repository.PostDAO;

public class PostView {
   public static void main(String[] args) {
      PostDAO postDAO = new PostDAO();
      PostVO postVO = new PostVO();
      
//      postVO.setId(1L);
//      postVO.setPostTitle("테스트 제목1");
//      postVO.setPostContent("테스트 내용1");
//      postVO.setMemberId(3L);
//      
//      postDAO.save(postVO);
      
//      postDAO.setPost(postVO);
      
//      postDAO.setPostStatus(1L);
      
//      PostDTO post = postDAO.findById(2L).orElse(null);
//      System.out.println(post);
      
//      postDAO.findAll().forEach(System.out::println);
      
//      System.out.println(postDAO.getCount());
      
//      postDAO.getMembersWithPostCount().stream().filter((dto) -> dto.getPostCount() > 0).forEach(System.out::println);
      postDAO.getMembersWithPostCount().forEach(System.out::println);
   }
}