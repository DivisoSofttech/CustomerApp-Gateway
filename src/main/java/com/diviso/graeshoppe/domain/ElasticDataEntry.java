package com.diviso.graeshoppe.domain;

public class ElasticDataEntry {

	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((keyAsString == null) ? 0 : keyAsString.hashCode());
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
		ElasticDataEntry other = (ElasticDataEntry) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (keyAsString == null) {
			if (other.keyAsString != null)
				return false;
		} else if (!keyAsString.equals(other.keyAsString))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ElasticDataEntry [count=" + count + ", key=" + key + ", keyAsString=" + keyAsString + "]";
	}


	public Long getCount() {
		return count;
	}


	public void setCount(Long count) {
		this.count = count;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getKeyAsString() {
		return keyAsString;
	}


	public void setKeyAsString(String keyAsString) {
		this.keyAsString = keyAsString;
	}


	private Long count ;;

	 
	  private String key ;

	
	  private String keyAsString ;

}