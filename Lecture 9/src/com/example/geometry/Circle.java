package com.example.geometry;


public class Circle {
	private int radius;
	double pi = 3.14;
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	void getArea(int radius) {
		double area;
		
		area = 2*pi*radius;
		
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(10);
		circle.getArea(circle.getRadius());
		
		
	}
	
	
}
