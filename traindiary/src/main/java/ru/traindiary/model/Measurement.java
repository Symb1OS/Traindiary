package ru.traindiary.model;

import java.math.BigInteger;
import java.util.Date;


public class Measurement{
	
	private BigInteger id;
	private BigInteger bodyPartId;
	private String username;
	private Date date;
	private Double val;
	
	
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public BigInteger getBodyPartId() {
		return bodyPartId;
	}
	public void setBodyPartId(BigInteger bodyPartId) {
		this.bodyPartId = bodyPartId;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getVal() {
		return val;
	}
	public void setVal(Double val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "Measurement [id=" + id + ", bodyPartId=" + bodyPartId
				+ ", username=" + username + ", date=" + date + ", val=" + val
				+ "]";
	}
	
}