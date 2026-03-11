package edu.auis.util.math;

public abstract class Shape {
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	public void displayColor() {
		System.out.println("This shape is " + color + ".");
	}

	public abstract double calculateArea();
}
