package com.app.templates;

import com.app.domain.MemberVO;
import com.app.enumeration.MemberGender;
import com.app.repository.MemberDAO;

public class MemberView {
   public static void main(String[] args) {
      MemberDAO memberDAO = new MemberDAO();
      MemberVO memberVO = new MemberVO();
      
      memberVO.setId(1L);
      memberVO.setMemberEmail("hds1234@gmail.com");
      memberVO.setMemberPassword("5555");
      memberVO.setMemberName("한동석");
      memberVO.setMemberAge(40);
      memberVO.setMemberGender(MemberGender.WOMAN);
//      
//      memberDAO.save(memberVO);
      
//      memberVO.setMemberName("홍길동");
//      
//      memberDAO.setMember(memberVO);
      
//      memberDAO.delete(1L);
      
//      memberDAO.setStatus(2L);
      
//      MemberVO member = memberDAO.findById(2L).orElse(new MemberVO());
//      System.out.println(member);
      
//      memberDAO.findAll().forEach(System.out::println);
   }
}













