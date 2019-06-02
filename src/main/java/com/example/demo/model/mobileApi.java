package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class mobileApi {
	@Id
	@GeneratedValue
	private int Id;
	@Override
	public String toString() {
		return "mobileApi [Id=" + Id + ", brand=" + brand + ", model_No=" + model_No + ", price=" + price + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel_No() {
		return model_No;
	}
	public void setModel_No(String model_No) {
		this.model_No = model_No;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	private String brand;
	private String model_No;
	private float price;
}
