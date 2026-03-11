package edu.auis.util.math;

public class Circle extends Shape {

	private final double radius;

	public Circle(String color) {
		super(color);
		radius = 0;
	}

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
