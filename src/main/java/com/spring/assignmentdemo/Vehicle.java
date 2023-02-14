package com.spring.assignmentdemo;



  public class Vehicle {
	
    private int brandname;
    private String model;
    private String color;
    
    
    public int getBrandname() {
	return brandname;
    }
   public void setBrandname(int brandname) {
	this.brandname = brandname;
    }
   public String getModel() {
	return model;
   }
   public void setModel(String model) {
	this.model = model;
    }
   public String getColor() {
	return color;
    }
    public void setColor(String color) {
	this.color = color;
    }

    
    public Vehicle(int brandname, String model, String color) {
	super();
	this.brandname = brandname;
	this.model = model;
	this.color = color;
     }


   public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
    }
   
   
    @Override
    public String toString() {
	return "Vehicle [brandname=" + brandname + ", model=" + model + ", color=" + color + "]";
     }











}
