package ru.davydov.algoritmization.decomposition;

/*9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 * */

// Для нахождения площади четырех уголника сложить площади треугольников

public class Task9 {

	public static void main(String[] args) {
		
		double x = 2;
		double y = 3;
		double z = 4;
		double t = 5;
		
		System.out.println("площадь четурехугольника = " + areaOfFourangle(x, y, z, t));
	}
	
	//площадь четурехуголника, a и b перпендикулярны
	private static double areaOfFourangle(double a, double b, double c, double d) {
		double hypotenys = Math.hypot(a, b);
		
		return areaOfTriangle(a, b, hypotenys) + areaOfTriangle(c, d, hypotenys);
	}
	
	// площадь труегольника по известным сторонам
	private static double areaOfTriangle (double a, double b, double c) {
		
		double p = (a + b + c) / 2;   // полупериметр
		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
