package com.nt.SpringProject;

public class College {
	
	private String name;
	private String city;
	private int zipcode;
	private double percentile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public double getPercentile() {
		return percentile;
	}
	public void setPercentile(double percentile) {
		this.percentile = percentile;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", city=" + city + ", zipcode=" + zipcode + ", percentile=" + percentile + "]";
	}
	
	public void displayInfo() {
		System.out.println("Hello: " + name +" "+ city +" "+ zipcode);
	}
}
