package br.com.openclosedprincipe;

public class Retangulo extends Shape {
	
	private final double width;
	private final double height;

	public Retangulo(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getHeight() *  this.getWidth();
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

}
