package com.diviso.graeshoppe.customerappgateway.client.store.model;

import java.time.ZonedDateTime;

import org.springframework.validation.annotation.Validated;

/**
 * ReplyDTO
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-12-30T14:09:05.929+05:30[Asia/Kolkata]")

public class Reply   {
 
	
    private Long id;

    private String userName;

    private String reply;

    private ZonedDateTime repliedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public ZonedDateTime getRepliedDate() {
		return repliedDate;
	}

	public void setRepliedDate(ZonedDateTime repliedDate) {
		this.repliedDate = repliedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((repliedDate == null) ? 0 : repliedDate.hashCode());
		result = prime * result + ((reply == null) ? 0 : reply.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reply other = (Reply) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (repliedDate == null) {
			if (other.repliedDate != null)
				return false;
		} else if (!repliedDate.equals(other.repliedDate))
			return false;
		if (reply == null) {
			if (other.reply != null)
				return false;
		} else if (!reply.equals(other.reply))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", userName=" + userName + ", reply=" + reply + ", repliedDate=" + repliedDate + "]";
	}
    
    
    
}