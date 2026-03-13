package com.app.domain;

import java.util.Objects;

public class MemberFileVO {
   private Long id;
   private String filePath;
   
   public MemberFileVO() {;}

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFilePath() {
      return filePath;
   }

   public void setFilePath(String filePath) {
      this.filePath = filePath;
   }

   @Override
   public String toString() {
      return "MemberFileVO [id=" + id + ", filePath=" + filePath + "]";
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
      MemberFileVO other = (MemberFileVO) obj;
      return Objects.equals(id, other.id);
   }
}