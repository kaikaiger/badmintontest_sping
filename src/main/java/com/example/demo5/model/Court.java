package com.example.demo5.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Court {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private boolean morning;
	private boolean afternoon;
	private Integer morningRenterId;
	private Integer afternoonRenterId;
	private String area;
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMorning() {
		return morning;
	}
	public void setMorning(boolean morning) {
		this.morning = morning;
	}
	public boolean isAfternoon() {
		return afternoon;
	}
	public void setAfternoon(boolean afternoon) {
		this.afternoon = afternoon;
	}
	public Integer getMorningRenterId() {
		return morningRenterId;
	}
	public void setMorningRenterId(Integer morningRenterId) {
		this.morningRenterId = morningRenterId;
	}
	public Integer getAfternoonRenterId() {
		return afternoonRenterId;
	}
	public void setAfternoonRenterId(Integer afternoonRenterId) {
		this.afternoonRenterId = afternoonRenterId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}
