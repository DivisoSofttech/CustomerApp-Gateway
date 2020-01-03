package com.diviso.graeshoppe.customerappgateway.domain.search;

public class HeaderResult {

	private String resultType;
	
	private String name;
	
	private String imageLink;

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	@Override
	public String toString() {
		return "HeaderResult [resultType=" + resultType + ", name=" + name + ", imageLink=" + imageLink + "]";
	}
	
}
