package br.com.openclosedprincipe;

public class Circulo extends Shape {
	
	private final double radius;

	public Circulo(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.radius * this.radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

}
