package com.diviso.graeshoppe.client.store.domain;

import java.time.Instant;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModelProperty;

/**
 * Reply
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-17T15:08:38.225+05:30[Asia/Kolkata]")
@Document(indexName = "reply")
public class Reply  {
	
  private Long id = null;


  private Instant repliedDate = null;


  private String reply = null;

 
  private Long reviewId = null;

  
  private String userName = null;

  public Reply id(Long id) {
    this.id = id;
    return this;
  }


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Reply repliedDate(Instant repliedDate) {
    this.repliedDate = repliedDate;
    return this;
  }

  public Instant getRepliedDate() {
    return repliedDate;
  }

  public void setRepliedDate(Instant repliedDate) {
    this.repliedDate = repliedDate;
  }

  public Reply reply(String reply) {
    this.reply = reply;
    return this;
  }

  /**
   * Get reply
   * @return reply
  **/
  @ApiModelProperty(value = "")


  public String getReply() {
    return reply;
  }

  public void setReply(String reply) {
    this.reply = reply;
  }

  public Reply reviewId(Long reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * Get reviewId
   * @return reviewId
  **/
  @ApiModelProperty(value = "")


  public Long getReviewId() {
    return reviewId;
  }

  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }

  public Reply userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(value = "")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((repliedDate == null) ? 0 : repliedDate.hashCode());
	result = prime * result + ((reply == null) ? 0 : reply.hashCode());
	result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
	result = prime * result + ((userName == null) ? 0 : userName.hashCode());
	return result;
}

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reply {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repliedDate: ").append(toIndentedString(repliedDate)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

