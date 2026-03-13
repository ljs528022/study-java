package com.app.dto;

import java.util.Objects;

public class MemberPostCountDTO {
   private Long id;
   private String memberName;
   private int postCount;
   
   public MemberPostCountDTO() {;}

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getMemberName() {
      return memberName;
   }

   public void setMemberName(String memberName) {
      this.memberName = memberName;
   }

   public int getPostCount() {
      return postCount;
   }

   public void setPostCount(int postCount) {
      this.postCount = postCount;
   }

   @Override
   public String toString() {
      return "MemberPostCountDTO [id=" + id + ", memberName=" + memberName + ", postCount=" + postCount + "]";
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      MemberPostCountDTO other = (MemberPostCountDTO) obj;
      return Objects.equals(id, other.id);
   }
}
