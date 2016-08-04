package br.com.openclosedprincipe;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Retangulo retangulo = new Retangulo(100.0f, 25.0f);
		Retangulo retangulo2 = new Retangulo(50.0f, 25.0f);
		Circulo circulo = new Circulo(5.0f);
		Circulo circulo2 = new Circulo(5.0f);
		
		List<Shape> listShape = new ArrayList<>();
		listShape.add(retangulo);
		listShape.add(retangulo2);
		listShape.add(circulo);
		listShape.add(circulo2);
		
		for (Shape shape : listShape) {
			System.out.println(shape.area());
		}

	}

}
