package com.app.domain;

import java.util.Objects;

import com.app.enumeration.Status;

public class PostVO {
   private Long id;
   private String postTitle;
   private String postContent;
   private int postReadCount;
   private Status postStatus;
   private String createdDatetime;
   private String updatedDatetime;
   private Long memberId;
   
   public PostVO() {;}

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getPostTitle() {
      return postTitle;
   }

   public void setPostTitle(String postTitle) {
      this.postTitle = postTitle;
   }

   public String getPostContent() {
      return postContent;
   }

   public void setPostContent(String postContent) {
      this.postContent = postContent;
   }

   public int getPostReadCount() {
      return postReadCount;
   }

   public void setPostReadCount(int postReadCount) {
      this.postReadCount = postReadCount;
   }

   public Status getPostStatus() {
      return postStatus;
   }

   public void setPostStatus(Status postStatus) {
      this.postStatus = postStatus;
   }

   public String getCreatedDatetime() {
      return createdDatetime;
   }

   public void setCreatedDatetime(String createdDatetime) {
      this.createdDatetime = createdDatetime;
   }

   public String getUpdatedDatetime() {
      return updatedDatetime;
   }

   public void setUpdatedDatetime(String updatedDatetime) {
      this.updatedDatetime = updatedDatetime;
   }

   public Long getMemberId() {
      return memberId;
   }

   public void setMemberId(Long memberId) {
      this.memberId = memberId;
   }

   @Override
   public String toString() {
      return "PostVO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postReadCount="
            + postReadCount + ", postStatus=" + postStatus + ", createdDatetime=" + createdDatetime
            + ", updatedDatetime=" + updatedDatetime + ", memberId=" + memberId + "]";
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
      PostVO other = (PostVO) obj;
      return Objects.equals(id, other.id);
   }
}