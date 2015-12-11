package ru.traindiary.model;

import java.math.BigInteger;
import java.util.Date;

public class Measurement {
	
	private BigInteger measurementId;
	private String username;
	private Date date;
	private Double weight;
	private Double neck;
	private Double chest;
	private Double waist;
	private Double buttocks;
	private Double hip;
	private Double cavair;
	private Double pelvis;
	private Double biceps;
	private Double forearm;
	private Double shoulders;
	
	public BigInteger getMeasurementId() {
		return measurementId;
	}
	public void setMeasurementId(BigInteger measurementId) {
		this.measurementId = measurementId;
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
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double getNeck() {
		return neck;
	}
	public void setNeck(Double neck) {
		this.neck = neck;
	}
	public Double getChest() {
		return chest;
	}
	public void setChest(Double chest) {
		this.chest = chest;
	}
	public Double getWaist() {
		return waist;
	}
	public void setWaist(Double waist) {
		this.waist = waist;
	}
	public Double getButtocks() {
		return buttocks;
	}
	public void setButtocks(Double buttocks) {
		this.buttocks = buttocks;
	}
	public Double getHip() {
		return hip;
	}
	public void setHip(Double hip) {
		this.hip = hip;
	}
	public Double getCavair() {
		return cavair;
	}
	public void setCavair(Double cavair) {
		this.cavair = cavair;
	}
	public Double getPelvis() {
		return pelvis;
	}
	public void setPelvis(Double pelvis) {
		this.pelvis = pelvis;
	}
	public Double getBiceps() {
		return biceps;
	}
	public void setBiceps(Double biceps) {
		this.biceps = biceps;
	}
	public Double getForearm() {
		return forearm;
	}
	public void setForearm(Double forearm) {
		this.forearm = forearm;
	}
	public Double getShoulders() {
		return shoulders;
	}
	public void setShoulders(Double shoulders) {
		this.shoulders = shoulders;
	}
	@Override
	public String toString() {
		return "Measurement [measurementId=" + measurementId + ", username="
				+ username + ", date=" + date + ", weight=" + weight
				+ ", neck=" + neck + ", chest=" + chest + ", waist=" + waist
				+ ", buttocks=" + buttocks + ", hip=" + hip + ", cavair="
				+ cavair + ", pelvis=" + pelvis + ", biceps=" + biceps
				+ ", forearm=" + forearm + ", shoulders=" + shoulders + "]";
	}
	
}